public class StaffEmployee extends Employee{
    private double bonus;

    public StaffEmployee(String fullName, String position, double salary, Department department, double bonus) {
        super(fullName, position, salary, department);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
