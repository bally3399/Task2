import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FireDrillSix {
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date of birth (dd/MM/yyyy)");
        String dateOfBirth = scanner.next();
        System.out.println(displayDateOfBirth(dateOfBirth));

    }

    public static int displayDateOfBirth(String dateOfBirth) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate today = LocalDate.now();
        String date = today.format(dateFormatter);

        String[] array1 = date.split("/");
        int currentDay = Integer.parseInt(array1[0]);
        int currentMonth = Integer.parseInt(array1[1]);
        int currentYear = Integer.parseInt(array1[2]);

        String[] array = dateOfBirth.split("/");
        int day = Integer.parseInt(array[0]);
        int month = Integer.parseInt(array[1]);
        int year = Integer.parseInt(array[2]);

        if (currentDay >= day && currentMonth >= month) {
            return currentYear - year;
        }

        return (currentYear - year) - 1;
    }

}

