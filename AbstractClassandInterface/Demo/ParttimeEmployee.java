package AbstractClassandInterface.Demo;

public class ParttimeEmployee extends Employee{
    private Double workingHours;

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(Double workingHours) {
        this.workingHours = workingHours;
    }

    public Double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Double workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public double getSalary() {
        return this.workingHours*super.getRate();
    }
}
