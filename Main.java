import java.sql.*;
import java.util.Scanner;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or2
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    EmployeeService service = new EmployeeService();
    static  boolean ordering = true;

    public static void menu(){
        System.out.println("*********Welcome To Management System**********"
        + "\n1. Add Employee"
        + "\n2. View Employee"
        + "\n3. Update Employee"
         + "\n4. Delete Employee"
        + "\n5. View All Employee"
        + "\n5. Exit ");
    }
    public static void main(String[] args) throws ClassNotFoundException{
        Scanner sc=new Scanner(System.in);
        EmployeeService service=new EmployeeService();

        do {
            menu();
            System.out.println("Enter your Choice");
            int choice=sc.nextInt();
            switch(choice) {

                case 1:
                    System.out.println("Add Employee");
                    service.addEmp();
                    break;
                case 2:
                    System.out.println("View Employee");
                    service.viewEmp();
                    break;
                case 3:
                    System.out.println("Update Employee");
                    service.updateEmployee();
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    service.deleteEmp();
                    break;
                case 5:
                    System.out.println("view All Employee");
                    service.viewAllEmps();
                    break;
                case 6:
                    System.out.println("Thank you for using application!!");
                    System.exit(0);

                default:
                    System.out.println("Please enter valid choice");
                    break;
            }
        }while(ordering);

    }

}
