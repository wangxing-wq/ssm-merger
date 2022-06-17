package com.wx;

import org.springframework.beans.factory.FactoryBean;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/6/17 13:58
 * @message
 */
public class FactoryBeanTest implements FactoryBean<User> {

	@Override
	public User getObject() throws Exception {
		return null;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

}
