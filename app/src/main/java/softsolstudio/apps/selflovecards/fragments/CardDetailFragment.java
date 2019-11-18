package softsolstudio.apps.selflovecards.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.Toast;


import androidx.fragment.app.Fragment;

import softsolstudio.apps.selflovecards.R;

public class  CardDetailFragment extends Fragment {
    View view;
    int id;
    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.card_detail_fragment,container,false);
        if (getArguments() != null) {
            id= Integer.parseInt(getArguments().getString("id"));
        } else {
            Toast.makeText(getActivity(), "Basic info not save", Toast.LENGTH_SHORT).show();
        }
        initialization();
        return view;
    }

    private void initialization() {
        imageView=view.findViewById(R.id.carddetail);
        Animation aniFade = AnimationUtils.loadAnimation(getActivity(),R.anim.image_rotation);
        imageView.startAnimation(aniFade);
        setImage(id);
    }

    private void setImage(int id) {
       switch (id)
       {
           case 0:
               imageView.setBackgroundResource(R.drawable.wow);
               break;
           case 1:
               imageView.setBackgroundResource(R.drawable.inspire);
               break;
           case 2:
               imageView.setBackgroundResource(R.drawable.feed);
               break;
           case 3:
               imageView.setBackgroundResource(R.drawable.smile);
               break;
           case 4:
               imageView.setBackgroundResource(R.drawable.applaud);
               break;
           case 5:
               imageView.setBackgroundResource(R.drawable.sweeten);
               break;
           case 6:
               imageView.setBackgroundResource(R.drawable.soften);
               break;
           case 7:
               imageView.setBackgroundResource(R.drawable.beyou);
               break;
           case 8:
               imageView.setBackgroundResource(R.drawable.rock);
               break;
           case 9:
               imageView.setBackgroundResource(R.drawable.hydrate);
               break;
           case 10:
               imageView.setBackgroundResource(R.drawable.yoga);
               break;
           case 11:
               imageView.setBackgroundResource(R.drawable.cool);
               break;
           case 12:
               imageView.setBackgroundResource(R.drawable.captivate);
               break;
           case 13:
               imageView.setBackgroundResource(R.drawable.dream);
               break;
           case 14:
               imageView.setBackgroundResource(R.drawable.doyou);
               break;
           case 15:
               imageView.setBackgroundResource(R.drawable.celebrate);
               break;
           case 16:
               imageView.setBackgroundResource(R.drawable.empower);
               break;
           case 17:
               imageView.setBackgroundResource(R.drawable.embrace);
               break;
           case 18:
               imageView.setBackgroundResource(R.drawable.challengeyou);
               break;
           case 19:
               imageView.setBackgroundResource(R.drawable.enlighten);
               break;
           case 20:
               imageView.setBackgroundResource(R.drawable.energize);
               break;
           case 21:
               imageView.setBackgroundResource(R.drawable.cheer);
               break;
           case 22:
               imageView.setBackgroundResource(R.drawable.expand);
               break;
           case 23:
               imageView.setBackgroundResource(R.drawable.engage);
               break;
           case 24:
               imageView.setBackgroundResource(R.drawable.color);
               break;
           case 25:
               imageView.setBackgroundResource(R.drawable.explore);
               break;
           case 26:
               imageView.setBackgroundResource(R.drawable.adorn);
               break;
           case 27:
               imageView.setBackgroundResource(R.drawable.date);
               break;
           case 28:
               imageView.setBackgroundResource(R.drawable.forgiveyou);
               break;
           case 29:
               imageView.setBackgroundResource(R.drawable.bliss);
               break;
           case 30:
               imageView.setBackgroundResource(R.drawable.express);
               break;
           case 31:
               imageView.setBackgroundResource(R.drawable.hayyou);
               break;
           case 32:
               imageView.setBackgroundResource(R.drawable.know);
               break;
           case 33:
               imageView.setBackgroundResource(R.drawable.funnt);
               break;
           case 34:
               imageView.setBackgroundResource(R.drawable.acceptyou);
               break;
           case 35:
               imageView.setBackgroundResource(R.drawable.loveyou);
               break;
           case 36:
               imageView.setBackgroundResource(R.drawable.giveyou);
               break;
           case 37:
               imageView.setBackgroundResource(R.drawable.learnyou);
               break;
           case 38:
               imageView.setBackgroundResource(R.drawable.outside);
               break;
           case 39:
               imageView.setBackgroundResource(R.drawable.jump);
               break;
           case 40:
               imageView.setBackgroundResource(R.drawable.motivateyou);
               break;
           case 41:
               imageView.setBackgroundResource(R.drawable.pamper);
               break;
           case 42:
               imageView.setBackgroundResource(R.drawable.magic);
               break;
           case 43:
               imageView.setBackgroundResource(R.drawable.quietyou);
               break;
           case 44:
               imageView.setBackgroundResource(R.drawable.rrest);
               break;
           case 45:
               imageView.setBackgroundResource(R.drawable.move);
               break;
           case 46:
               imageView.setBackgroundResource(R.drawable.relax);
               break;
           case 47:
               imageView.setBackgroundResource(R.drawable.shock);
               break;
           case 48:
               imageView.setBackgroundResource(R.drawable.release);
               break;
           case 49:
               imageView.setBackgroundResource(R.drawable.reset);
               break;
           case 50:
               imageView.setBackgroundResource(R.drawable.sing);
               break;
           case 51:
               imageView.setBackgroundResource(R.drawable.caress);
               break;
           case 52:
               imageView.setBackgroundResource(R.drawable.reveal);
               break;
           case 53:
               imageView.setBackgroundResource(R.drawable.sweat);
               break;
           case 54:
               imageView.setBackgroundResource(R.drawable.befriend);
               break;
           case 55:
               imageView.setBackgroundResource(R.drawable.thankyou);
               break;
           case 56:
               imageView.setBackgroundResource(R.drawable.balance);
               break;
           case 57:
               imageView.setBackgroundResource(R.drawable.ask);
               break;
           case 58:
               imageView.setBackgroundResource(R.drawable.unplug);
               break;
           case 59:
               imageView.setBackgroundResource(R.drawable.treat);
               break;
           case 60:
               imageView.setBackgroundResource(R.drawable.stimulate);
               break;
           case 61:
               imageView.setBackgroundResource(R.drawable.visualize);
               break;
           case 62:
               imageView.setBackgroundResource(R.drawable.yes);
               break;
           case 63:
               imageView.setBackgroundResource(R.drawable.tickle);
               break;
           case 64:
               imageView.setBackgroundResource(R.drawable.adventure);
               break;
           case 65:
               imageView.setBackgroundResource (R.drawable.calmyou);
               break;
       }
    }
}
