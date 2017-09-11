package com.jidawenwen.service;

import com.jidawenwen.dao.MessageDAO;
import com.jidawenwen.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageDAO dao;

    public void send(Message message) {
        dao.insert(message);
    }

    public int receive(int uid) {
        return dao.getNewCount(uid);
    }

    public void read(int id) {
        dao.update(id);
    }

    public void remove(int id) {
        dao.deleter(id);
    }

    public Message load(int id) {
        return dao.getMessage(id);
    }

    public List<Message> loadAll(int uid) {
        return dao.getUserMessages(uid);
    }
}
