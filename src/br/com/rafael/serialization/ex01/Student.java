package br.com.rafael.serialization.ex01;

import java.io.Serializable;

//This is a flag interface which is used to only say a meaning.
//Nothing should be implemented.

public class Student implements Serializable  {
    private long id;
    private String name;
    private transient String password;
//   Transient means that the attribute is not to be serialized.
//   Then its value will be saved as its default (null, 0, 0.0 or false according to the data type).
    private static final String school;
    private static long index;
//  Static attributes are not serializable because they do not belong to any object but rather to the class.

    static {
        school = "Java School";
    }

    public Student(String name, String password) {
        this.name = name;
        this.password = password;
        this.id = ++index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "name=" + name + ", password=" + password + ", id=" + id + ", school=" + school;
    }
}
