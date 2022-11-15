import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Lab7Q365607 {
    public static void main(String[] args){
        
        LocalDate nov1yr21 = LocalDate.of(2002,2,7); //Tuesday
        LocalDate jan1yr22 = LocalDate.of(2003,2,9); //Sunday
        long daysBetween;
        daysBetween = ChronoUnit.DAYS.between(nov1yr21,jan1yr22);
        System.out.println(nov1yr21 + " was " + nov1yr21.getDayOfWeek() + ".It is "+ daysBetween + " days to Sunday 2022-01-02");
        numDaysFromDate(9, 2, 2002, 6);
    }
    static void numDaysFromDate(int date, int month, int year, int myBD) {
        int daysBornTil31Dec2021 = 0;
        /* your code */
        while(year < 2021){
            if((year % 4 == 0 && !(year %100 ==0) || year % 400 == 0)){
                daysBornTil31Dec2021 += 366;
            }else{
                daysBornTil31Dec2021 += 365;
            }
            year++;
        }
        while(month <= 12){
            if(month == 4 ||month == 6||month == 9||month == 11){
                daysBornTil31Dec2021 += 30;
            }else if(month == 2){
                if((year % 4 == 0 && !(year %100 ==0) || year % 400 == 0)){
                    daysBornTil31Dec2021 += 29;
                }else{
                    daysBornTil31Dec2021 += 28;
                }
            }else{
                daysBornTil31Dec2021 += 31;
            }
            month++;
        }
        daysBornTil31Dec2021 -= date;
        /*__________ */
        int daysBornTil2Jan2022 = daysBornTil31Dec2021 + 2; // shift to Sunday Jan 02 2022
        String str = showResult(date, month, year, myBD, daysBornTil2Jan2022);
        System.out.println(str);
    }

    static String showResult(int date, int month, int year, int myBD, int fromNumDaysFromDate) {
        String[] dayName = { "Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday" };
        int dayFromSun = 0;
        int modResult = fromNumDaysFromDate % 7;
        /* your code */
        dayFromSun = (7 - modResult == 7) ? 0:(7 - modResult);
        /*__________ */
        String str = String.format("You were born on %s and have been born for %d days (2 Jan 2022).Your program says %s", dayName[myBD], fromNumDaysFromDate, dayName[dayFromSun]);
        return str;
    }
}
