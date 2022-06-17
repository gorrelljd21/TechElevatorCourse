import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {

        File hotelInputFile = new File("HotelInput.csv");

        try (Scanner scanner = new Scanner(hotelInputFile)) {
            BigDecimal totalReservationValue;
            while (scanner.hasNextLine()) {

                String lineOfInput = scanner.nextLine();
                String[] arrayString = lineOfInput.split(",");

                String fullName = arrayString[0].trim();
                String numberOfNightsStr = arrayString[1].trim();
                int numberOfNights = Integer.parseInt(numberOfNightsStr);

                HotelReservation hotelReservation = new HotelReservation(fullName, numberOfNights);
                System.out.println(hotelReservation);
                //add.estTotal

                //instatiate before loop
                //every iteration add total val to counter
                //after loop print value

            }
            System.out.println();
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found");
        }
    }
}
