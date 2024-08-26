package FactoryMethod;

import java.util.Scanner;

interface Shape{
    void draw();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("This is Circle.");
    }
}
class Rectangle implements Shape{
    public void draw() {
        System.out.println("This is Rectangle.");
    }
}

interface Factory{
    Shape factoryMethod();
}

class ConcreteFactoryCircle implements Factory {
    public Shape factoryMethod() {
        return new Circle();
    }
}

class ConcreteFactoryRectangle implements Factory{
    public Shape factoryMethod(){
        return new Rectangle();
    }
}
public class ShapeDrawing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the shape you want: circle/rectagle.");
        String user_requiredShape=input.nextLine();

        try {
            Factory f = null;

            if (user_requiredShape.equalsIgnoreCase("circle"))
                f = new ConcreteFactoryCircle();
            else if (user_requiredShape.equalsIgnoreCase("rectangle"))
                f = new ConcreteFactoryRectangle();

            Shape s = f.factoryMethod();
            s.draw();
        }catch(NullPointerException e){
            System.out.println("Select either circle or rectangle.");
        }
    }
}
