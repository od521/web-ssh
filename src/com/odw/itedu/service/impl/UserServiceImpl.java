package com.odw.itedu.service.impl;

import com.odw.itedu.dao.IUserDao;
import com.odw.itedu.model.User;
import com.odw.itedu.service.IUserService;

public class UserServiceImpl implements IUserService {
    private IUserDao userDao;
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void register(User user) {
        userDao.add(user);
    }
}
