package vn.edu.usth.weather.activity;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.widget.Toolbar;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.content.Intent;

import vn.edu.usth.weather.adapter.HomeFragmentPagerAdapter;
import vn.edu.usth.weather.R;

public class WeatherActivity extends AppCompatActivity {
    public static final String TAG = "Weathering";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
        Log.i(TAG, "onCreate");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager pager = findViewById(R.id.pager);
        HomeFragmentPagerAdapter adapter = new HomeFragmentPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
        TabLayout tablayout = findViewById(R.id.tab_layout);
        tablayout.setupWithViewPager(pager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.tool_bars, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_refresh) {
            Toast.makeText(this, "Refreshing", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_settings) {
            Intent intent = new Intent(this, PrefActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.action_music) {
            Intent intent = new Intent(this, MusicActivity.class );
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart()    {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume()    {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause()    {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop()    {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy()    {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }
}

