package com.wx.dao;

import com.wx.User;

import java.util.List;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/3/11 22:41
 */
public interface UserDao {

	List<User> findById(int id);

}
