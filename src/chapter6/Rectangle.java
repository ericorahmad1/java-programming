package chapter6;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double width, double length){
        this.length = length;
        setWidth(width); // alternative can be set this way
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    double getWidth() {
        return width;
    }

    void setWidth(double width){
        this.width = width;
    }

    double calculatePerimeter(){
        return (2 * length) + (2*width);
    }

    double calculateArea(){
        return length * width;
    }
}
