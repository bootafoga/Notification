package com.example.notification;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    BufferedReader reader;
    static Notifications[] arrNotifications;
    //static RelativeLayout newlayout[];
    //static TextView titleText[], infoText[], authorText[], dataText[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputStream one = getResources().openRawResource(R.raw.zzz);
        try {
            reader = new BufferedReader(new InputStreamReader(one, "utf-8"));
        } catch (UnsupportedEncodingException e) { e.printStackTrace(); }

        String Noti[] = new String[5];
        for(int i = 0; i < 4; ++i){
            try {
                Noti[i] = reader.readLine();
            } catch (IOException e) { e.printStackTrace(); }
        }


        arrNotifications = new Notifications[5];
        for (int i = 0; i < 4; ++i){
            arrNotifications[i] = new Notifications(Noti[i]);
        }

        TextView titText = findViewById(R.id.title);
        TextView autText = findViewById(R.id.author1);
        TextView datText = findViewById(R.id.data1);

        titText.setText(arrNotifications[0].ShowTitle());
        datText.setText(arrNotifications[0].ShowData());
        autText.setText(arrNotifications[0].ShowAuthor());

        TextView tit2Text = findViewById(R.id.title2);
        TextView aut2Text = findViewById(R.id.author2);
        TextView dat2Text = findViewById(R.id.data2);

        tit2Text.setText(arrNotifications[1].ShowTitle());
        dat2Text.setText(arrNotifications[1].ShowData());
        aut2Text.setText(arrNotifications[1].ShowAuthor());

        TextView tit3Text = findViewById(R.id.title3);
        TextView aut3Text = findViewById(R.id.author3);
        TextView dat3Text = findViewById(R.id.data3);

        tit3Text.setText(arrNotifications[2].ShowTitle());
        dat3Text.setText(arrNotifications[2].ShowData());
        aut3Text.setText(arrNotifications[2].ShowAuthor());

        TextView tit4Text = findViewById(R.id.title4);
        TextView aut4Text = findViewById(R.id.author4);
        TextView dat4Text = findViewById(R.id.data4);

        tit4Text.setText(arrNotifications[3].ShowTitle());
        dat4Text.setText(arrNotifications[3].ShowData());
        aut4Text.setText(arrNotifications[3].ShowAuthor());


 }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.relativelayout:
                Intent intent = new Intent (this, activity1.class);
                startActivity(intent);
                break;

            case R.id.relativelayout2:
                Intent intent2 = new Intent (this, activity2.class);
                startActivity(intent2);
                break;

            case R.id.relativelayout3:
                Intent intent3 = new Intent (this, activity3.class);
                startActivity(intent3);
                break;

            case R.id.relativelayout4:
                Intent intent4 = new Intent (this, activity4.class);
                startActivity(intent4);
                break;

            default:


        }
    }
}


   /*public void ClickView(View view) throws IOException {
        setContentView(R.layout.activity_main);

        newlayout = getLayNotif();
        titleText = getTitleNotifText();
        authorText = getAuthorNotifText();
        infoText = getInfoNotifText();
        dataText = getDataNotifText();

        SetNotification(0,newlayout, titleText, authorText,infoText,dataText);

    }



    public void SetNotification(int num, View[] relativelayout, TextView[] titleText,
                                TextView[] authorText, TextView[] infoText, TextView[] dataText){
        //int countLesson = 0, realCountLesson = 0;
        //if(!arrNotifications[num].lessons[countLesson].GetLessons().equals("null")) {
        relativelayout[num].setVisibility(View.VISIBLE);

        titleText[num].setText(arrNotifications[num].ShowTitle());
        authorText[num].setText(arrNotifications[num].ShowAuthor());
        infoText[num].setText(arrNotifications[num].ShowInfo());
        dataText[num].setText(arrNotifications[num].ShowData());
    }


    RelativeLayout[] getLayNotif(){
        RelativeLayout out[] = new RelativeLayout[3];
        out[0] = findViewById(R.id.newlayout1);
        //out[1] = findViewById(R.id.relativelayout2);
        //out[2] = findViewById(R.id.relativelayout3);
        return out;
    }

    TextView[] getTitleNotifText(){
        TextView[] titleText = new TextView[3];
        titleText[0] = findViewById(R.id.title1);
        //timeText[1] = findViewById(R.id.time2);
        //timeText[2] = findViewById(R.id.time3);
        return titleText;
    }

    TextView[] getInfoNotifText(){
        TextView[] infoText = new TextView[3];
        infoText[0] = findViewById(R.id.info1);
        //timeText[1] = findViewById(R.id.time2);
        //timeText[2] = findViewById(R.id.time3);
        return infoText;
    }



    TextView[] getAuthorNotifText(){
        TextView[] authorText = new TextView[3];
        authorText[0] = findViewById(R.id.author1);
        // teacherText[1] = findViewById(R.id.teacher2);
        //teacherText[2] = findViewById(R.id.teacher3);
        return authorText;
    }

    TextView[] getDataNotifText(){
        TextView[] dataText = new TextView[3];
        dataText[0] = findViewById(R.id.data1);
        //timeText[1] = findViewById(R.id.time2);
        //timeText[2] = findViewById(R.id.time3);
        return dataText;
    }



*/