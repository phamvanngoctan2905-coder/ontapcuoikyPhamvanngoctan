package Nguoi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Person implements IPerson {

    private String id;
    private String fullName;
    private Date dateOfBirth;

    public Person() {
    }

    public Person(String id, String fullName, Date dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void addPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        this.id = scanner.nextLine();
        System.out.print("Nhap ho va ten: ");
        this.fullName = scanner.nextLine();
        System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
        String dobStr = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dateOfBirth = sdf.parse(dobStr);
        } catch (ParseException e) {
            System.out.println("Dinh dang ngay khong hop le. Dat mac dinh la ngay hien tai.");
            this.dateOfBirth = new Date();
        }
    }

    @Override
    public void updatePerson(String id) {
        this.id = id;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cap nhat ho va ten: ");
        this.fullName = scanner.nextLine();
        System.out.print("Cap nhat ngay sinh (dd/MM/yyyy): ");
        String dobStr = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dateOfBirth = sdf.parse(dobStr);
        } catch (ParseException e) {
            System.out.println("Dinh dang ngay khong hop le.");
        }
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dobStr = (dateOfBirth != null) ? sdf.format(dateOfBirth) : "N/A";
        System.out.print("ID: " + id + " | Ho ten: " + fullName + " | Ngay sinh: " + dobStr);
    }
}
