package AbstractClassandInterface.EX2;

public class TEST {
    public static void main(String[] args) {
        // Tạo mảng các đối tượng hình học
//        Shape[] shapes = new Shape[3];
//        shapes[0] = new Square(5, "red", true); // Square là Colorable
//        shapes[1] = new Circle(3, "blue", true); // Circle không phải là Colorable
//        shapes[2] = new Rectangle(4, 6, "green", false); // Rectangle không phải là Colorable
//
//        // Hiển thị diện tích và gọi howToColor nếu là Colorable
//        for (Shape shape : shapes) {
//            System.out.println("Area: "+shape.toString()  + shape.getArea());
//
//            // Nếu hình là Colorable, gọi phương thức howToColor
//            if (shape instanceof Colorable) {
//                ((Colorable) shape).howtoColor();
//            }
//        }

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4,5);
        shapes[2] = new Square(4);
        {
         for(int i=0;i<shapes.length;i++){
             if(shapes[i] instanceof Colorable){
                 ((Colorable) shapes[i] ).howtoColor();

             }
             if(shapes[i] instanceof Square){
                 System.out.println("Diện tích hình vuông"+ ((Square) shapes[i]).getArea());

             }
             if(shapes[i] instanceof Circle){
                 System.out.println("Diện tích hình tròn"+ ((Circle) shapes[i]).getArea());
             }
             if(shapes[i] instanceof Rectangle){
                 System.out.println("Diện tích hình chữ nhật"+ ((Rectangle) shapes[i]).getArea());
             }

         }

    }
}}
