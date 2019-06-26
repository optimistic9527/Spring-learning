package example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guoxingyong
 * @since 2018/11/14 15:51
 */
@Configuration
public class BeanTest {

	@Bean
	public Color color2(){
		return new Color(person2());
	}

	@Bean
	public Color color3(){
		return new Color(person2());
	}

	@Bean(name = {"person3"})
	public Person person2(){
		return new Person();
	}

}
