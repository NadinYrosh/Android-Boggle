package com.example.guest.boggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.newBoggleButton) Button mNewBoggleButton;
    @Bind(R.id.boggleOutput) TextView mBoggleOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mNewBoggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBoggleOutput.setText("Testo");


            }
        });
    }
}
