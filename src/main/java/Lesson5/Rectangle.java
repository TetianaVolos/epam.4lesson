package Lesson5;

public class Rectangle {
 private double sideA;
 private double sideB;


        public Rectangle(double a, double b) {
            if (a > 0) this.sideA = a;
            else throw new IllegalArgumentException();
            if (b > 0) this.sideB = b;
            else throw new IllegalArgumentException();
        }

        public Rectangle(double a) {
            if (a > 0) this.sideA = a;
            else throw new IllegalArgumentException();
            sideB = 5;
        }

        public Rectangle() {
            sideA = 4;
            sideB = 3;
        }

        /**
         * <summary>
         * Implement code according to description of task.
         * </summary>
         */
        public double getSideA() {
            return this.sideA;
        }

        /**
         * <summary>
         * Implement code according to description of task.
         * </summary>
         */
        public double getSideB() {
            return this.sideB;
        }

        /**
         * <summary>
         * Implement code according to description of task.
         * </summary>
         */
        public double area() {
            return this.sideA*this.sideB;
        }

        /**
         * <summary>
         * Implement code according to description of task.
         * </summary>
         */
        public double perimeter() {
            return 2*(this.sideA+this.sideB);
        }

        /**
         * <summary>
         * Implement code according to description of task.
         * </summary>
         */
        public boolean isSquare() {
            boolean result;
            if (this.sideA == this.sideB) {
                result = true;
            }
            else {
               result = false;
            }
            return result;
        }

        /**
         * <summary>
         * Implement code according to description of task.
         * </summary>
         */
        public void replaceSides() {
        double temp;
        temp = this.sideA;
        sideA = this.sideB;
        this.sideB = temp;
        System.out.println(sideA);
        System.out.println(sideB);
        }



}
