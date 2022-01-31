package org.BehaviorMethods;

public class Rect {
    private double length;
    private double width;
    private String name;

    public Rect(String name, double length, double width){
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public String output() {
        String outputString = "";

        outputString += this.name;
        outputString += " ";
        outputString += "has a length of:";
        outputString += " ";
        outputString += this.getLength();
        outputString += ". ";
        outputString += "And a width of:";
        outputString += " ";
        outputString += this.getWidth();
        outputString += ". ";

        return outputString;
    }
}