package com.catchoom.craftarsdkexamples;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String> {

    private Context context;
    private Integer[] ImageResources={R.drawable.ar_programmatically,R.drawable.craftar_c,R.drawable.reco_only};
    //private String[] HeadingNames={"Dog1","Dog2","Dog3","Dog4","Dog5","Dog6","Dog7","Dog8"};
    private String[] Description={"Active","Not Active","Active","Active","Active","Not Active","Not Active","Not Active"};
    CustomAdapter(Context context,String[] Head)
    {
        super(context,R.layout.custom_layout,Head);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view=inflater.inflate(R.layout.custom_layout, parent, false);
        ImageView image;
        Button button1;
        Button button2;
        image = (ImageView)view.findViewById(R.id.image);
        button1 = (Button)view.findViewById(R.id.button);
        button2 = (Button)view.findViewById(R.id.button2);
        image.setImageResource(ImageResources[position]);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,OnDeviceARActivity.class);
                context.startActivity(intent);
            }
        });

        return view;
    }
}