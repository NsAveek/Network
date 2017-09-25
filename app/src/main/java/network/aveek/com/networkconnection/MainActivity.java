package network.aveek.com.networkconnection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import network.aveek.com.networkconnection.pojo.SEResponseSample;
import network.aveek.com.networkconnection.retrofit.interfaces.Paths;
import network.aveek.com.networkconnection.retrofit.utils.ApiUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Paths paths;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paths = ApiUtils.getPaths();
        paths.getAnswers().enqueue(new Callback<SEResponseSample>() {
            @Override
            public void onResponse(Call<SEResponseSample> call, Response<SEResponseSample> response) {
                if (response.isSuccessful()){
                    Toast.makeText(MainActivity.this,response.body().getItems().toString(),Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, Integer.toString(response.code()),Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<SEResponseSample> call, Throwable t) {
                Log.d("MainActivity", "error loading from API");
            }
        });

    }
}
