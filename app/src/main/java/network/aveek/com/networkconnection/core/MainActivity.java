package network.aveek.com.networkconnection.core;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import network.aveek.com.networkconnection.R;
import network.aveek.com.networkconnection.core.retrofit.interfaces.Paths;

public class MainActivity extends AppCompatActivity {

    private Paths paths;
    private SearchRepo repoProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        repoProvider = SearchRepoProvider.INSTANCE.provideSearchRepo();// This is how you need to get the non static function

        repoProvider.searchUsers("New York", "Java")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe( result -> {
                    Log.d("Result", "There are "+ result.getItems().size() +" Java developers in NY");
                }, error -> {
                    error.printStackTrace();
                });

        Toast.makeText(this, TopicTest.Companion.getData(), Toast.LENGTH_LONG).show();

//        paths = ApiUtils.getPaths();
//        paths.getAnswers().enqueue(new Callback<SEResponseSample>() {
//            @Override
//            public void onResponse(Call<SEResponseSample> call, Response<SEResponseSample> response) {
//                if (response.isSuccessful()){
//                    Toast.makeText(MainActivity.this,response.body().getItems().toString(),Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(MainActivity.this, Integer.toString(response.code()),Toast.LENGTH_SHORT).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<SEResponseSample> call, Throwable t) {
//                Log.d("MainActivity", "error loading from API");
//            }
//        });

    }
}
