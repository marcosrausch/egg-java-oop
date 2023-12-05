package domain;

import services.Society;

public class Human {

    private String name;
    private byte age;
    private short weight;
    private float height;
    private Sex sex;
    boolean isAdult;
    byte IMC;

    public enum Sex {
        MALE,
        FEMALE,
        OTTER
    }

    // constructors
    public Human() {
    }

    public Human(String name, byte age, short weight, float height, Sex sex) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.isAdult = Society.oldEnoughToDrink(age);
        this.IMC = Society.bodyShame(this);
    }

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        this.isAdult = adult;
    }

    public byte getIMC() {
        return IMC;
    }

    public void setIMC(byte IMC) {
        this.IMC = IMC;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + ", sex=" + sex + ", adult=" + isAdult + ", IMC=" + IMC + '}';
    }

}
