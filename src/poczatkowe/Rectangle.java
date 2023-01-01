package poczatkowe;

public class Rectangle {
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    Rectangle(){

    }
    double width = 1.0;
    double height = 1.0;

    public double getArea(){
        return width * height;
    }
    public double getPerimiter(){
        return 2 * width + 2 * height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
