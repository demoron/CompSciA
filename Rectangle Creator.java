 public class Rectangle
{
    
    //instance variables - the attributes of the class Rectangle
    private int width;
    private int height;
    
    //this is called the constructor
    public Rectangle(int rectWidth, int rectHeight){
        width = rectWidth;
        height = rectHeight;
    }
    
    //the are called accessors or getters
  
     //this is an example of a method
    public int getArea(){
        return width * height;
    }
    
    
    public void printArea(){
        int Area = width * height;
        System.out.println(Area);
    }
