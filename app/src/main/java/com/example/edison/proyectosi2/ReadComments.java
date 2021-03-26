package com.example.edison.proyectosi2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Ramiro on 25/01/2015.
 */
public class ReadComments extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // note that use read_comments.xml instead of our single_post.xml
        setContentView(R.layout.read_comments);
    }
}
