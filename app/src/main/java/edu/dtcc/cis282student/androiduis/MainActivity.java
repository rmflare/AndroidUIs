package edu.dtcc.cis282student.androiduis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // attach the onClick listener to the button
        Button btnRelativeLayout = (Button) findViewById(R.id.btnRelativeLayout);
        btnRelativeLayout.setOnClickListener(this);
        Button btnFrameLayout = (Button) findViewById(R.id.btnFrameLayout);
        btnFrameLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnRelativeLayout:
                Intent rIntent = new Intent(getApplicationContext(), RelativeLayout.class);
                startActivity(rIntent);
                break;

            case R.id.btnTableLayout:
                Intent tIntent = new Intent(getApplicationContext(), TableLayout.class);
                startActivity(tIntent);
                break;

            case R.id.btnFrameLayout:
                Intent fIntent = new Intent(getApplicationContext(), FrameLayout.class);
                startActivity(fIntent);
                break;
        }
    }
}
