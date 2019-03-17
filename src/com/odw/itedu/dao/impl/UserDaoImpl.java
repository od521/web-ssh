package com.odw.itedu.dao.impl;

import com.odw.itedu.dao.IUserDao;
import com.odw.itedu.model.User;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class UserDaoImpl implements IUserDao {
    //提供set方法，便于xml配置注入
    private HibernateTemplate hibernateTemplate;
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void add(User user) {
        hibernateTemplate.save(user);

    }
}
