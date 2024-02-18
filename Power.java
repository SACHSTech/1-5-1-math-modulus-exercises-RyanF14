class Power extends ConsoleProgram {

  /**
  * Description
  * @author: Ryan Fellin
  * Calculates the power of a number using a user inputted base and exponent
  * Base - User defined base of the power
  * exponent - User defined exponent of the power
  * result - outputted result of the power equation
  */
  
  public void run() {
    
    double Base = readDouble("Input the base value of the power");
    double exponent = readDouble("Input the value of the exponent");
    double result = Math.pow(Base, exponent);
    
    System.out.println(result);
    
  }
}