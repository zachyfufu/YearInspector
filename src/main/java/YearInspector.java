import java.util.Scanner;

public class YearInspector {
   /*Scanner input = new Scanner(System.in);
    int year = input.nextInt();
    boolean leap = false;*/

   /* public String inspectYear(int n) {
        String inspectedYr = ""; mn

        if ((n % 4 == 0) && (n % 100 != 0)){
            inspectedYr += " Leap Year";
        }

        if (n % 400 == 0){
            inspectedYr += " Leap Year";
        }

        if (n % 4 != 0){
        inspectedYr += " Not a leap year";
        }

        if ((n % 100 == 0) && (n % 400 != 0)){
            inspectedYr += " Not a leap year";
        }
        return inspectedYr;
    }*/

        public boolean isLeapYear(int year){

            if ((year % 4 == 0) && (year % 100 != 0)){
                //System.out.println(" Leap year");
                return true;
            }
            else if (year % 400 == 0){
                //System.out.println(" Leap year");
                return true;
            }
            else if (year % 4 != 0){
                //System.out.println(" Not a leap year");
                return false;
            }
            else if ((year % 100 == 0) && (year % 400 != 0)){
                //System.out.println(" Not a leap year");
                return false;
            }
            else {
                return false;
            }
        }

}


