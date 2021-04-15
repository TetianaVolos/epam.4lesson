package Lesson5;

public class ArrayRectangles {
    private Rectangle [] rectangleArray;

    public ArrayRectangles(int n) {
        rectangleArray = new Rectangle[n];
    }

    public ArrayRectangles (Rectangle ... rectangle) {
        this.rectangleArray = rectangle;
    }


    public boolean addRectangle(Rectangle rectangle) {
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] == null) {
                rectangleArray[i] = rectangle;
                return true;
            }
        }
        return false;
    }

    public int numberMaxArea() {
        int index = 0;
        double maxArea = rectangleArray[0].area();
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] != null && maxArea < rectangleArray[i].area()) {
                maxArea = rectangleArray[i].area();
                index = i;
            }
        }
        return index;
    }


    public int numberMinPerimeter() {
        int index = 0;
        double minPerimeter = rectangleArray[0].perimeter();
        for (int i = 0; i < rectangleArray.length; i++) {
            if (rectangleArray[i] != null && rectangleArray[i].perimeter() < minPerimeter) {
                minPerimeter = rectangleArray[i].perimeter();
                index = i;
            }
        }
        return index;
    }


    public int numberSquares() {
        int squaresQty = 0;
        for (Rectangle rectangle : rectangleArray) {
            if (rectangle != null && rectangle.isSquare()) {
                squaresQty++;
            }
        }
        return squaresQty;
    }
}
