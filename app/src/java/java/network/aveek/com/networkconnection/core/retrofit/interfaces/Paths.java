package network.aveek.com.networkconnection.core.retrofit.interfaces;

import network.aveek.com.networkconnection.core.retrofit.pojo.SEResponseSample;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Aveek on 25/09/2017.
 */

public interface Paths {

    // GET,POST,PUT,MULTIPART all

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<SEResponseSample> getAnswers();

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<SEResponseSample> getAnswers(@Query("tagged") String tags);
}
