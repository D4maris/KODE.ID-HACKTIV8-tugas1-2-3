package com.example.assignment.TUGAS3;

import com.google.gson.annotations.SerializedName;

public class CovidCaseResponse {

    @SerializedName("cases")
    public long cases;

    @SerializedName("deaths")
    public long deaths;

    @SerializedName("recovered")
    public long recovered;
}
