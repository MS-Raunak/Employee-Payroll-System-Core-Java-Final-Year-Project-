abstract public class Employee {
    private int id;
    private String name;

    //Parameterized constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Getter Methods(Accessing Name & ID in outside class)
    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    //Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    //abstract method
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' + calculateSalary() + "}";

    }
}
