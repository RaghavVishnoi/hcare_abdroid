package com.abc.calculator.fragments;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abc.calculator.R;
import com.abc.calculator.adapter.CustomPagerAdapter;
import com.abc.calculator.adapter.HomeScreenListAdapter;

import cn.trinea.android.view.autoscrollviewpager.AutoScrollViewPager;

/**
 * Created by Linchpin25 on 6/28/2016.
 */
public class HomeFragment extends ParentFragment {
    View root;
    AutoScrollViewPager viewPager;
    int imageArray[] = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d};
    String itemArray[] = {"CALCULATE FAT", "FIRST AID", "WORKOUT", "FITNESS GURU", "FITNESS CENTERS", "BUY EQUIPMENT"};
    int itemImageArray[] = {R.drawable.calculate_fat, R.drawable.first_aid, R.drawable.work_out, R.drawable.fitness_guru, R.drawable.fitness_center
            , R.drawable.buy_equipment};
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.home_fragment, container, false);
        viewPager = (AutoScrollViewPager) root.findViewById(R.id.view_pager);
        viewPager.setAdapter(new CustomPagerAdapter(getActivity(), imageArray));
        viewPager.setInterval(3000);
        viewPager.startAutoScroll(3000);


        recyclerView = (RecyclerView) root.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new SpacesItemDecoration(getResources().getDimensionPixelSize(R.dimen.space)));
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyclerView.setAdapter(new HomeScreenListAdapter(getActivity(), itemArray, itemImageArray));

        return root;
    }

    class SpacesItemDecoration extends RecyclerView.ItemDecoration {
        private int space;

        public SpacesItemDecoration(int space) {
            this.space = space;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view,
                                   RecyclerView parent, RecyclerView.State state) {
            outRect.left = space;
            outRect.right = space;
            outRect.bottom = space;

            // Add top margin only for the first item to avoid double space between items
            if (parent.getChildLayoutPosition(view) == 0 || parent.getChildLayoutPosition(view) == 1) {
                outRect.top = space;
            } else {
                outRect.top = 0;
            }
        }
    }


}
