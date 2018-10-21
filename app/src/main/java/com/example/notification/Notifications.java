package com.example.notification;

public class Notifications {
    private String title;
    private String info;// = new String[20];
    private String author;
    private String data;


    Notifications(String input) {
        String[] inputToArr = input.split("/");
        this.title = inputToArr[0];
        this.info = inputToArr[1];
        this.author = inputToArr[2];
        this.data = inputToArr[3];
    }

    public String ShowTitle() {
        return title;
    }

    public String ShowInfo() {
        return info;
    }

    public String ShowAuthor() {
        return author;
    }

    public String ShowData() {
        return data;
    }

}
/* public void SetTitle(String title) {
        this.title = title;
    }

    public void SetInfo(String info) {
        this.info = info;
    }

    public void SetAuthor(String author) {
        this.author = author;
    }

    public void SetData(String data) {
        this.data = data;
    }
*/

//}