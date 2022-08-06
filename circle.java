/*Design a class named Circle containing following attributes and behavior.
        • One double data field named radius. The default value is 1.
        • A no-argument constructor that creates a default circle.
        • A Single argument constructor that creates a Circle with the specified radius.
        • A method named getArea() that returns area of the Circle.
        • A method named getPerimeter() that returns perimeter of it.
  Prepared by Trasadiya Dhrumil 21CE146


        */



public class circle {
    private double radius = 1 ;

    circle()
    {
        System.out.println("Defaut circle of radius " + radius + " is formed"); //Default constructor
    }
    circle(double radius )
    {
        this.radius = radius ;
    }

    float getarea()
    {
        float area = (float)(3.14 * radius * radius) ;
        return area;
    }
    float getperimeter()
    {
        float perimeter = (float)(2 * 3.14 * radius);
        return perimeter;
    }
}
