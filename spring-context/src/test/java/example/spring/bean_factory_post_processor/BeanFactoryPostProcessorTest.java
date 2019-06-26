package example.spring.bean_factory_post_processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author guoxingyong
 * @since 2018/11/17 22:59
 */
@Component
public class BeanFactoryPostProcessorTest implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
//		while (beanNamesIterator.hasNext()) {
//			System.out.println(beanNamesIterator.next());
//		}
		System.out.println("BeanFactorTest:postProcessBeanFactory");
	}
}
