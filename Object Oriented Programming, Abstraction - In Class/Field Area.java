import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class FieldArea{
    double height;
    double width;

   public FieldArea(){

    }

    public FieldArea(double width, double height){
       if(width<0) this.width = 0;
       else this.width = width;
       if(height<0) this.height = 0;
       else this.height = height;
    }
    
    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public double setWidth(double width){
        if(width<0) this.width = 0;
        else this.width = width;
        return width;
    }
    
    public double setHeight(double height){
        if(height<0) this.height = 0;
        else this.height = height;
        return height;

    }

    public double getArea(){
        return getWidth() * getHeight();
    }

}
