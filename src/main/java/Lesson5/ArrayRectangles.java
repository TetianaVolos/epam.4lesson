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
        boolean result = false;
        if (rectangle == null || rectangleArray.length <= 0) throw new IllegalArgumentException();
        for (int i=0; i < rectangleArray.length; i++) {
            if (rectangleArray [i] == null) {
                result = false;
            }
            else {
                rectangleArray [i] = rectangle;
                result = true;

            }
        }
        
        return result;
    }
}
