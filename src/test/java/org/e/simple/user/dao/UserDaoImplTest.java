package org.e.simple.user.dao;

import org.e.simple.commons.base.dao.BaseDaoTest;
import org.e.simple.user.dao.impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.Assert;

@ContextConfiguration(locations = "classpath:org/e/simple/user/user-test.xml")
public class UserDaoImplTest extends BaseDaoTest {
    @Autowired
    UserDaoImpl userDao;

    @Test
    public void test() {
	Assert.notNull(userDao);
    }
}
