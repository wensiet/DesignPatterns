package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class UniversityMembersManager implements UniversityMember {
    private final List<Student> students;
    private final List<Professor> professors;

    private final String name;

    public UniversityMembersManager(String name) {
        students = new ArrayList<>();
        professors = new ArrayList<>();
        this.name = name;
    }

    public UniversityMembersManager(String name, List<Student> students, List<Professor> professors) {
        this.students = new ArrayList<>(students);
        this.professors = new ArrayList<>(professors);
        this.name = name;
    }


    @Override
    public void getInfo() {
        System.out.println("University " + name);
        System.out.println("------------------------------");
        System.out.println("Students: ");
        for (var student : students) {
            student.getInfo();
        }
        System.out.println();
        System.out.println("Professors: ");
        for (var professor : professors) {
            professor.getInfo();
        }
        System.out.println("------------------------------");
    }
}
