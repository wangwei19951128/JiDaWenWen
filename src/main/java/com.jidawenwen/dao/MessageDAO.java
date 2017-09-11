package com.jidawenwen.dao;

import com.jidawenwen.model.Message;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MessageDAO {
    String TABLE_NAME = " message ";
    String INSERT_FIELDS = " sender, receiver, send_date, content, isRead, isSystem ";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{sender},#{receiver},#{send_date},#{content},#{isRead},#{isSystem})"})
    void insert(Message message);

    @Delete({"delete from ", TABLE_NAME, " where id=#{id}"})
    void deleter(int id);

    @Update({"update ", TABLE_NAME, " set isRead=true where id=#{id}"})
    void update(int id);

    @Select({"select count(*) from ", TABLE_NAME, " where id=#{id}"})
    int getNewCount(int uid);

    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where id=#{id}"})
    Message getMessage(int id);

    List<Message> getUserMessages(@Param("id") int uid);
}
