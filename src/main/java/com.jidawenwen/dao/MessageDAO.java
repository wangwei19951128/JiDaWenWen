package com.jidawenwen.dao;

import com.jidawenwen.model.Message;

import java.util.Date;

public interface MessageDAO {
    void insert(Message message);
    void deleter(int id);
    int[] getUserMessageIds();
    Message getMessage(int id);
}
