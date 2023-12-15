package domain;

public class Course {

    private String name;
    private int hoursADay;
    private int hoursAWeek;
    private Shift shift;
    private double cost;
    private String[] students = new String[5];

    public enum Shift {
        MORNING,
        EVENING
    }

    // constructors
    public Course() {
    }

    public Course(String name, int hoursADay, int hoursAWeek, Shift shift, double cost, String[] students) {
        this.name = name;
        this.hoursADay = hoursADay;
        this.hoursAWeek = hoursAWeek;
        this.shift = shift;
        this.cost = cost;
        this.students = students;
    }
    
    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursADay() {
        return hoursADay;
    }

    public void setHoursADay(int hoursADay) {
        this.hoursADay = hoursADay;
    }

    public int getHoursAWeek() {
        return hoursAWeek;
    }

    public void setHoursAWeek(int hoursAWeek) {
        this.hoursAWeek = hoursAWeek;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(char shift) {       
        switch (shift) {
            case 'M':
                this.shift = Shift.MORNING;
                break;
            case 'T':
                this.shift = Shift.EVENING;
                break;
            default:
                throw new Error("Opción inválida");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", hoursADay=" + hoursADay + ", hoursAWeek=" + hoursAWeek + ", shift=" + shift + ", cost=" + cost + ", students=" + students.length + '}';
    }
    
    
    
}
