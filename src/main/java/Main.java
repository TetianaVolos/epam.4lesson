import Lesson5.ArrayRectangles;
import Lesson5.Rectangle;

public class Main {
    public static void main(String[] args) {
//        int ar[] = {5, 17, 24, 5};
//        System.out.println(Task1.isSorted(ar, SortOrder.DESC));
//        System.out.println(Task1.isSorted(ar, SortOrder.ASC));
//        int[] result = Task2.transform(ar, SortOrder.DESC);
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
        //System.out.println(Task3.multiArithmeticElements(5,3,0));
        //System.out.println(Task4.sumGeometricElements(100,0.5,20));

        Rectangle r = new Rectangle(5,5);
//        System.out.println(r.getSideA());
//        System.out.println(r.getSideB());
//        System.out.println(r.isSquare());
//        System.out.println(r.perimeter());
        //r.replaceSides();
        ArrayRectangles arr = new ArrayRectangles(2);
        ArrayRectangles a = new ArrayRectangles(r,r,r);


        System.out.println(a.addRectangle(r));
    }

}
