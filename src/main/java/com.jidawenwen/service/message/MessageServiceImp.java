package com.jidawenwen.service.message;

import com.jidawenwen.dao.MessageDAO;
import com.jidawenwen.model.Message;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class MessageServiceImp implements MessageService {
    @Autowired
    private MessageDAO dao;
    @Override
    public boolean send(Message message) {
        dao.insert(message);
        return true;
    }

    @Override
    public int[] receive(int uid) {
        return dao.getUserMessageIds();
    }

    @Override
    public Message load(int id) {
        return dao.getMessage(id);
    }

    @Override
    public Message[] loadAll(int[] ids) {
        return (Message[])Arrays.stream(ids)
                .mapToObj(id->dao.getMessage(id))
                .toArray();
    }


}
