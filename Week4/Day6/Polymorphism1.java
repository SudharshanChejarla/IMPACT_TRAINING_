package Week4.Day6;

public class Polymorphism1 {
    public static void main(String[] args) {
        Employee emp = new Employee("Ramesh", "Kumar", 101, "Developer");
        // System.out.println(emp.getFirstName());
        // System.out.println(emp.getLastName());
        // System.out.println(emp.getEmployeeId());

        System.out.println(emp.getFirstName()+" "+emp.getLastName()+" , "+emp.getEmployeeId());

    }
}

class Person {
    String Firstname;
    String LastName;

    Person(String Firstname, String LastName) {
        this.Firstname = Firstname;
        this.LastName = LastName;
    }

    String getFirstName() {
        return Firstname;
    }

    String getLastName() {
        return LastName;
    }
}

class Employee extends Person {

    int EmpId;
    String JobTitle;

    Employee(String Firstname, String LastName, int EmpId, String JobTitle) {
        super(Firstname, LastName);
        this.EmpId = EmpId;
        this.JobTitle = JobTitle;
    }

    int getEmployeeId() {
        return EmpId;
    }

    @Override
    String getLastName() {
        
        return super.LastName + ", " + JobTitle;
    }
}

