import org.junit.Test;

import java.util.Arrays;

/**
 * @version 1.0
 * @author 王兴
 * @date 2022/6/17 13:11
 * @message
 */
public class DataSourceTest {

	@Test
	public void t1() throws Exception{
		Class<?> aClass = Class.forName("com.alibaba.druid.pool.DruidDataSource");
		Class<?> superclass = aClass.getSuperclass();
		System.out.println(superclass);
		Class<?>[] interfaces = aClass.getInterfaces();
		System.out.println(Arrays.toString(interfaces));
	}

}
