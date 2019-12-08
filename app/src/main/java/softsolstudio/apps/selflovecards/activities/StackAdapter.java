package softsolstudio.apps.selflovecards.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import softsolstudio.apps.selflovecards.R;
import softsolstudio.apps.selflovecards.fragments.CardDetailFragment;

import static java.security.AccessController.getContext;

public class StackAdapter extends RecyclerView.Adapter<StackAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<String> datas;
    private Context context;
    private List<Integer> imageUrls = Arrays.asList(
            R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback,
            R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback, R.drawable.redback,
            R.drawable.back,
            R.drawable.greenback


    );
    private boolean vertical;

    public StackAdapter(List<String> datas) {
        this.datas = datas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (inflater == null) {
            context = parent.getContext();
            inflater = LayoutInflater.from(parent.getContext());
        }
        return new ViewHolder(inflater.inflate(R.layout.item_card, parent, false));
    }

    public StackAdapter vertical() {
        this.vertical = true;
        return this;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Glide.with(context).load(imageUrls.get(position)).into(holder.cover);
        //holder.index.setText(datas.get(holder.getAdapterPosition()));
    }

    @Override
    public int getItemCount() {
        return datas == null ? 0 : datas.size();

    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView cover;
        TextView index;

        public ViewHolder(View itemView) {
            super(itemView);
            cover = (ImageView) itemView.findViewById(R.id.cover);
            index = (TextView) itemView.findViewById(R.id.index);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Toast.makeText(context.getApplicationContext(), String.valueOf(getAdapterPosition()), Toast.LENGTH_SHORT).show();
                    final int min = 1;
                    final int max = 66;
                    final int random = new Random().nextInt((max - min) + 1) + min;
                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
                    Fragment myFragment = new CardDetailFragment();
                    Bundle args = new Bundle();
                    args.putString("id", String.valueOf(random));
                    myFragment.setArguments(args);
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, myFragment).addToBackStack(null).commit();
                }
            });
        }
    }
}
