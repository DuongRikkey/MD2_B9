package AbstractClassandInterface.Demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee fulltime=new FulltimeEmployee();
        Employee parttime=new ParttimeEmployee();


        if(parttime instanceof ParttimeEmployee){
            ((ParttimeEmployee) parttime).setWorkingHours(5.0);
        }

        System.out.println("Lương fulltime"+fulltime.getSalary());
        System.out.println("Lương parttime"+parttime.getSalary());

        Scanner sc=new Scanner(System.in);
        Cricle cricle=new Cricle();
        cricle.inputData(sc);
        cricle.display();
    }
}
