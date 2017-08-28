package com.jidawenwen.service;

import org.springframework.stereotype.Service;

/**
 * Created by BeForever on 2016/7/10.
 */
@Service
public class JidawenwenService {
    public static String getMessage(int userId) {
        return "Hello Message:" + String.valueOf(userId);
    }
}
