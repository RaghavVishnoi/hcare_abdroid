package com.abc.calculator.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.abc.calculator.R;
import com.abc.calculator.activities.HomeActivity;
import com.abc.calculator.fragments.BuyEquipmentFragment;
import com.abc.calculator.fragments.FatCalculatorFragment;
import com.abc.calculator.fragments.FirstAidFragment;
import com.abc.calculator.fragments.FitnessCenterFragment;
import com.abc.calculator.fragments.FitnessGuruFragment;
import com.abc.calculator.fragments.WorkOutFragment;
import com.squareup.picasso.Picasso;

/**
 * Created by Linchpin25 on 6/28/2016.
 */
public class HomeScreenListAdapter extends RecyclerView.Adapter<HomeScreenListAdapter.ViewHolder> {

    Context mContext;
    String[] itemArray;
    int[] imageArray;


    public HomeScreenListAdapter(Context mContext, String[] itemArray, int[] imageArray) {
        this.mContext = mContext;
        this.itemArray = itemArray;
        this.imageArray = imageArray;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_list_row, parent, false); //Inflating the layout

        ViewHolder vhItem = new ViewHolder(v);

        return vhItem;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {


        holder.tvItem.setText(itemArray[position]);
        holder.llImage.setBackgroundResource(imageArray[position]);

    }

    @Override
    public int getItemCount() {
        return itemArray.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvItem;
        LinearLayout llImage;

        public ViewHolder(View itemView) {

            super(itemView);
            tvItem = (TextView) itemView.findViewById(R.id.tv_item);
            llImage = (LinearLayout) itemView.findViewById(R.id.llImage);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewClick(getPosition());
                }
            });

        }
    }


    public void viewClick(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new FatCalculatorFragment();
                break;
            case 1:
                fragment = new FirstAidFragment();
                break;
            case 2:
                fragment = new WorkOutFragment();
                break;
            case 3:
                fragment = new FitnessGuruFragment();
                break;
            case 4:
                fragment = new FitnessCenterFragment();
                break;
            case 5:
                fragment = new BuyEquipmentFragment();
                break;
        }

        if (fragment != null) {
            FragmentTransaction fragmentTransaction = HomeActivity.fragmentManager.beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_right, R.anim.slide_out_left);
            fragmentTransaction.replace(R.id.frame, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();


        }


    }


}
