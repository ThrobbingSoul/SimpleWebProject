package org.e.simple.commons.base.dao;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

@ContextConfiguration(locations = { "classpath:spring/datasource.xml",
		"classpath:spring/spring-tx.xml",
		"classpath:spring/spring-dao-integration-test.xml" })
public abstract class BaseDaoTest extends AbstractTransactionalJUnit4SpringContextTests
{

}
