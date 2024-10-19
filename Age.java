import java.util.Calendar;
import java.util.Date;

public class Age {
    public static void main(String[] args) {
        // dd-mm-yyyy
       String dob = "01-02-2010";
       Date date = new Date(); // current date
       Calendar calendar = Calendar.getInstance();
       calendar.setTime(date);
       int month = calendar.get(Calendar.MONTH) + 1;
       int day = calendar.get(Calendar.DATE);
       int year = calendar.get(Calendar.YEAR);

       //System.out.println(month+ " "+day + " "+year);
       String r[]= dob.split("-");
       int oldDate = Integer.parseInt(r[0]);
       int oldMonth = Integer.parseInt(r[1]);
       int oldYear = Integer.parseInt(r[2]);
       int ageYear = year - oldYear;
       //System.out.println("Age Year "+(year - oldYear));
       int ageMonth = month - oldMonth;
       if(ageMonth<0){
            ageYear--;
            ageMonth = month;
       }
       int ageDay = day - oldDate;
       if(ageDay<0){
        ageDay =day; 
       }
       System.out.println( ageYear+"Year "+ "Month "+ageMonth + " Day "+ageDay);
      


    }
}
