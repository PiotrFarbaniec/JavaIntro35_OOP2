package org.task8;

public class Task8 {
    public static void main(String[] args) {
        Person person1 = new Person("Andrzej", "Kozłowski", 46, "male");
        Person person2 = new Person("Anna", "Zelewska", 34, "female");
        Person preson3 = new Person("Krystian", "Lipiński", 19, "male");
        Person person4 = new Person("Anna", "Zalewska", 26, "female");
        Person person5 = new Person("Andrzej", "Kozłowski", 46, "male");

        System.out.println(person2.equals(person4));
        System.out.println(person4.equals(person2));
        System.out.println(person2.hashCode());
        System.out.println(person4.hashCode());
        System.out.println("=======================");
        System.out.println(person1.equals(person5));
        System.out.println(person5.equals(person1));
        System.out.println(person1.hashCode());
        System.out.println(person5.hashCode());
    }
}
