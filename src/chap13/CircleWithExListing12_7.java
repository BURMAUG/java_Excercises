package chap13;

public class CircleWithExListing12_7 {
    private double radius;
    private static int numberOfObjects = 0;
    private static final double PI = 3.14159;

    public CircleWithExListing12_7() {
        this(1.0);
    }

    public CircleWithExListing12_7(double radius) {
        setRadius(radius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException{
        if (radius > 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("YOU CAN'T HAVE A NEGATIVE RADIUS");
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public static void setNumberOfObjects(int numberOfObjects) {
        CircleWithExListing12_7.numberOfObjects = numberOfObjects;
    }

    public double findArea()
    {
        return radius*radius * PI;
    }

    public static void main(String[] args) {
        try {
            CircleWithExListing12_7 circle1 = new CircleWithExListing12_7(4);
            CircleWithExListing12_7 circle3 = new CircleWithExListing12_7(-2);
            CircleWithExListing12_7 circle2 = new CircleWithExListing12_7(34);
            CircleWithExListing12_7 circle4 = new CircleWithExListing12_7(3);
        }catch (IllegalArgumentException ex)
        {
            System.out.println(ex);
        }finally {
            System.out.println("enter here finally");
        }
        System.out.println(getNumberOfObjects());
    }
}
