import java.util.concurrent.TimeUnit;

class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author: Ryan Fellin
  *converts minutes into days, hours, and minutes
  * input minutes - user inputted value of minutes
  *hoursremainder - calculates the remainder of hours in minutes
  * hoursvalue -  converts hoursremainder to hours
  * minremainder - calculates remaining minutes and displays to user the results
  *
  */
  
  public void run() {
    int inputminutes = readInt("input the number of minutes to be converted into days, hours, and minutes");
    long inputminutelong = inputminutes;
    Long mintodays = TimeUnit.MINUTES.toDays(inputminutes);
    long hoursremainder = inputminutes - ((mintodays*24)*60);
    Long hoursvalue = hoursremainder/60;
    Long minremainder = ((inputminutes) - ((mintodays*24)*60) - hoursvalue*60);
    System.out.println(mintodays); System.out.println("Days");
    System.out.println(hoursvalue); System.out.println("Hours");
    System.out.println(minremainder); System.out.println("Minutes");
  }
}
