package com.jfcodes.plateformesupinfo.FilesHelperClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jfcodes.plateformesupinfo.R;

import java.util.ArrayList;

public class adapterfiles extends RecyclerView.Adapter<adapterfiles.FilesViewHold>  {

    ArrayList<com.jfcodes.plateformesupinfo.FilesHelperClasses.filespecs> fileslocation;
    private final ListItemClickListener mOnClickListener;

    public adapterfiles(ArrayList<filespecs> fileslocation, ListItemClickListener listener) {
        this.fileslocation = fileslocation;
        mOnClickListener = listener;
    }

    @NonNull

    @Override
    public FilesViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.filesrecyclercard, parent, false);
        return new FilesViewHold(view);

    }

    @Override
    public void onBindViewHolder(@NonNull FilesViewHold holder, int position) {
        filespecs filespecs = fileslocation.get(position);
        holder.Detail.setText(filespecs.getFileDetail());
        holder.Name.setText(filespecs.getFileName());
        holder.relativeLayout.setBackground(filespecs.getgradient());
    }

    @Override
    public int getItemCount() {
        return fileslocation.size();

    }

    public interface ListItemClickListener {
        void onfileListClick(int clickedItemIndex);
    }

    public class FilesViewHold extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView Name;
        TextView Detail;
        RelativeLayout relativeLayout;


        public FilesViewHold(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            //hooks
            Name = itemView.findViewById(R.id.filetitle);
            Detail = itemView.findViewById(R.id.filedetail);
            relativeLayout = itemView.findViewById(R.id.background_color);

        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            mOnClickListener.onfileListClick(clickedPosition);
        }
    }

}
