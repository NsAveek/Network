package network.aveek.com.networkconnection.retrofit.utils;

import network.aveek.com.networkconnection.retrofit.RetrofitClient;
import network.aveek.com.networkconnection.retrofit.interfaces.Paths;

/**
 * Created by Aveek on 26/09/2017.
 */

public class ApiUtils {
    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";
    public static Paths getPaths(){
        return RetrofitClient.getClient(BASE_URL).create(Paths.class);
    }
}
