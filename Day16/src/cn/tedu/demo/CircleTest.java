package cn.tedu.demo;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println(c1.getId());
        System.out.println(c2.getId());

        Circle c3 = new Circle(0);
        System.out.println(c3.getId());

        Circle c4 = new Circle(12.0);
        System.out.println(c4.getId());

        int total = Circle.getTotal();
        System.out.println(total);
    }
}
class Circle{
    private double radius;//0.0
    private int id;//自动赋值   0
    private static int total;//所有对象共同拥有     记录创建圆对象的总数
    private static int init = 101;//用来生成圆的id

    public Circle() {
        total++;
        id = init++;//101
    }
    public Circle(double radius) {
//        total++;
//        this.id=init++;
        this();
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public int getId() {
        return id;
    }
    public static int getTotal() {
        return total;
    }
    /*求面积*/
    public double getArea(){
        return Math.PI*radius*radius;
    }
}