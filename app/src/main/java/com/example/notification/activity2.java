package com.example.notification;

import android.os.Bundle;
import android.widget.TextView;

public class activity2 extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView titText = findViewById(R.id.title);
        TextView autText = findViewById(R.id.author);
        TextView datText = findViewById(R.id.data);
        TextView infText = findViewById(R.id.info);


        titText.setText(arrNotifications[1].ShowTitle());
        datText.setText(arrNotifications[1].ShowData());
        autText.setText(arrNotifications[1].ShowAuthor());
        infText.setText(arrNotifications[1].ShowInfo());

    }

}
