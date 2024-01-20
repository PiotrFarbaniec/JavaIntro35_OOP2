package org.task8;

import java.util.Objects;

public class Person {
private String name;
private String surname;
private int age;
private String gender;

    public Person(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person p = (Person) o;
        return age == p.age && Objects.equals(name, p.name) &&
                Objects.equals(surname, p.surname) &&
                Objects.equals(gender, p.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, gender);
    }
}
