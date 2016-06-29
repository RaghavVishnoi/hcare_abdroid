package com.abc.calculator.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.abc.calculator.R;
import com.squareup.picasso.Picasso;

/**
 * Created by Linchpin25 on 6/28/2016.
 */
public class CustomPagerAdapter extends PagerAdapter {
    Context mContext;
    int[] imageArray;
    LayoutInflater mLayoutInflater;

    public CustomPagerAdapter(Context mContext, int[] imageArray) {
        this.mContext = mContext;
        this.imageArray = imageArray;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {


        View itemView = mLayoutInflater.inflate(R.layout.image_row, container, false);

        final ImageView imageView = (ImageView) itemView.findViewById(R.id.image);
        imageView.setTag(position);
        Picasso.with(mContext).load(imageArray[position]).into(imageView);
        container.addView(itemView);
        return itemView;

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==((LinearLayout)object);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

}
