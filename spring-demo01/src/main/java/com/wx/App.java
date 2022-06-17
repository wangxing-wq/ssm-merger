package com.wx;

import com.wx.dao.UserDao;
import com.wx.ignre.A;
import com.wx.ignre.B;
import com.wx.ignre.BeanC;
import com.wx.ignre.C;
import lombok.Data;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.BeansDtdResolver;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Component;
import org.xml.sax.InputSource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/3/10 23:34
 */
public class App {


	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		UserDao bean = (UserDao) applicationContext.getBean("userMapper");
		List<User> byId = bean.findById(1);
		System.out.println(byId);

	}
}
