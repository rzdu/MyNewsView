package com.example.administrator.mynewsview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/6/4.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;

    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects) {
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        Fruit fruit=getItem(i);
        View view;
        //nothing
        ViewHolder viewHolder;
        if(null==convertView) {
            view= LayoutInflater.from(getContext()).inflate(resourceId,viewGroup,false);
            viewHolder=new ViewHolder();
            viewHolder.image = (ImageView) view.findViewById(R.id.fruit_image);
            viewHolder.name = (TextView) view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);//讲viewHolder存储在view中
        }else {

            view=convertView;
            viewHolder=(ViewHolder)view.getTag();//重新获取viewHolder
        }
        viewHolder.image.setImageResource(fruit.getImageId());
        viewHolder.name.setText(fruit.getName());
        return view;
    }

    class ViewHolder {
        ImageView image;
        TextView name;
    }
}
