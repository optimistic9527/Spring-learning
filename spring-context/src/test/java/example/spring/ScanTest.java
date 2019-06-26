package example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author guoxingyong
 * @since 2018/11/14 14:22
 */
@Component
@ComponentScan(value = "example.spring")
public class ScanTest {
	@Bean(name = {"person1","person2"})
	public Person person(){
		return new Person();
	}
}
