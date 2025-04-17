public class Rectangle{
private double length;
private double width;

public Rectangle(double length, double width){
    this.width = width;
    this.length = length;
}
    
public double getWidth(){
    return this.width;
}

public double getLength(){
    return this.length;
}

public double perimeter(){
    return 2*(this.length + this.width);
}

public double area(){
    return this.length * this.width;
}

}