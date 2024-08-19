package AbstractClassandInterface.Demo;

public abstract class Employee {
    private final Double rate=20000.0;

    public abstract double getSalary();

    public Double getRate() {
        return rate;
    }
}
