package com.example.assignment.TUGAS3;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

//    String BASE_URL = "https://newsapi.org/v1/";
    String BASE_URL_COVID = "https://corona.lmao.ninja/v2/";
//    String BASE_URL_MOVIE ="https://ghibliapi.herokuapp.com/";

//    @GET("sources")
//    Call<SourceResponse> getSource();

    @GET("all")
    Call<CovidCaseResponse> getAllCases();

    @GET("states")
    Call<List<CovidCaseResponse>> getAllStatesCases();

//    @GET("films")
//    Call<List<MovieGhibli>> getmovie();
}
