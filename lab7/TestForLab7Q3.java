import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class TestForLab7Q3 {
    public static void main(String[] args){
        LocalDate nov1yr21 = LocalDate.of(2021,11,1); //monday
        LocalDate jan1yr22 = LocalDate.of(2022,1,1); //saturday
        long daysBetween;
        daysBetween = ChronoUnit.DAYS.between(nov1yr21,jan1yr22);
        System.out.println(nov1yr21 + " was " + nov1yr21.getDayOfWeek() + ".It is "+ daysBetween + " days to Saturday 2022-01-01");
        numDaysFromDate(1, 11, 2021, 1);
    }
    static void numDaysFromDate(int date, int month, int year, int myBD) {
        int daysBornTil31Dec2021 = 0;
        /* your code */
        int year_1 = 2021 - year;
        //for(int i = year_1)
        /*-----------*/
        int daysBornTil2Jan2022 = daysBornTil31Dec2021 + 2; // shift to Sunday Jan 02 2022
        String str = showResult(date, month, year, myBD, daysBornTil2Jan2022);
        System.out.println(str);
    }   //daysBornTil31Dec2021 เก็บจำนวนวันนับจากวันที่ระบุจนถึงวันที่ 31 December 2021 และบวกไปอีก 2 วันเพื่อให้เป็นวันอาทิตย์ (วันที่ 0 ของสัปดาห์) และส่งให้ showResult()

    static String showResult(int date, int month, int year, int myBD, int fromNumDaysFromDate) {
        String[] dayName = { "Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday" };
        int dayFromSun = 0;
        int modResult = fromNumDaysFromDate % 7;
        /* your code */
        dayFromSun = modResult;
        /*-----------*/
        String str = String.format("You were born on %s and have been born for %d days (2 Jan 2022).Your program says %s", dayName[myBD], fromNumDaysFromDate, dayName[dayFromSun]);
        return str;
    }
}