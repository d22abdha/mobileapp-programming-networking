package com.example.networking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

@SuppressWarnings("WeakerAccess")
public class RecyclerViewItem {

    private String title;

    public RecyclerViewItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}