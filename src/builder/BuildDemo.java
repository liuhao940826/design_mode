package builder;


/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 4:35 PM 2019/5/29
 */
public class BuildDemo {

	public static void main(String[] args) {

		PersonBuilder builder = new PersonBuilder();
		// 决定如何创建一个Student
		Person person = builder.age(1).name("zhangsan").father("zhaosi").build();
		System.out.println(person);

	}
}
