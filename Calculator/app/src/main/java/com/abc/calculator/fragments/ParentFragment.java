package com.abc.calculator.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.abc.calculator.interfaces.IMessenger;

public class ParentFragment extends Fragment {
    protected IMessenger activityCallback;

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.activityCallback = (IMessenger) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement ToolbarListener");
        }
    }
}
