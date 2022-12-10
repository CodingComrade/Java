public abstract class Shape {
    protected String color;
    protected double height;
    protected double width;
    protected double base;

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getBase() {
        return base;
    }

    public abstract double getArea();

    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public void displayShapeName() {
        System.out.println("I am a Shape");
    }
}
