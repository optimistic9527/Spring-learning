package example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author guoxingyong
 * @since 2018/11/14 14:22
 */
public class SpringTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext=new AnnotationConfigApplicationContext(ScanTest.class);
		configApplicationContext.getBean("factoryBeanTest");
	}
}
