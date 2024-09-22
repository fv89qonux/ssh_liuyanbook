package com.licyun.dao;

import com.licyun.model.User;
import com.licyun.vo.MessageJsonBean;

import java.util.List;

/**
 * Created by admin
 * Description:
 * 2020/10/5.
 */
public interface UserDao {


    User findById(int id);

    List<User> findByName(String name);

    List<User> findByEmail(String email);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    Long findUserCount();

    List<User> findAllUser();

    List<User> findUserByPage(int pageNo, int pageSize);

}
