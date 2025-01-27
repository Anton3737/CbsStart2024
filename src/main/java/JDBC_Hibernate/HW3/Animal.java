package JDBC_Hibernate.HW3;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Animal {
    @Id
    private int id;
    private int age;
    private String name;
    private boolean tail;

    public Animal() {
    }

    public Animal(int id, int age, String name, boolean tail) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.tail = tail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }
}
