package com.licyun.dao;

import com.licyun.model.Message;
import com.licyun.vo.MessageJsonBean;

import java.util.List;

/**
 * Created by admin
 * Description:
 * 2020/10/7.
 */
public interface MessageDao {
    List<Message> findMessagesByUserId(int id);

    Message findMessageById(int id);

    List<MessageJsonBean> findAllMessage();

    void saveMessage(Message message);

    void deleteMessage(Message message);

    Long findMessageCount();

    List<MessageJsonBean> findMessageByPage(final int pageNo,final int pageSize );
}
