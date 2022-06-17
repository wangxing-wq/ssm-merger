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
public class User {

	private Integer id;
	private String name;
	private Integer age;
}
