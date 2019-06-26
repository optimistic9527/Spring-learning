package example.spring.bean_post_processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author guoxingyong
 * @data 2019/6/24 18:42
 */
@Component
public class BeanPostProcessorTest implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessorTest:postProcessBeforeInitialization:"+beanName);
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessorTest:postProcessAfterInitialization:"+beanName);
		return null;
	}
}
