package softsolstudio.apps.selflovecards.activities;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;

import java.util.ArrayList;
import java.util.List;

import softsolstudio.apps.selflovecards.R;

public class BuyActivity extends AppCompatActivity implements PurchasesUpdatedListener {
    Button button_buy;
    private final String TOKEN5_SKU = "android.test.purchased";
    ProgressDialog dialog;
    private final int TOKEN5 = 5;
    String flag="paid";

    private final String TAG = "InAPP_TAG";
    private BillingClient billingClient;
    private SkuDetails token5SkuDetails;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_activity);
        initialization();
    }

    private void initialization() {
        button_buy=findViewById(R.id.buy_btn);
        button_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startBilling(TOKEN5);
                //Toast.makeText(BuyActivity.this, "hello", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        initBillingClient();
    }
    private void initBillingClient() {
        billingClient = BillingClient.newBuilder(this).setListener(this).build();
        billingClient.startConnection(new BillingClientStateListener() {
            @Override
            public void onBillingSetupFinished(@BillingClient.BillingResponse int billingResponseCode) {
                if (billingResponseCode == BillingClient.BillingResponse.OK) {
                    // The BillingClient is ready. You can query purchases here.

                    List<String> skuList = new ArrayList<>();
                    skuList.add(TOKEN5_SKU);


                    SkuDetailsParams.Builder params = SkuDetailsParams.newBuilder();
                    params.setSkusList(skuList).setType(BillingClient.SkuType.INAPP);
                    billingClient.querySkuDetailsAsync(params.build(),
                            new SkuDetailsResponseListener() {
                                @Override
                                public void onSkuDetailsResponse(int responseCode, List<SkuDetails> skuDetailsList) {
                                    // Process the result.
                                    if (responseCode == BillingClient.BillingResponse.OK && skuDetailsList != null) {
                                        for (SkuDetails skuDetails : skuDetailsList) {
                                            String sku = skuDetails.getSku();
                                            String price = skuDetails.getPrice();
                                            String priceUnit = skuDetails.getPriceCurrencyCode();
                                            long priceMicro = skuDetails.getPriceAmountMicros();
                                            double priceDouble = (double) priceMicro / 1000000;
                                            double pricePerMonDouble = priceDouble / 3;

                                            //These are prices values as per current device currency, you can set text accordingly in respective country.
                                            Log.e("priceMicro", String.valueOf(priceMicro));
                                            System.out.println("=====priceDouble=====" + priceDouble);
                                            System.out.println("=====pricePerMonDouble=====" + pricePerMonDouble);

                                            String title = skuDetails.getTitle();

                                            Log.e("sufyan", String.valueOf(sku));

                                            if (TOKEN5_SKU.equals(sku)) {
                                                token5SkuDetails = skuDetails;
                                            }
                                        }
                                    }
                                }
                            });

                    List<com.android.billingclient.api.Purchase> purchasesList = billingClient.queryPurchases(BillingClient.SkuType.INAPP).getPurchasesList();
                    if (purchasesList != null) {
                        for (final com.android.billingclient.api.Purchase purchase : purchasesList) {
                            if (purchase.getSku().equals(TOKEN5_SKU)) {
                                billingClient.consumeAsync(purchase.getPurchaseToken(), new ConsumeResponseListener() {
                                    @Override
                                    public void onConsumeResponse(int responseCode, String purchaseToken) {

                                        Log.e("responseCode:", String.valueOf(responseCode));
                                        Log.e("purchaseToken:", String.valueOf(purchaseToken));


                                    }
                                });
                            }
                            Log.e("========home======", purchase.getSku());
                        }
                    }
                }
            }

            @Override
            public void onBillingServiceDisconnected() {
                // Try to restart the connection on the next request to
                // Google Play by calling the startConnection() method.
            }
        });
    }

    @Override
    public void onPurchasesUpdated(int responseCode, @Nullable final List<Purchase> purchases) {
        if ((responseCode == BillingClient.BillingResponse.OK || responseCode == BillingClient.BillingResponse.ITEM_ALREADY_OWNED) && purchases != null) {
            for (final com.android.billingclient.api.Purchase purchase : purchases) {
                billingClient.consumeAsync(purchase.getPurchaseToken(), new ConsumeResponseListener() {
                    @Override
                    public void onConsumeResponse(int responseCode, String purchaseToken) {

                        // consumeItNew(purchase);
                        handlePurchase(purchase);
                        Toast.makeText(BuyActivity.this, "OK DONE", Toast.LENGTH_SHORT).show();
                        Log.e("purchase_", String.valueOf(purchases));
                    }
                });
            }
        } else if (responseCode == BillingClient.BillingResponse.USER_CANCELED) {
            complain("Action has been cancelled by user.");
        } else if (responseCode == BillingClient.BillingResponse.BILLING_UNAVAILABLE) {
            complain("BILLING_UNAVAILABLE.");
        } else if (responseCode == BillingClient.BillingResponse.DEVELOPER_ERROR) {
            complain("DEVELOPER_ERROR.");
        } else if (responseCode == BillingClient.BillingResponse.ERROR) {
            complain("ERROR.");
        } else if (responseCode == BillingClient.BillingResponse.FEATURE_NOT_SUPPORTED) {
            complain("FEATURE_NOT_SUPPORTED.");
        } else if (responseCode == BillingClient.BillingResponse.ITEM_NOT_OWNED) {
            complain("ITEM_NOT_OWNED.");
        } else if (responseCode == BillingClient.BillingResponse.ITEM_UNAVAILABLE) {
            complain("ITEM_UNAVAILABLE.");
        } else if (responseCode == BillingClient.BillingResponse.SERVICE_DISCONNECTED) {
            complain("SERVICE_DISCONNECTED.");
        } else if (responseCode == BillingClient.BillingResponse.SERVICE_TIMEOUT) {
            complain("SERVICE_TIMEOUT.");
        } else if (responseCode == BillingClient.BillingResponse.SERVICE_UNAVAILABLE) {
            complain("SERVICE_UNAVAILABLE.");
        } else {
            complain("Couldn't process at time, please try later.");
        }
    }

    private void handlePurchase(Purchase purchase) {
        SharedPrefManager.saveString(this, SharedPrefManager.PREF_TAKEN_SUBSCRIPTION_PLAN, flag);
        alert("You have successfully buy full version.", true);
    }

    private void startBilling(int TOKEN5) {
        //Toast.makeText(this, "To"+TOKEN5, Toast.LENGTH_SHORT).show();
        if (token5SkuDetails != null) {
            BillingFlowParams new1FlowParams = BillingFlowParams.newBuilder()
                    .setSkuDetails(token5SkuDetails)
                    .build();
            billingClient.launchBillingFlow(this, new1FlowParams);
            //Toast.makeText(this, "Token"+TOKEN5, Toast.LENGTH_SHORT).show();

        } else {
            //Toast.makeText(this, String.valueOf(token5SkuDetails), Toast.LENGTH_SHORT).show();
        }
    }
    private void complain(String message) {
        Log.e(TAG, "**** Consume Error: " + message);
        //alert("Error: " + message);
    }
    private void alert(String message, final boolean isSuccess) {
        AlertDialog.Builder bld = new AlertDialog.Builder(this);
        bld.setMessage(message);
        bld.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                if (isSuccess) {
                    Intent intent = new Intent(BuyActivity.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                    finish();
                }
            }
        });
        bld.create().show();
    }
}
