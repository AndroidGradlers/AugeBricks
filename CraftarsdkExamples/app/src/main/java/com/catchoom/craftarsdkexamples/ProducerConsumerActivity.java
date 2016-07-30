package com.catchoom.craftarsdkexamples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class ProducerConsumerActivity extends Activity {

    private ToggleButton t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producer_consumer);
        t = (ToggleButton)findViewById(R.id.toggle);
    }

    public void clickedToggle(View v)  //When toggleButton clicked
    {

    }

    public void pressed(View v)
    {
        if(t.getText().toString().equals("Consumer")){
            startActivity(new Intent(ProducerConsumerActivity.this,BrowseImageActivity.class));

        }
        else {
            startActivity(new Intent(ProducerConsumerActivity.this, SellerActivity.class));
        }
    }
}

