package AbstractClassandInterface.EX4;

public class Test {
    public static void main(String[] args) {
        Shape cricle=new Cricle("blue",3);
        Shape rectangle=new Rectangle("RED",4,5);


        System.out.println("Diện tích hình tròn");
        System.out.println(cricle.getArea());
        System.out.println();
        System.out.println("Dien tich hinh cn");
        System.out.println(rectangle.getArea());
    }
}
