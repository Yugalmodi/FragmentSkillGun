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
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReportUsDialog extends DialogFragment {


    public ReportUsDialog() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d = null;
        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        View v1 = getActivity().getLayoutInflater().inflate(R.layout.report_title, null);
        builder.setCustomTitle(v1);
        View v = getActivity().getLayoutInflater().inflate(R.layout.fragment_report_us_dialog, null);
        EditText et1 = (EditText) v.findViewById(R.id.edit_text_email);
        EditText et2 = (EditText) v.findViewById(R.id.edit_text_issue);
        EditText et3 = (EditText) v.findViewById(R.id.edit_text_description);
        Button button = (Button) v.findViewById(R.id.button_submit);
        builder.setView(v);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "REPORT US", Toast.LENGTH_SHORT).show();
            }
        });
        d = builder.create();
        return d;
    }
}
