package com.jidawenwen.model;

import java.util.Date;

public class Message {
    private final int id;
    private final int sender;
    private final int receiver;
    private final Date send_date;
    private final String content;
    private boolean isRead=false;

    public Message(int id, int sender, int receiver, Date send_date, String content) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.send_date = send_date;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public int getSender() {
        return sender;
    }

    public int getReceiver() {
        return receiver;
    }

    public Date getSend_date() {
        return send_date;
    }

    public String getContent() {
        return content;
    }

    public boolean isRead() {
        return isRead;
    }

    public void read(){
        isRead=true;
    }
}
