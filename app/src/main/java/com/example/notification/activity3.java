package com.example.notification;

import android.os.Bundle;
import android.widget.TextView;

public class activity3 extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        TextView titText = findViewById(R.id.title);
        TextView autText = findViewById(R.id.author);
        TextView datText = findViewById(R.id.data);
        TextView infText = findViewById(R.id.info);


        titText.setText(arrNotifications[2].ShowTitle());
        datText.setText(arrNotifications[2].ShowData());
        autText.setText(arrNotifications[2].ShowAuthor());
        infText.setText(arrNotifications[2].ShowInfo());

    }

}