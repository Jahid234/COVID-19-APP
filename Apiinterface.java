package com.example.covid19app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Apiinterface {

    String BASE_URL="https://corona.lmao.ninja";

    @GET("countries")
    Call<List<ModelClass>>getcountrydata();
}
