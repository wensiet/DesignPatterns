package structural.composite;

import item.Item;

public class Professor extends Item implements UniversityMember {

    public Professor(String name, String discipline) {
        setName(name);
        this.discipline = discipline;
    }

    private final String discipline;
    private final double salary = Math.random() * 1000;

    @Override
    public void getInfo() {
        System.out.println("Prof. " + getName() + " with salary: " + salary + ", teaching: " + discipline);
    }
}
