package softsolstudio.apps.selflovecards.fragments;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import softsolstudio.apps.selflovecards.R;
import softsolstudio.apps.selflovecards.activities.Align;
import softsolstudio.apps.selflovecards.activities.Config;
import softsolstudio.apps.selflovecards.activities.SharedPrefManager;
import softsolstudio.apps.selflovecards.activities.StackAdapter;
import softsolstudio.apps.selflovecards.activities.StackAdapter2;
import softsolstudio.apps.selflovecards.activities.StackLayoutManager;

public class browseFragment extends Fragment {
    View view;
    RecyclerView recyclerView1;
    StackLayoutManager layoutManager;
    String flag="free";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.browse_fragment,container,false);
        initialaization();
        return view;
    }

    private void initialaization() {
        recyclerView1=view.findViewById(R.id.recyclerview1);
        resetRight();
    }

    public void resetRight() {
        List<String> datas = new ArrayList<>();
        if (flag.equalsIgnoreCase("free")){
            for (int i = 0; i < 12; i++) {
                datas.add(String.valueOf(i));
            }
        }else {
            for (int i = 0; i < 66; i++) {
                datas.add(String.valueOf(i));
            }
        }


        Config config = new Config();
        config.secondaryScale = 0.8f;
        config.scaleRatio = 0.9f;
        config.maxStackCount = 4;
        config.initialStackCount = 22;
        config.space = getResources().getDimensionPixelOffset(R.dimen.item_space);

        config.align = Align.RIGHT;
        recyclerView1.setLayoutManager(new StackLayoutManager(config));
        final String subscriptionPlan = SharedPrefManager.getString(getActivity(), SharedPrefManager.PREF_TAKEN_SUBSCRIPTION_PLAN, "");
        Toast.makeText(getContext(), "plan is "+subscriptionPlan, Toast.LENGTH_SHORT).show();
        if (subscriptionPlan.equalsIgnoreCase("paid")){
            recyclerView1.setAdapter(new StackAdapter(datas));
        }else {
            recyclerView1.setAdapter(new StackAdapter2(datas));
        }

    }
}
