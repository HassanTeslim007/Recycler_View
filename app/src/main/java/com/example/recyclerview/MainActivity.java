package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<String>();
    private ArrayList<String> mImages = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");

        initBitmap();
    }

    private void initBitmap(){
        Log.d(TAG, "initBitmap: getting bitmaps");
        mImages.add("https://media.cntraveler.com/photos/5ca4f3ee7b531a1378949c83/master/w_820,c_limit/Paris_GettyImages-1064511232.jpg");
        mNames.add("Paris, France");

        mImages.add("https://media.cntraveler.com/photos/5ca4fa6b27413274a5073baa/master/w_820,c_limit/Doha-Qatar_GettyImages-959454948.jpg");
        mNames.add("Doha, Qatar");

        mImages.add("https://media.cntraveler.com/photos/568c8bf067dc82253d9f81be/master/w_820,c_limit/most-beautiful-cities-amsterdam-cr-getty.jpg");
        mNames.add("Amsterdam, Netherlands");

        mImages.add("https://media.cntraveler.com/photos/588a0a41d4a40cdf1ed0b278/master/w_820,c_limit/venice-GettyImages-485773273.jpg");
        mNames.add("Venice, Italy");

        mImages.add("https://media.cntraveler.com/photos/5ca50d327b531a0d2c949cc9/master/w_820,c_limit/Kyoto,-Japan_GettyImages-924114674.jpg");
        mNames.add("Kyoto Japan");

        mImages.add("https://media.cntraveler.com/photos/5ca618a804831ff88eaa95fa/master/w_820,c_limit/Athens_GettyImages-961182568.jpg");
        mNames.add("Athens, Greece");

        mImages.add("https://media.cntraveler.com/photos/5c98f4dd3beed8eb084c658f/master/w_820,c_limit/Sydney_GettyImages-480800679.jpg");
        mNames.add("Sydney, Australia");

        mImages.add("https://media.cntraveler.com/photos/5ca4fa6d19fc382ed91a3199/master/w_820,c_limit/San-Miguel-De-Allende-Mexico_GettyImages-902326190.jpg");
        mNames.add("San Miguelle de Allende, Mexico");

        mImages.add("https://media.cntraveler.com/photos/5ca50f287b531a2949949ccf/master/w_820,c_limit/Cape-Town-South-Africa_GettyImages-477451698.jpg");
        mNames.add("Capetown, SouthAfrica");

        mImages.add("https://media.cntraveler.com/photos/5ca50f2719fc38711d1a31b3/master/w_820,c_limit/Buenos-Aires,-Argentina_GettyImages-984492128.jpg");
        mNames.add("Buenos Aires, Argentina");

        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewHolder holder = new RecyclerViewHolder(this, mImages, mNames);
        recyclerView.setAdapter(holder);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

}
