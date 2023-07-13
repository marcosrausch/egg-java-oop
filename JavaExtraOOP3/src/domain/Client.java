package domain;

public class Client {

    // attributes
    private String name;
    private int ID;
    private byte age;
    private short height;
    private short weight;
    private String goal;
   
    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", ID=" + ID + ", age=" + age + ", height=" + height + ", weight=" + weight + ", goal=" + goal + '}';
    }
    
    // constructors
    public Client(String name, int ID, byte age, short height, short weight, String goal) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.goal = goal;
    }

    public Client() {
    }

    // setters & getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public short getHeight() {
        return height;
    }

    public void setHeight(short height) {
        this.height = height;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
    
}
