package example.spring.bean_post_processor;

import example.spring.TestLifeCycle;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * @author guoxingyong
 * @since 2018/11/21 19:43
 */
@Component
public class InstantiationTest extends InstantiationAwareBeanPostProcessorAdapter implements PriorityOrdered {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if (beanName.equals("instinationTest")) {
			return new InstinationTest("gxy");
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		/*if (beanName.equals("testLifeCycle")){
			return false;
		}*/
		return true;
	}

	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
		if(bean instanceof TestLifeCycle){
			//修改bean中a 的属性值
			/*PropertyValue value = pvs.getPropertyValue("beanTest");
			//System.out.println("修改之前 a 的value是："+value.getValue());
			value.setConvertedValue(null);*/
			return pvs;
		}
		return pvs;
	}

	@Override
	public int getOrder() {
		return 100;
	}
}
