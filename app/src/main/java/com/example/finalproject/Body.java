package com.example.finalproject;

import com.google.gson.annotations.SerializedName;

public class Body
{
    @SerializedName("lyrics")
    private Lyrics lyrics;

    public Lyrics getLyrics() {
        return lyrics;
    }
}
