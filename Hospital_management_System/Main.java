package Hospital_management_System;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Doctor {
    private String name;
    private int age;
    private String degree;
    private long mobileNo;
    private String department;
    private String specialist;

    Doctor(String name, int age, String degree, long mobileNo, String department, String specialist) {
        this.name = name;
        this.age = age;
        this.degree = degree;
        this.mobileNo = mobileNo;
        this.department = department;
        this.specialist = specialist;
    }

    public String toString() {
        return "Doctor [ name " + name + " age " + age + " degree " + degree + " mobile no. " + mobileNo
                + " department " + department + " specialist " + specialist + "]";
    }

}

class Patient {
    private String name;
    private int age;
    private String department;
    private String address;

    Patient(String name, int age, String department, String address) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.address = address;
    }
}

class Hospital {
    ArrayList<Doctor> al1;
    ArrayList<Patient> al2;

    Hospital() {
        al1 = new ArrayList<Doctor>();
        al2 = new ArrayList<Patient>();
    }

    public void addDoctor(Doctor e) {
        al1.add(e);

    }

    public void displayDoctors() {
        Iterator<Doctor> itr1 = al1.iterator();
        while (itr1.hasNext()) {

            System.out.println(itr1.next());
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Hospital hp = new Hospital();
        Scanner sc = new Scanner(System.in);
        Doctor doc = new Doctor("Rajan", 22, "MCA", 6386000183l, "Computer", "Software_Engineer");
        Doctor doc1 = new Doctor("Rajan", 22, "MCA", 6386000183l, "Computer", "Software_Engineer");
        Doctor doc2 = new Doctor("Rajan", 22, "MCA", 6386000183l, "Computer", "Software_Engineer");
        hp.addDoctor(doc);
        hp.addDoctor(doc1);
        hp.addDoctor(doc2);
        hp.displayDoctors();

    }

}
