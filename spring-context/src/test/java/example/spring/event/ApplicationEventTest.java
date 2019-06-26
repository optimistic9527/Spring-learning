package example.spring.event;

import example.spring.Person;
import org.springframework.context.ApplicationEvent;

/**
 * @author guoxingyong
 * @since 2018/11/18 15:00
 */
public class ApplicationEventTest extends ApplicationEvent {
	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public ApplicationEventTest(Person source) {
		super(source);
	}
}
