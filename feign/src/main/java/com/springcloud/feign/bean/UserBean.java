package com.springcloud.feign.bean;

/**
 * ClassName:UserBean</br>
 * Function: UserBean，实现类</br>
 *
 * @author ce.lv</br>
 * @version 1.0</br>
 * @Date 2018/6/29 15:25</br>
 */
public class UserBean {
    private String name;
    private int age;
    private String sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
