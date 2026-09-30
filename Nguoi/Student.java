package Nguoi;

import java.util.Scanner;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student() {
        super();
    }

    public Student(String id, String fullName, java.util.Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void addPerson() {
        super.addPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap GPA: ");
        this.gpa = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhap chuyen nganh (Major): ");
        this.major = scanner.nextLine();
    }

    @Override
    public void updatePerson(String id) {
        super.updatePerson(id);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cap nhat GPA: ");
        this.gpa = Float.parseFloat(scanner.nextLine());
        System.out.print("Cap nhat chuyen nganh: ");
        this.major = scanner.nextLine();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | GPA: " + gpa + " | Chuyen nganh: " + major);
    }
}
