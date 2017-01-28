package com.techpalle.fragmentskillgunassignment;


import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class LikeUsDialogFrag extends DialogFragment{


    public LikeUsDialogFrag() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d =null;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View v = getActivity().getLayoutInflater().inflate(R.layout.like_title, null);
        builder.setCustomTitle(v);
        View v1 = getActivity().getLayoutInflater().inflate(R.layout.fragment_like_us_dialog, null);
        builder.setView(v1);
        d = builder.create();
        return d;
    }
}
