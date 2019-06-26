package example.spring.event;

import example.spring.Person;
import example.spring.event.ApplicationEventTest;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author guoxingyong
 * @since 2018/11/18 14:59
 */
@Component
public class ApplicationListenerTest implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof ApplicationEventTest){
			ApplicationEventTest applicationEventTest=(ApplicationEventTest)event;
			Person source = (Person)applicationEventTest.getSource();
			System.out.println(source.toString());
		}
	}
}
