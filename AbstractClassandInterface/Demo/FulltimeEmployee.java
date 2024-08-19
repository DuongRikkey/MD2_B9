package AbstractClassandInterface.Demo;

public class FulltimeEmployee extends Employee{
    @Override
    public double getSalary() {
        return 8*super.getRate();
    }
}
