package com.webbed.rankit.newbie.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.webbed.rankit.newbie.R;

import java.util.List;

/**
 * Created by R Ankit on 1/25/2015.
 */
public class NavigationAdapter extends RecyclerView.Adapter<NavigationAdapter.NavigationViewHolder>{


    private LayoutInflater inflater;
    List<NavigationData> data;
    Context context;
    private ClickListener clickListener;


    public NavigationAdapter(Context context, List<NavigationData> data){
        inflater=LayoutInflater.from(context);
        this.data=data;
        this.context=context;
    }




    @Override
    public NavigationViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        View view=inflater.inflate(R.layout.navigation_item_view,parent,false);
        NavigationViewHolder viewHolder=new NavigationViewHolder(view);

        return viewHolder;
    }






    @Override
    public void onBindViewHolder(NavigationAdapter.NavigationViewHolder viewHolder, int position) {

         String text=NavigationData.getText(position);
         int imageId=NavigationData.getImage(position);
         viewHolder.image.setImageResource(imageId);
         viewHolder.text.setText(text);
    }



public void setClickListener(ClickListener clickListener){

    this.clickListener=clickListener;

}




    @Override
    public int getItemCount() {
        return data.size();
    }




    class NavigationViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        ImageView image;
        TextView text;
        public NavigationViewHolder(View itemView) {
            super(itemView);

            image= (ImageView) itemView.findViewById(R.id.navListIcon);
            text= (TextView) itemView.findViewById(R.id.navListText);
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //delete(getPosition());
                }
            });


            itemView.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {

            if(clickListener!=null){
                clickListener.itemClicked(v,getPosition());
            }
        }



    }


/*
    public void delete(int position){
        data.remove(position);
        notifyItemRemoved(position);
    }*/



    public interface ClickListener{
        public void itemClicked(View view,int position);
    }



}
