package com.example.iit.androidnewsappspl2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//import com.example.iit.androidnewsappspl2.Common.Common;
//import com.example.iit.androidnewsappspl2.Interface.IconBetterIdeaService;
//import com.example.iit.androidnewsappspl2.Interface.ItemClickListener;
//import com.example.iit.androidnewsappspl2.ListNews;
//import com.example.iit.androidnewsappspl2.Model.IconBetterIdea;
//import com.example.iit.androidnewsappspl2.Model.WebSite;
//import com.squareup.picasso.Picasso;

//import de.hdodenhof.circleimageview.CircleImageView;
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;

/**
 * Created by reale on 10/4/2017.
 */


public class ListBlockSourcesAdapter extends RecyclerView.Adapter<ListBlockSourcesAdapter.ListSourceViewHolder>{
    private Context context;
    private ArrayList<String> sources=new ArrayList<String>();
    private ArrayList<String>blockSources=new ArrayList<String>();
    //private ArrayList<String> deletArrayList =new ArrayList<String>();
    private int count;

    //private IconBetterIdeaService mService;

    public ListBlockSourcesAdapter(Context context, ArrayList<String> sources,ArrayList<String>blockSources) {
        this.context = context;
        this.blockSources=blockSources;
        this.sources = sources;
        //this.count=count;
        // mService = Common.getIconService();
    }

    @Override
    public ListSourceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.each_block_source_view,parent,false);
        return new ListSourceViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ListSourceViewHolder holder, int position) {



        holder.source_name.setText(sources.get(position));
        //holder.delete.setImageResource(R.drawable.copy);
        //if(position<count)holder.likeOrblock.setImageResource(R.drawable.block);
        //else holder.likeOrblock.setImageResource(R.drawable.like);
        if(blockSources.contains(sources.get(position)))holder.dislikeOrNot.setImageResource(R.drawable.dislike_1);
        else holder.dislikeOrNot.setImageResource(R.drawable.dislike);
        holder.setListeners();
    }

    @Override
    public int getItemCount() {
        return sources.size();
    }
    class ListSourceViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener
    {
        //ItemClickListener itemClickListener;

        TextView source_name;
        ImageView dislikeOrNot;
        //ImageView copy;
        //CircleImageView source_image;

        @SuppressLint("NewApi")
        public ListSourceViewHolder(View itemView) {
            super(itemView);

            //source_image = (CircleImageView) itemView.findViewById(R.id.source_image);
            source_name = (TextView)itemView.findViewById(R.id.source_name);
            dislikeOrNot=(ImageView)itemView.findViewById(R.id.dislikeOrNot);
//            delete.setImageResource(R.drawable.delete);
//            copy = (ImageView)itemView.findViewById(R.id.copy);
//            copy.setImageResource(R.drawable.copy);
            // itemView=(ImageView)itemView.findViewById(R.id.img);
            //itemView.setOnClickListener(this);
        }

        public void setListeners() {
            // delete.setOnClickListener(ListSourceViewHolder.this);
            //copy.setOnClickListener(ListSourceViewHolder.this);
            //this.itemClickListener = itemClickListener;
            dislikeOrNot.setOnClickListener(ListSourceViewHolder.this);
        }

        @Override
        public void onClick(View view) {
//            switch ((view.getId().s)){
//                case R.id.delete :
//                    removeItem(getAdapterPosition(),webSite.get(getAdapterPosition()));
//                    break;
//                case R.id.copy:
//                    addItem(getAdapterPosition());
//            }
            //itemClickListener.onClick(view,getAdapterPosition(),false);
            //if(getAdapterPosition()<count)removeItem(getAdapterPosition(),sources.get(getAdapterPosition()));
            // else addItem(getAdapterPosition(),sources.get(getAdapterPosition()));
            if(blockSources.contains(sources.get(getAdapterPosition()))){

                dislikeOrNot.setImageResource(R.drawable.dislike);
                blockSources.remove(sources.get(getAdapterPosition()));
            }
            else {
                dislikeOrNot.setImageResource(R.drawable.dislike_1);
                blockSources.add(sources.get(getAdapterPosition()));
            }

        }
    }

    public void removeItem(int position,String removeItemName){
//        sources.remove(position);
//        notifyItemRemoved(position);
//        notifyItemRangeChanged(position,sources.size());
//        count=count-1;
//        sources.add(count,removeItemName);
//        notifyItemInserted(count);
//        notifyItemRangeChanged(count,sources.size());
        //notifyDataSetChanged();
    }
    public void addItem(int position,String addItemName){
//        sources.remove(position);
//        notifyItemRemoved(position);
//        notifyItemRangeChanged(position,sources.size());
//        count=count+1;
//        sources.add(count-1,addItemName);
//        notifyItemInserted(count-1);
//        notifyItemRangeChanged(count-1,sources.size());
        //notifyDataSetChanged();
    }

}
