package softsolstudio.apps.selflovecards.fragments;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import softsolstudio.apps.selflovecards.R;
import softsolstudio.apps.selflovecards.utils.constants;

public class AboutUs extends Fragment {
    View view;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.about_us,container,false);
        textView = view.findViewById(R.id.tv_terms);
        textView.setText(Html.fromHtml(constants.termsAndUse));
        return view;
    }
}
