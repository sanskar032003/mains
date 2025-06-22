package utils;
import geometry.circle;
import geometry.rectangle;

public class calculator {
    public static void main(String[] args) {
        circle c1 = new circle(12);
        rectangle r1 = new rectangle(2,3);

        double cirarea = Math.PI * Math.pow(c1.radius , 2);
        double recarea = r1.l1 * r1.l2;

        System.out.printf("area of circle is : %f ,  area of rectangle is : %f" , cirarea,recarea);
    }

}
