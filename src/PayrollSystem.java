import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PayrollSystem {
    static Scanner sc = new Scanner(System.in);
     static List<Employee> employees = new ArrayList<>();
     static List<FullTimeEmployee> fullTimeEmployees = new ArrayList<>();
     static List<PartTimeEmployee> partTimeEmployees = new ArrayList<>();

     public static void menu() {
         Scanner sc = new Scanner(System.in);
         System.out.print("\n1.Add Employee\n" +
                 "2.Display Employees\n" +
                 "3.Update Employee\n" +
                 "4.Delete Employee\n" +
                 "5.Exit\n" +
                 "enter here your choice: ");
         int choice=0;

         try {
             choice = sc.nextInt();
             switch (choice) {
                 case 1: {
                     System.out.print("\n1.Add Full time employee\n" +
                             "2.Add Part time employee\n" +
                             "3.Main menu\n"+
                             "enter your choice: ");
                     int innerChoice=0;

                     try {
                         innerChoice=sc.nextInt();
                         switch (innerChoice){
                             case 1: addFullTimeEmployee();break;
                             case 2: addPartTimeEmployee();break;
                             case 3: menu();break;
                             default:
                                 System.out.println("\nInvalid input");
                         }
                     }catch (Exception e) {
                         System.out.println("\nPlease enter valid input");
                     }
                 }break;

                 case 2: {
                     System.out.print("\n1.Display All Employees\n" +
                             "2.Display Full time employee\n" +
                             "3.Display Part time employee\n" +
                             "4.Main menu\n"+
                             "enter your choice: ");
                     int innerChoice=0;

                     try {
                         innerChoice=sc.nextInt();
                         switch (innerChoice){
                             case 1: displayEmployees();break;
                             case 2: displayFullTimeEmployees();break;
                             case 3: displayPartTimeEmployees();break;
                             case 4: menu();break;
                             default:
                                 System.out.println("\nInvalid input");
                         }
                     }catch (Exception e) {
                         System.out.println("\nPlease enter valid input");
                     }
                 }break;

                 case 3: updateEmployee();break;
                 case 4: removeEmployee();break;
                 case 5: {
                     System.out.println("Thank you for Visiting!!");
                     return;
                 }
                 default:
                     System.out.println("\nPlease enter valid input");
             }
         }catch (Exception e){
             System.out.println("\nPlease enter valid input");
         }
     }

    //Add Full Time Employee
    public static void addFullTimeEmployee() {
        System.out.print("\n\nenter employee id: "); int id = sc.nextInt();
        System.out.print("enter employee name: "); String name = sc.next();
        System.out.print("enter monthly salary: "); double monthlySal = sc.nextDouble();

        Employee employee = new FullTimeEmployee(id, name, monthlySal);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(id, name, monthlySal);

        //Adding employee in the List
        employees.add(employee);
        fullTimeEmployees.add(fullTimeEmployee);

        System.out.println("\n Employee Info Added Successfully");
        System.out.println("****************************************");

        menu();

    }

    //Add Part Time Employee
    public static void addPartTimeEmployee() {
        System.out.print("\n\nenter employee id: "); int id = sc.nextInt();
        System.out.print("enter employee name: "); String name = sc.next();
        System.out.print("enter working hour: "); int workingHr = sc.nextInt();
        System.out.print("enter monthly salary: "); double hourlyRate = sc.nextDouble();

        Employee employee = new PartTimeEmployee(id,name, workingHr, hourlyRate);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(id,name, workingHr, hourlyRate);

        //Adding employee in the List
        employees.add(employee);
        partTimeEmployees.add(partTimeEmployee);

        System.out.println("\n employee added successfully");
        System.out.println("*****************************************");

        menu();
     }

    //Remove Employee By ID
    public static void removeEmployee() {
        System.out.print("\n\nenter employee id: "); int id = sc.nextInt();
        Employee employeeToRemove = null;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
            System.out.println("\nremoved successfully");
            System.out.println("*****************************************");

            menu();
        }
    }

    // Display All Employees
    public static void displayEmployees() {
        System.out.println("\n");
        if (!employees.isEmpty()) {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
        else System.out.println("\nemployees information not found!");
        System.out.println("*******************************************");
        menu();
    }

    // Display Full Time Employees
    public static void displayFullTimeEmployees() {
        System.out.println("\n");
        if (!fullTimeEmployees.isEmpty()) {
            for (FullTimeEmployee employee : fullTimeEmployees) {
                System.out.println(employee);
            }
        }
        else System.out.println("\nemployees information not found!");
        System.out.println("*****************************************");
        menu();
    }

    // Display Part Time Employees
    public static void displayPartTimeEmployees() {
        System.out.println("\n");
        if (!partTimeEmployees.isEmpty()) {
            for (PartTimeEmployee employee : partTimeEmployees) {
                System.out.println(employee);
            }
        }
        else System.out.println("\nemployees information not found!");
        System.out.println("*****************************************");
        menu();
    }

    //Update Employee
    public static void updateEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nenter employee id: ");
        int id = sc.nextInt();

        for (Employee employee: employees) {
            if (employee.getId()==id){
                System.out.print("\n1.Update id\n2.Update Name\nenter your choice");
                int choice = 0;
                try{
                    choice=sc.nextInt();
                    switch (choice) {
                        case 1: {
                            System.out.println("enter new id: "); int new_id = sc.nextInt();
                            employee.setId(new_id);
                            System.out.println("\nId Updated Successfully");
                            System.out.println("***********************************************");
                            menu();
                        }break;
                        case 2: {
                            System.out.println("enter new name: "); String new_name = sc.next();
                            employee.setName(new_name);
                            System.out.println("\nName Updated Successfully");
                            System.out.println("***********************************************");
                            menu();
                        }break;

                        default:
                            System.out.println("\nInvalid input");
                            menu();
                    }
                }
                catch (Exception e) {
                    System.out.println("\nInvalid choice..Please enter valid choice");
                    menu();
                }

            }
        }
    }
}

