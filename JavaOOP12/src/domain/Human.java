package domain;

import java.time.LocalDate;
import java.time.Period;

public class Human {    
    private String name;
    private LocalDate birthDate;
    
    public Period getAge(LocalDate dateOfBirth) {
       return Period.between(LocalDate.now(), birthDate);
    }
    
    public boolean youngerThan(int age) {
        return age < getAge(getBirthDate()).getYears();
    }
    
    // constructors
    public Human() {
    }

    public Human(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    
    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", birthDate=" + birthDate + '}';
    }    
    
}
