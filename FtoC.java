class FtoC extends ConsoleProgram {

  /**
  * Description
  * @author:Ryan Fellin
  *Converts Farenheit to Celsius
  *userinput - User defined value in Fahrenheit
  *output - Value of the entered Fahrenheit converted to Celsius
  */
  
  public void run() {
    
    double userinput = readDouble(" Define Fahrenheit amount for conversion");
    double output = 0.5555555555555556*(userinput-32);
    System.out.println(output);
  }
}