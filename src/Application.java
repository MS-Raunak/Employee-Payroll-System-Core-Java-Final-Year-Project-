import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("******** Welcome to the Employee Payroll System Application ********");

        Scanner sc = new Scanner(System.in);
        System.out.println("1.Menu\n2.Exit\nenter here your choice: ");
        int choice=0;
        try {
            choice = sc.nextInt();
            PayrollSystem payrollSystem = new PayrollSystem();
            switch (choice){
                case 1: payrollSystem.menu();break;
                case 2:{
                    System.out.println("Thank you for visiting!!");
                    return;
                }
                default:
                    System.out.println("Please enter valid input");
            }

        }
        catch (Exception e) {
            System.out.println("Please enter Valid Choice");
        }


        }

/*
        Employee employee = new FullTimeEmployee(1, "A", 12000);
        Employee employee2 = new FullTimeEmployee(2, "B", 16000);
        Employee employee3 = new PartTimeEmployee(3, "a", 3, 1200);

        PayrollSystem p = new PayrollSystem();

        p.addEmployee(employee);
        p.addEmployee(employee2);

        p.addEmployee(employee3);

       p.displayEmployees();
       p.removeEmployee(1);
       p.displayEmployees();

 */

}