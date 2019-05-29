package builder;

/**
 * @Author: liuhao
 * @Description:
 * @Date: Create in 4:13 PM 2019/5/29
 */
public class Person {

    private String name;

    private Father father;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }
}
