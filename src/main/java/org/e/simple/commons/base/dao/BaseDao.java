package org.e.simple.commons.base.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * 继承这个BaseDao,可以使用hibernate4.sessionFactory 和 spring 的
 * JdbcTemplate/NamedParameterJdbcTemplate
 * 
 * 
 * @author e.suen
 * 
 */
public abstract class BaseDao {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * @see spring/spring-hbm.xml
     */
    @Autowired
    @Qualifier("sessionFactory")
    protected SessionFactory sessionFactory;

    /**
     * @see spring/spring-dao.xml
     */
    @Autowired
    @Qualifier("namedParameterJdbcTemplate")
    protected NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /**
	 * @see spring/spring-dao.xml
	 */
    @Autowired
    @Qualifier("jdbcTemplate")
    protected JdbcTemplate jdbcTemplate;

    protected Session getCurrentSession() {
	return this.sessionFactory.getCurrentSession();
    }
}
