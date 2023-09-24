package Geometric;

public abstract class GeometricObject {
    private String fillColor;
    private String borderColor;

    //  Default Constructor
    public GeometricObject() {
        fillColor = "White";
        borderColor = "Black";
    }

    //  Parameterized Constructor
    public GeometricObject(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    //  Mutator Method
    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    //  Accessor Method
    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public abstract double findArea();

    public abstract double findCircumference();
}