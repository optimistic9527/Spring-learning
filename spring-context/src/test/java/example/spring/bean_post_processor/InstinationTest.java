package example.spring.bean_post_processor;

import example.spring.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author guoxingyong
 * @since 2018/11/21 19:39
 */
@Component
public class InstinationTest {
	@Autowired
	private Color color2;
	private String name;

	public InstinationTest(String name) {
		this.name = name;
	}

	public InstinationTest() {
	}

	private void init(){
		System.out.println("init");
	}

	private void destroy(){
		System.out.println("destroy");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor2() {
		return color2;
	}

}
