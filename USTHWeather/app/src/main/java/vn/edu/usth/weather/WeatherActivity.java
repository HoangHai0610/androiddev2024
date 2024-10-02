package vn.edu.usth.weather;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {

    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
        // Create a new Fragment to be placed in the activity
        ForecastFragment forecast = new ForecastFragment();
// Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, forecast).commit();
        Log.i(TAG,"Create");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Start");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Pause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Resume");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Destroy");
    }
}