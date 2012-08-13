package org.e.simple.user.service.impl;

import org.e.simple.user.dao.UserDao;
import org.e.simple.user.model.User;
import org.e.simple.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao = null;

    public void createUser(User user) {
	userDao.saveUser(user);
    };

}
