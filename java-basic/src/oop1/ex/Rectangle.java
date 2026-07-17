package oop1.ex;

public class Rectangle {
    int width = 5;
    int height = 8;

    int calculateArea() {
        return height * width;
    }

    int calculatePerimeter() {
        return 2 * (height + width);
    }

    boolean isSquare() {
        return width == height;
    }
}
