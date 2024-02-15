class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author: Ryan Fellin
  * 
  */
  
  public void run() {
    double Side1 = readDouble("Input the length of the first side");
    double Side2 = readDouble("Input the length of the second side");
    double angle = readDouble("Input the measurement of the angle in degrees");
    double calcresult = Math.sqrt((Math.pow(Side1, 2) + (Math.pow(Side2 , 2) - (2*Side1*Side2*(Math.cos(angle))))));
    System.out.println(calcresult);

    
  }
}