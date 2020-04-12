package day51.polymorphism;

public abstract class Shape {

    public abstract void draw () ;
}

class Triangle extends Shape {
    @Override
    public void draw () {
        System.out.println("DRAWING TRIANGLE");
    }
}

class Circle extends Shape {
    @Override
    public void draw () {
        System.out.println("DRAWING CIRCLE");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw () {
        System.out.println("DRAWING RECTANGLE");
    }
}

class Oval extends Shape {
    @Override
    public void draw () {
        System.out.println("DRAWING OVAL");
    }
}

class Rhombus extends Shape {
    @Override
    public void draw () {
        System.out.println("DRAWING RHOMBUS");
    }
}