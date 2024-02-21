class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author: Ryan Fellin
  * Calculates the the third side of a triangle using the law of cosines
  * Side1 - User inputted length of the first side of the triangle
  * Side2 - User inputted length of the second side of the triangle
  * angle - User inputted value of the angle in degrees
  * calcresult - calculated length of the missing side
  */
  
  public void run() {
    double Side1 = readDouble("Input the length of the first side");
    double Side2 = readDouble("Input the length of the second side");
    double angle = readDouble("Input the measurement of the angle in degrees");
    double calcresult = Math.sqrt(((Math.pow(Side1, 2) + (Math.pow(Side2 , 2) - (2*Side1*Side2*(Math.cos(Math.toRadians(angle))))))));
    System.out.println(calcresult);

    
  }
}