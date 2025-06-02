// Create a program for a super class Employee(name,id,salary) which has 2 sub classes Manager(name,id,salary,bonus) and Developer(name,id,salary,overtimePay).Each sub class has its own method to calculate salary.




package Week4.Day4;

class Employee {
    String name ;
    int id ;
    int salary ;

    Employee(String name ,int id  ,int salary ) {
        this.name = name ;
        this.id = id ;
        this.salary = salary ;
    }

    int getSalary() {
        return this.salary ;
    }

}

class Manager extends Employee {
    int bonus ;

    Manager(String name ,int id  ,int salary ,int bonus ) {
        super(name, id, salary);
        this.bonus = bonus ;
    }

    int getSalary() {
        return this.salary+this.bonus ;
    }
}
class Developer extends Employee {
    int overtimePay ;

    Developer(String name ,int id  ,int salary ,int overtimePay ) {
        super(name, id, salary);
        this.overtimePay = overtimePay ;
    }

    int getSalary() {
        return this.salary+this.overtimePay ;
    }
}

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Ramesh", 900, 25000, 5000);
        System.out.println(dev.getSalary());
    }
}
