package Nguoi;

import java.util.Scanner;

public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher() {
        super();
    }

    public Teacher(String id, String fullName, java.util.Date dateOfBirth, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void addPerson() {
        super.addPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap khoa/phong ban (Department): ");
        this.department = scanner.nextLine();
        System.out.print("Nhap mon giang day (Teaching Subject): ");
        this.teachingSubject = scanner.nextLine();
    }

    @Override
    public void updatePerson(String id) {
        super.updatePerson(id);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cap nhat khoa/phong ban: ");
        this.department = scanner.nextLine();
        System.out.print("Cap nhat mon giang day: ");
        this.teachingSubject = scanner.nextLine();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Khoa: " + department + " | Mon day: " + teachingSubject);
    }
}
