package chunjae;

class Shape {
    public void draw() {
        System.out.println("모양을 그립니다.");
    }

    public void delete() {
        System.out.println("모양을 지웁니다.");
    }
}

class Circle extends Shape {

    public void draw() {
        System.out.println("원을 그립니다");
    }

    public void delete() {
        System.out.println("원을 지웁니다");
    }

    public void sayCircle() {
        System.out.println("안녕하세요 원입니다");
    }
}

public class UpcastingClassTest {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.draw();
        s.delete();
        System.out.println();

        //클래스의 기본적인 사용법
        Circle c = new Circle();
        c.draw();
        c.delete();
        c.sayCircle();
        System .out.println();

        //Upcasting의 사용
        Shape c1 = new Circle();
        c1.draw();
        c1.delete();
        //c1.sayCircle(); 에러가 발생합니다
        System.out.println();

        Shape shape = new Circle();
        Circle circle = (Circle) shape;
        circle.sayCircle();

//        if (circle instanceof Shape) {
//            System.out.println("the object is a Circle");
//        } else {
//            System.out.println("The object is not a Circle");
//        }

//        Circle cc = (Circle) new Shape();
//        cc.sayCircle();
    }

}