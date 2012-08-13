package org.e.simple.user.dao.impl;

import org.e.simple.commons.base.dao.BaseDao;
import org.e.simple.user.dao.UserDao;
import org.e.simple.user.model.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl extends BaseDao implements UserDao
{
    public void saveUser(User user) {
	super.getCurrentSession().save(user);
    }
}
