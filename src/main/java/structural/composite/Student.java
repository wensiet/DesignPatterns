package structural.composite;

import item.Item;

public class Student extends Item implements UniversityMember {

    public Student(String name, String major) {
        setName(name);
        this.major = major;
    }

    private final double gpa = Math.random() * 10;
    private final String major;

    @Override
    public void getInfo() {
        System.out.println(getName() + " with GPA: " + gpa + ", studying on: " + major);
    }
}
