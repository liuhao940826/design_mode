package builder;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 4:13 PM 2019/5/29
 */
public class PersonBuilder {

    // 需要构建的对象
    private Person person = new Person();

    public PersonBuilder age(int age) {
        person.setAge(age);
        return this;
    }

    public PersonBuilder name(String name) {
        person.setName(name);
        return this;
    }

    public PersonBuilder father(String fatherName) {
        Father father = new Father();
        father.setName(fatherName);
        person.setFather(father);
        return this;
    }

    // 构建对象
    public Person build() {
        return person;
    }
}
