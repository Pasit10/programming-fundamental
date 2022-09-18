import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Lab7Q365607 {
    public static void main(String[] args){
        LocalDate nov1yr21 = LocalDate.of(2021,11,1); //monday
        LocalDate jan1yr22 = LocalDate.of(2022,1,1); //saturday
        long daysBetween;
        daysBetween = ChronoUnit.DAYS.between(nov1yr21,jan1yr22);
        System.out.println(nov1yr21 + " was " + nov1yr21.getDayOfWeek() + ".It is "+ daysBetween + " days to Saturday 2022-01-01");
        numDaysFromDate(10, 6, 2003, 2);
    }
    static void numDaysFromDate(int date, int month, int year, int myBD) {
        int daysBornTil31Dec2021 = 0;
        /* your code */
        int daysBornTil2Jan2022 = daysBornTil31Dec2021 + 2; // shift to Sunday Jan 02 2022
        String str = showResult(date, month, year, myBD, daysBornTil2Jan2022);
        System.out.println(str);
    }

    static String showResult(int date, int month, int year, int myBD, int fromNumDaysFromDate) {
        String[] dayName = { "Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday" };
        int dayFromSun = 0;
        int modResult = fromNumDaysFromDate % 7;
        /* your code */
        String str = String.format("You were born on %s and have been born for %d days (2 Jan 2022).Your program says %s", dayName[myBD], fromNumDaysFromDate, dayName[dayFromSun]);
        return str;
    }

}