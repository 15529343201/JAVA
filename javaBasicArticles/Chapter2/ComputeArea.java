public class ComputeArea{
  public static void main(String[] args){
    final double PI = 3.14159;//declare a constant
    
    //Assign a radius
    double radius = 20;

    //Compute area
    double area = radius * radius * PI;
    
    //Display results
    System.out.println("The area for the circle of radius "+
      radius +" is "+area);
   }
}