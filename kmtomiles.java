class kmtomiles extends ConsoleProgram {

  /**
  * Description
  * @author:Ryan Fellin
  * Converts inputted kilometers to miles
  * kminput - user defined value in kilometers
  * result - user input converted to miles
  */
  
  public void run() {
    double kminput =  readDouble("Input the value of the Kilometers that you want to convert");
    double result = kminput*0.621371;
    System.out.println(result);
    
    
  }
}
