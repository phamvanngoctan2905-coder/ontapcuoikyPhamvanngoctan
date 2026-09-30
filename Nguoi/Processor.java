package Nguoi;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonList list = new PersonList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by id");
            System.out.println("4. Delete person by id");
            System.out.println("5. Find person by id");
            System.out.println("6. Display all students and teachers");
            System.out.println("0. Exit");
            System.out.print("Chon chuc nang (0-6): ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                choice = -1;
            }

            switch (choice) {
                case 1:
                    System.out.println("\n--- Them sinh vien moi ---");
                    list.addPerson(new Student());
                    break;
                case 2:
                    System.out.println("\n--- Them giang vien moi ---");
                    list.addPerson(new Teacher());
                    break;
                case 3:
                    System.out.print("\nNhap ID can cap nhat: ");
                    String updateId = scanner.nextLine();
                    list.updatePerson(updateId);
                    break;
                case 4:
                    System.out.print("\nNhap ID can xoa: ");
                    String deleteId = scanner.nextLine();
                    list.deletePersonById(deleteId);
                    break;
                case 5:
                    System.out.print("\nNhap ID can tim: ");
                    String findId = scanner.nextLine();
                    Person found = list.findPersonById(findId);
                    if (found != null) {
                        System.out.println("Ket qua tim kiem:");
                        found.displayInfo();
                    } else {
                        System.out.println("Khong tim thay nguoi co ID: " + findId);
                    }
                    break;
                case 6:
                    System.out.println("\n--- Danh sach tat ca sinh vien va giang vien ---");
                    list.displayEveryone();
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
            }
        } while (choice != 0);
    }
}
