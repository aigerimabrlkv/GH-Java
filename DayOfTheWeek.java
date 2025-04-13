import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

    public class DayOfTheWeek {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user
            System.out.println("Enter a date (yyyy-MM-dd):");
            String inputDate = scanner.nextLine();

            // Parse the date
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            // Get the day of the week
            String dayOfWeek = date.getDayOfWeek().toString();

            // Format the output to be more user-friendly (e.g., MONDAY -> Monday)
            String formattedDay = dayOfWeek.charAt(0) + dayOfWeek.substring(1).toLowerCase();

            // Output
            System.out.println("Day of the week: " + formattedDay);
        }
    }


