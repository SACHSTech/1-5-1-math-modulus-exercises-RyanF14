class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author:Ryan Fellin
  * A simple program which takes input from the user to define the Radius variable
  * RadiusIN - User-defined variable which provides the Radius of the Circle
  * CircumferenceOUT - Output variable which relays the circumference of the Circle to the user
  *
  */
  
  public void run() {
    
    double RadiusIN = readDouble("Input Radius of Circle");
    double CircumferenceOUT =  Math.PI*(2*RadiusIN);
    System.out.println(CircumferenceOUT);

    
  }
}