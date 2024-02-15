class Rads extends ConsoleProgram {

  /**
  * Description
  * @author:Ryan Fellin
  * Simple Program that Converts Degrees to Radians
  * DegInput - Defines the degrees inputted by the user
  * RadianOUT - Defines the result of the conversion, which is then displayed to the user
  */
  
  public void run() {
    //Input Degrees
    double DegInput = readDouble("Input Degree values");
    //Calculate conversion and save to variable
    double RadianOUT = (Math.PI/180)*DegInput;
    //Display results
    System.out.println(RadianOUT);
  }
}