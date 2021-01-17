package com.dicoding.picodiploma.mybeautifulindonesia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImagesUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();

        FloatingActionButton floatingActionButton = findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MyProfileActivity.class));
            }
        });
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImagesUrls.add("https://upload.wikimedia.org/wikipedia/commons/a/a1/Raja_Ampat_Islands_-_journal.pbio.1001457.g001.png");
        mNames.add("Kepulauan Raja Ampat");

        mImagesUrls.add("https://upload.wikimedia.org/wikipedia/id/7/73/Komodo_Island.jpg");
        mNames.add("Pulau Komodo");

        mImagesUrls.add("https://upload.wikimedia.org/wikipedia/commons/3/33/Segara_Anak_Lake_Mt_Barujari.JPG");
        mNames.add("Gunung Rinjani");

        mImagesUrls.add("http://anekatempatwisata.com/wp-content/uploads/2015/07/Kepulauan-Belitung.jpg");
        mNames.add("Kepulauan Bangka Belitung");

        mImagesUrls.add("https://upload.wikimedia.org/wikipedia/commons/7/7d/Mount_Bromo_at_sunrise%2C_showing_its_volcanoes_and_Mount_Semeru_%28background%29.jpg");
        mNames.add("Gunung Bromo");

        mImagesUrls.add("https://upload.wikimedia.org/wikipedia/commons/2/29/Danau_Belerang_Ijen.jpg");
        mNames.add("Kawah Ijen");

        mImagesUrls.add("https://upload.wikimedia.org/wikipedia/commons/6/6b/Bunaken01.JPG");
        mNames.add("Taman Nasional Bunaken");

        mImagesUrls.add("https://upload.wikimedia.org/wikipedia/commons/7/70/Flores_Moni_Kelimutu.jpg");
        mNames.add("Gunung Kelimutu");

        mImagesUrls.add("http://anekatempatwisata.com/wp-content/uploads/2015/07/Pantai-Dreamland-Bali.jpg");
        mNames.add("Pantai Dreamland");

        mImagesUrls.add("http://anekatempatwisata.com/wp-content/uploads/2015/07/Danau-Toba-Sumatera-Utara.jpg");
        mNames.add("Danau Toba");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImagesUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
