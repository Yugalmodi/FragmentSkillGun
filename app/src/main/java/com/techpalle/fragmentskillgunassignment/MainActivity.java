package com.techpalle.fragmentskillgunassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonReport, buttonNoAds, buttonLike;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonReport = (Button) findViewById(R.id.button_report);
        buttonNoAds = (Button) findViewById(R.id.button_no_ads);
        buttonLike = (Button) findViewById(R.id.button_like_us);

        buttonReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReportUsDialog reportUsDialog = new ReportUsDialog();
                reportUsDialog.show(getSupportFragmentManager(), null);
            }
        });
        buttonNoAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NoAddsDialogFrag noAddsDialogFrag = new NoAddsDialogFrag();
                noAddsDialogFrag.show(getSupportFragmentManager(), null);
            }
        });
        buttonLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LikeUsDialogFrag likeUsDialogFrag = new LikeUsDialogFrag();
                likeUsDialogFrag.show(getSupportFragmentManager(), null);
            }
        });
    }
}
