package com.rpos.rootworm;

/**
 * Created by Olgerd on 14.05.2018.
 */

public class MyData {
    private String text;
    private String sender;

    public MyData(String text, String sender) {
        this.text = text;
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
