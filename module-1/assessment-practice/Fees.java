import java.math.BigDecimal;

public class Fees {
    public static BigDecimal main(String[] args) {

        HotelReservation hotelReservation = new HotelReservation();
        boolean requiresCleaning = true;
        boolean usedMiniBar = true;


        if(usedMiniBar) {
            BigDecimal miniBarFee = new BigDecimal("12.99");
            BigDecimal newTotalBar = hotelReservation.getEstTotal().add(miniBarFee);
            return newTotalBar;
        }
        if(requiresCleaning){
            BigDecimal cleaningFee = new BigDecimal("34.99");
            BigDecimal newTotalClean = hotelReservation.getEstTotal().add(cleaningFee);
            return newTotalClean;
        }
        return null;
    }
}
