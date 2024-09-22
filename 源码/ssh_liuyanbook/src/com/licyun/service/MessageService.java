package com.licyun.service;

import com.licyun.model.Message;
import com.licyun.vo.MessageBean;
import com.licyun.vo.MessageJsonBean;

import java.util.List;

/**
 * Created by admin
 * Description:
 * 2020/10/7.
 */
public interface MessageService {

    List<Message> findMessagesByUserId(int id);

    Message findMessageById(int id);

    List<MessageJsonBean> findAllMessage();

    void saveMessage(Message message);

    void deleteMessage(Message message);

    void deleteMessageById(int id);

    Long findMessageCount();

    String getDate();

    List<MessageJsonBean> findMessageByPage(int pageNo,int pageSize );
}
