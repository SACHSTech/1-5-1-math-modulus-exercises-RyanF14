class FtoC extends ConsoleProgram {

  /**
  * Description
  * @author:Ryan Fellin
  *converts farenheit to celsius, simple program
  */
  
  public void run() {
    
    double userinput = readDouble(" Define Fahrenhiet amount for conversion");
    double output = 0.5555555555555556*(userinput-32);
    System.out.println(output);
  }
}