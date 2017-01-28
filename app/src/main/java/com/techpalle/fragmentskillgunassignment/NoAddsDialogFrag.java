package com.techpalle.fragmentskillgunassignment;


import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class NoAddsDialogFrag extends DialogFragment{


    public NoAddsDialogFrag() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d= null;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View v1 = getActivity().getLayoutInflater().inflate(R.layout.no_add_title, null);
        builder.setCustomTitle(v1);
        View v = getActivity().getLayoutInflater().inflate(R.layout.frag_no_adds_dialog, null);
        Button button = (Button) v.findViewById(R.id.button_No_add);
        builder.setView(v);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "PRO APP", Toast.LENGTH_SHORT).show();
            }
        });
        d = builder.create();
        return d;
    }
}
