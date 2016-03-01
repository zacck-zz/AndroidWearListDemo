package com.zacck.androidwearlistdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WearableListView;

public class MainActivity extends Activity implements WearableListView.ClickListener {

    // Sample dataset for the list
    String[] elements = { "I need a Macbook", "I need A smartphone", "I need a Smart Watch" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // Get the list component from the layout of the activity
            WearableListView listView =
            (WearableListView) findViewById(R.id.mWearList);

            // Assign an adapter to the list
            listView.setAdapter(new MyListAdapter(this, elements));

            // Set a click listener
            listView.setClickListener(this);
    }

    // WearableListView click listener
    @Override
    public void onClick(WearableListView.ViewHolder v) {
            Integer tag = (Integer) v.itemView.getTag();
            // use this data to complete some action ...
    }

    @Override
    public void onTopEmptyRegionClick() {
    }
}
