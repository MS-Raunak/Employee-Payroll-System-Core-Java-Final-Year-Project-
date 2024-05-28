public class PartTimeEmployee extends Employee{
    private int hr;
    private double hourlySal;

    public PartTimeEmployee(int id, String name, int hr, double hourlySal) {
        super(id,name);
        this.hr = hr;
        this.hourlySal = hourlySal;
    }

    @Override
    public double calculateSalary() {
        return hr*hourlySal;
    }
}
