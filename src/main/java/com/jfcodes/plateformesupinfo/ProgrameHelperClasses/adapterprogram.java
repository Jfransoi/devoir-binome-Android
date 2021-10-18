package com.jfcodes.plateformesupinfo.ProgrameHelperClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jfcodes.plateformesupinfo.ProfPanel;
import com.jfcodes.plateformesupinfo.R;
import java.util.ArrayList;

public class adapterprogram extends RecyclerView.Adapter<adapterprogram.ProgramViewHold>  {

    ArrayList<programspecs> programlocation;
    final private ListItemClickListener mOnClickListener;

    public adapterprogram(ArrayList<programspecs> programlocation, ProfPanel listener) {
        this.programlocation = programlocation;
        mOnClickListener = listener;
    }

    @NonNull

    @Override
    public ProgramViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.programecyclercard, parent, false);
        return new ProgramViewHold(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ProgramViewHold holder, int position) {


        programspecs programspecs = programlocation.get(position);
        holder.progdetail.setText(programspecs.getProgDetail());
        holder.progtitle.setText(programspecs.getProgTitle());
        holder.relativeLayout.setBackground(programspecs.getgradient());
    }

    @Override
    public int getItemCount() {
        return programlocation.size();

    }

    public interface ListItemClickListener {
        void onprogListClick(int clickedItemIndex);
    }

    public class ProgramViewHold extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView progtitle;
        TextView progdetail;
        RelativeLayout relativeLayout;


        public ProgramViewHold(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            //hooks
            progtitle = itemView.findViewById(R.id.programtitle);
            progdetail = itemView.findViewById(R.id.programdetail);
            relativeLayout = itemView.findViewById(R.id.side_bar_color);

        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            mOnClickListener.onprogListClick(clickedPosition);
        }
    }

}
