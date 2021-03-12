package com.demo.mymovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.demo.mymovies.utils.NetworkUtils;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JSONObject jsonObject = NetworkUtils.getJSONFromNetwork(NetworkUtils.TOP_RATED, 3);
        Log.e("JSON", jsonObject.toString());
        if (jsonObject == null) {
            Toast.makeText(this, "error", Toast.LENGTH_LONG).show();
        } else Toast.makeText(this, "succesful", Toast.LENGTH_LONG).show();

    }


}
