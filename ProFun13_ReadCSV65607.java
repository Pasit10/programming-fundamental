import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProFun13_ReadCSV65607{
    public static void main(String[] args) {
        try(Scanner input = new Scanner(Paths.get("employee.csv"))){
            while(input.hasNext()){
                String row = input.nextLine();
                String[] dataFields = row.split(",");
                int id = Integer.parseInt(dataFields[0]);
                String Fname = dataFields[1];
                String Lname = dataFields[2];
                double Salary = Double.parseDouble(dataFields[3]);
                System.out.println(id+ " " +Fname+ " " +Lname+ " " +Salary);
            }
        }catch(NoSuchFileException e){
            System.out.println(e);
        }catch(InputMismatchException in){
            System.out.println(in);
        }catch(NumberFormatException Num){
            System.out.println(Num);
        }catch(IOException io){

        }
    }
}