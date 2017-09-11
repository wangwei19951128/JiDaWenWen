package com.jidawenwen.service.message;

import com.jidawenwen.model.Message;

public interface MessageService {
    boolean send(Message message);
    int[] receive(int uid);
    Message load(int id);
    Message[] loadAll(int[] ids);
}
