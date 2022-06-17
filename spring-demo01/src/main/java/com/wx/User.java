package com.wx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/3/10 23:23
 */
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class User implements BeanNameAware {

	private String beanName;

	@Override
	public void setBeanName(String name) {
		System.out.println("set Bean name" + name);
		this.beanName = name;
	}

	public String getBeanName() {
		return beanName;
	}

}
