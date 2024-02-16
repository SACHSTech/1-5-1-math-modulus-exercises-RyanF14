class AreaSin extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    double SideA = readDouble("Input value of side A");
    double SideB = readDouble("Input value of Side B");
    double Angle = readDouble("Input the value of the angle in degrees");
    double output = (SideA*SideB*Math.sin(Angle))/2;
    System.out.println(output);   
  }
}