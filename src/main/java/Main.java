import Lesson5.ArrayRectangles;
import Lesson5.Rectangle;
import Lesson6.Manager;
import Lesson6.SalesPerson;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
////        int ar[] = {5, 17, 24, 5};
////        System.out.println(Task1.isSorted(ar, SortOrder.DESC));
////        System.out.println(Task1.isSorted(ar, SortOrder.ASC));
////        int[] result = Task2.transform(ar, SortOrder.DESC);
////        for (int i = 0; i < result.length; i++) {
////            System.out.println(result[i]);
////        }
//        //System.out.println(Task3.multiArithmeticElements(5,3,0));
//        //System.out.println(Task4.sumGeometricElements(100,0.5,20));
//
//        Rectangle r = new Rectangle(5,7);
//        Rectangle r1 = new Rectangle();
//        Rectangle r2 = new Rectangle(10,10);
////        System.out.println(r.getSideA());
////        System.out.println(r.getSideB());
////        System.out.println(r.isSquare());
////        System.out.println(r.perimeter());
//        //r.replaceSides();
//        ArrayRectangles arr = new ArrayRectangles();
////        ArrayRectangles a = new ArrayRectangles(r,r1,r2);
//        System.out.println(arr.addRectangle(r));
//        System.out.println(arr.addRectangle(r1));
//        System.out.println(arr.addRectangle(r2));
//        System.out.println(arr.numberMaxArea());
//        System.out.println(arr.numberMinPerimeter());
//        System.out.println(arr.numberSquares());
        Manager m1 = new Manager("test", BigDecimal.valueOf(1000), 101);
        SalesPerson s1 = new SalesPerson("sale", BigDecimal.valueOf(1000),501);
        m1.setBonus(BigDecimal.valueOf(0));
        s1.setBonus(BigDecimal.valueOf(10));
        s1.setPercent(1);
//        System.out.println(m1.getName());
//        System.out.println(m1.getSalary());
//        System.out.println(m1.getQuantity());
        System.out.println(s1.toPay());
    }

}
