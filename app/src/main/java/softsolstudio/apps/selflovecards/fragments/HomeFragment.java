package softsolstudio.apps.selflovecards.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import java.util.Random;

import softsolstudio.apps.selflovecards.R;
import softsolstudio.apps.selflovecards.activities.BuyActivity;
import softsolstudio.apps.selflovecards.activities.SharedPrefManager;

public class HomeFragment extends Fragment implements View.OnClickListener{
    View view;
    TextView close_tv;
    Button browse_btn,readings_btn,about_btn,draw_btn;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.home_fragment,container,false);
        initialization();
        return view;
    }
    private void initialization() {
        browse_btn=view.findViewById(R.id.browse_btn);
        readings_btn=view.findViewById(R.id.readings_btn);
        close_tv=view.findViewById(R.id.close_tv);
        about_btn=view.findViewById(R.id.about_btn);
        draw_btn=view.findViewById(R.id.draw_btn);
        close_tv.setOnClickListener(this);
        readings_btn.setOnClickListener(this);
        browse_btn.setOnClickListener(this);
        about_btn.setOnClickListener(this);
        draw_btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.readings_btn:
                final String subscriptionPlan = SharedPrefManager.getString(getActivity(), SharedPrefManager.PREF_TAKEN_SUBSCRIPTION_PLAN, "");
                Toast.makeText(getContext(), "plan is "+subscriptionPlan, Toast.LENGTH_SHORT).show();
                final int min = 1;
                if (subscriptionPlan.equalsIgnoreCase("paid")){
                    final int max = 66;
                    final int random = new Random().nextInt((max - min) + 1) + min;
                    CardDetailFragment fragment=new CardDetailFragment();
                    Bundle args3 = new Bundle();
                    args3.putString("id", String.valueOf(random));
                    fragment.setArguments(args3);
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.main_frame, fragment);
                    fragmentTransaction.addToBackStack("forgetpass_fragment1");
                    fragmentTransaction.commit();
                }else {
                    final int max = 11;
                    final int random = new Random().nextInt((max - min) + 1) + min;
                    CardDetailFragment fragment=new CardDetailFragment();
                    Bundle args3 = new Bundle();
                    args3.putString("id", String.valueOf(random));
                    fragment.setArguments(args3);
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.main_frame, fragment);
                    fragmentTransaction.addToBackStack("forgetpass_fragment1");
                    fragmentTransaction.commit();
                }
                break;
            case R.id.browse_btn:
                browseFragment fragment3=new browseFragment();
                //Bundle args3 = new Bundle();
                //args3.putString("lebal", "Day Challenge");
                //fragment3.setArguments(args3);
                FragmentTransaction fragmentTransaction3 = getFragmentManager().beginTransaction();
                fragmentTransaction3.replace(R.id.main_frame, fragment3);
                fragmentTransaction3.addToBackStack("forgetpass_fragment1");
                fragmentTransaction3.commit();
                break;
            case R.id.close_tv:
                getActivity().finish();
                break;
            case R.id.draw_btn:
                Intent intent=new Intent(getContext(), BuyActivity.class);
                startActivity(intent);
                break;
            case R.id.about_btn:
                AboutUs frag=new AboutUs();
                //Bundle args3 = new Bundle();
                //args3.putString("lebal", "Day Challenge");
                //fragment3.setArguments(args3);
                FragmentTransaction fragmentTransaction1 = getFragmentManager().beginTransaction();
                fragmentTransaction1.replace(R.id.main_frame, frag);
                fragmentTransaction1.addToBackStack("forgetpass_fragment1");
                fragmentTransaction1.commit();
                break;
        }
    }
}
