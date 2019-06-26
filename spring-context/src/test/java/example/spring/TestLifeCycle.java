package example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @author guoxingyong
 * @since 2018/11/14 14:23
 */
@Component
public class TestLifeCycle implements SmartLifecycle {

	@Autowired
	private BeanTest beanTest;

	private boolean isRunning = false;

	@Override
	public boolean isAutoStartup() {
		System.out.println("获取 isAutoStartup");
		return true;
	}

	@Override
	public void stop(Runnable callback) {
		System.out.println("TestLifeCycle stop");
	}

	@Override
	public void start() {
		System.out.println("TestLifeCycle start");
	}

	@Override
	public void stop() {
		System.out.println("TestLifeCycle stop");
	}

	@Override
	public boolean isRunning() {
		System.out.println("获取 isRunning");
		boolean result;
		result = isRunning;
		isRunning = !isRunning;
		return result;
	}

	@Override
	public int getPhase() {
		System.out.println("获取 getPhase");
		return 0;
	}

	public BeanTest getBeanTest() {
		return beanTest;
	}

	public void setBeanTest(BeanTest beanTest) {
		this.beanTest = beanTest;
	}
}
