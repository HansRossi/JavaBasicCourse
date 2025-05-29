package me.giovanni.homeworks;

public class Person {
    public String name;
    public int age;
    public String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }

    public void displayInfo() {
        System.out.printf("Name: %s, age: %d, profession: %s\n", name, age, profession);
    }

    public static void main(String[] args) {
        Person firstPerson = new Person("John", 30, "Ing");
        Person secondPerson = new Person("Mary", 25, "Teacher");
        Person thirdPerson = new Person("Bob", 35, "Doctor");

        firstPerson.displayInfo();
        secondPerson.displayInfo();
        thirdPerson.displayInfo();

        firstPerson.setProfession("Pilot");
        firstPerson.displayInfo();
    }

}
