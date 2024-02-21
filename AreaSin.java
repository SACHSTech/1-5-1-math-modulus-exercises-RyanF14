class AreaSin extends ConsoleProgram {

  /**
  * Description
  * @author:Ryan Fellin
  * Simple program which calculates the area of a triangle using 2 sides and the sin of an angle
  * SideA - Defines the first side of the triangle
  * SideB - Defines the second side of the triangle
  * Angle - Defines the value of the angle in degrees
  * output - Outputs the area of the triangle
  */
  
  public void run() {
    
    double SideA = readDouble("Input value of side A");
    double SideB = readDouble("Input value of Side B");
    double Angle = readDouble("Input the value of the angle in degrees");
    double output = (SideA*SideB*Math.sin(Math.toRadians(Angle)))/2;
 
    System.out.println(output);   
  }
}