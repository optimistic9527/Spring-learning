package example.spring;

/**
 * @author guoxingyong
 * @since 2018/11/14 15:48
 */
public class Color {
	private Person person;
	public Color(Person person) {
		this.person=person;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
