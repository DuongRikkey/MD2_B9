package AbstractClassandInterface.EX1;

public class Test {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Square(6);
//        for(int i = 0; i<shapes.length; i++){
////        if (shapes[i] instanceof Circle || shapes[i] instanceof Rectangle || shapes[i] instanceof Square){
////            System.out.println("Trước khi thay đổi = " + ( shapes[i]).getArea());
////            double random =Math.floor(Math.random()*100); ;
////            System.out.println("Phân trăm tăng là"+random);
////            ((Resizeable) shapes[i]).resize(random);
////            System.out.println("Sau khi thay doi"+shapes[i].getArea());
////        }}
//			{
        for(int i = 0; i<shapes.length; i++){
            if(shapes[i] instanceof Circle){
                System.out.println("Trước khi thay đổi là hình tròn"+ ((Circle) shapes[i]).getArea());
                double randomNumber = Math.random();
                System.out.println("Phần trăm sau khi đổi"+randomNumber);
                if(shapes[i] instanceof Resizeable){
                    ((Resizeable) shapes[i]).resize(randomNumber);

                }
                System.out.println("Sau khi thay đổi là"+((Circle) shapes[i]).getArea());
            }

            if(shapes[i] instanceof Square){
                System.out.println("Truước khi thay đổi là hình vuông"+((Square) shapes[i]).getArea());
                double randomNumber = Math.floor(Math.random()*100);
                System.out.println("Phần trăm thay đổi là"+randomNumber);
                if(shapes[i] instanceof Resizeable ){
                    ((Resizeable) shapes[i]).resize(randomNumber);
                }
                System.out.println("Phần tăm khi thay đổi là"+((Square) shapes[i]).getArea());
            }
            if(shapes[i] instanceof Rectangle && !(shapes[i] instanceof Square)){
                System.out.println("Trước khi thay đổi  là hình chữ nhật"+((Rectangle) shapes[i]).getArea());
                double randomNumber = Math.floor(Math.random()*100);
                System.out.println("Phần trăm khi thay đổi là"+randomNumber);
                if(shapes[i] instanceof Resizeable){
                    ((Resizeable) shapes[i]).resize(randomNumber);
                }
                System.out.println("Sau khi thay đổi là"+((Rectangle) shapes[i]).getArea());
            }


        }












//
    }
}
