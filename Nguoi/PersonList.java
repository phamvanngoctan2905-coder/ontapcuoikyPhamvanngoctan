package Nguoi;

import java.util.ArrayList;

public class PersonList {

    private ArrayList<Person> personList;

    public PersonList() {
        this.personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void addPerson(Person person) {
        person.addPerson();
        personList.add(person);
        System.out.println("Them thanh cong!");
    }

    public void updatePerson(String id) {
        Person person = findPersonById(id);
        if (person != null) {
            person.updatePerson(id);
            System.out.println("Cap nhat thong tin thanh cong!");
        } else {
            System.out.println("Khong tim thay nguoi co ID: " + id);
        }
    }

    public void deletePersonById(String id) {
        Person person = findPersonById(id);
        if (person != null) {
            personList.remove(person);
            System.out.println("Da xoa nguoi co ID: " + id);
        } else {
            System.out.println("Khong tim thay nguoi co ID: " + id);
        }
    }

    public Person findPersonById(String id) {
        for (Person p : personList) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public void displayEveryone() {
        if (personList.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        for (Person p : personList) {
            p.displayInfo();
        }
    }
}
