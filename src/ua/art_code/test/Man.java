package ua.art_code.test;

/**
 * Created by admin on 03.06.2014.
 */
public class Man {

    private String name;
    private int age;
    private double salary;
    private int group;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void some(){
        System.out.println("Say hello somme");
    }

    public void add(){
        System.out.println("Yeas");
    }

    public void minus(){
        System.out.printf("minus");
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}
