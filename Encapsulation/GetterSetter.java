package Encapsulation;

public class GetterSetter {
    private int salary;

    // a setter method that assign a
    // value to the salary variable
    void setSalary(int s)
    {
        if(s < 0 )
        {
            s = -s;
        }
        this.salary = s;
    }


    // a getter method to retrieve
    // the salary
    int getSalary()
    {
        return this.salary;
    }

    public void storeSalaryDB(int salary)
    {
        // code for storing the salary in the database
        System.out.println("Salary Stored in database");
    }

    // main method
    public static void main(String args[])
    {
        // creating an object of the class GetterSetterExample
        GetterSetter obj = new GetterSetter();

        obj.setSalary(-50000);

        int salary = obj.getSalary();

        // storing salary in database
        obj.storeSalaryDB(salary);

    }
}
