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

        String name;
        int age;
        String dg;
        long mob;
        String depart;
        String sp;

        Hospital hp = new Hospital();
        Scanner sc = new Scanner(System.in);
        System.out.println("**************----------************-----------*****************------------************");
        System.out.println("Welcome to the Hospital Management system");
        System.out.println("**************----------************-----------*****************------------************");

        int n = 0;

        while(true){
            System.out.println("Please enter 1 for add Doctors");
            System.out.println("Please enter 2 for display the Doctors.");

            n = sc.nextInt();

            

            switch(n){
                case 1:
                    System.out.println("Enter the doctor name: ");
                    name = sc.nextLine();
                    System.out.println("Enter the age: ");
                    age = sc.nextInt();
                    System.out.println("Enter the highest degre: ");
                    dg = sc.nextLine();
                    System.out.println("Enter the mobile no. : ");
                    mob = sc.nextLong();
                    System.out.println("Enter the departmentin which doctor works: ");
                    depart = sc.nextLine();
                    System.out.println("Specialist in: ");
                    sp = sc.nextLine();
                    Doctor doc = new Doctor(name, age, dg, mob, depart, sp);
                    hp.addDoctor(doc);
                    System.out.println("**************----------************-----------*****************------------************");

                    break;

                case 2:
                    if(hp.al1.isEmpty()){
                        System.out.println("Not any docters are persent. ");
                        System.out.println("**************----------************-----------*****************------------************");
                    }else{
                        hp.displayDoctors();
                        System.out.println("**************----------************-----------*****************------------************");
                    }
                    break;
                    
            }




        }

    }

}
