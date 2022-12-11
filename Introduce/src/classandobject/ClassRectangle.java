package classandobject;

public class ClassRectangle {
    private int width;
    private int height;
    public ClassRectangle(int width,int height){
        this.width = width;
        this.height = height;
    }
    public int getArea(){
        return this.width*this.height;
    }
    public int Perimeter(){
        return (this.width+this.height)*2;
    }

    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }


}
