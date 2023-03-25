public class Department {
    private String name;
    private int numberOfEmployees;
    private Firm firm;

    public Department(String name, int numberOfEmployees, Firm firm) {
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.firm = firm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Firm getFirm() {
        return firm;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
    }
}
