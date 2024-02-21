import java.util.concurrent.TimeUnit;

class Hours extends ConsoleProgram {

  /**
  * Description
  * @author:Ryan Fellin
  * Converts hours to days and hours
  * inputhours - user inputted value in hours
  * hourconversion - converts hours to days
  * hoursremain - calculates the remainder of hours
  */
  
  public void run() {
    int inputhours = readInt("Input the number of hours which will be converted to days and hours");
    long hourconversion = TimeUnit.HOURS.toDays(inputhours);
    long hoursremain = inputhours - (hourconversion*24);
    System.out.println(hourconversion); System.out.print("Days");
    System.out.println(" ");
    System.out.println(hoursremain);  System.out.print("Hours");
  

    
  }
}