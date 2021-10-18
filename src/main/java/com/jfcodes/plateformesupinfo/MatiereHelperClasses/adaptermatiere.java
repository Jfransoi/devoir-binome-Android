package com.jfcodes.plateformesupinfo.MatiereHelperClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.jfcodes.plateformesupinfo.R;
import java.util.ArrayList;

public class adaptermatiere extends RecyclerView.Adapter<adaptermatiere.MatiereViewHold>  {

    ArrayList<matierespecs> matierelocation;
    final private ListItemClickListener mOnClickListener;

    public adaptermatiere(ArrayList<matierespecs> matierelocation, ListItemClickListener listener) {
        this.matierelocation = matierelocation;
        mOnClickListener = listener;
    }

    @NonNull

    @Override
    public MatiereViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.matiererecyclercard, parent, false);
        return new MatiereViewHold(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MatiereViewHold holder, int position) {


        matierespecs matierespecs = matierelocation.get(position);
        holder.detail.setText(matierespecs.getDetail());
        holder.title.setText(matierespecs.getTitle());
        holder.relativeLayout.setBackground(matierespecs.getgradient());
    }

    @Override
    public int getItemCount() {
        return matierelocation.size();

    }

    public interface ListItemClickListener {
        void onmatiereListClick(int clickedItemIndex);
    }

    public class MatiereViewHold extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title;
        TextView detail;
        RelativeLayout relativeLayout;


        public MatiereViewHold(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            //hooks
            title = itemView.findViewById(R.id.matieretitle);
            detail = itemView.findViewById(R.id.matieredetail);
            relativeLayout = itemView.findViewById(R.id.background_color);

        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            mOnClickListener.onmatiereListClick(clickedPosition);
        }
    }

}
