import java.math.BigDecimal;
import java.rmi.activation.ActivationGroup_Stub;

public class HotelReservation {

    private String name;
    private int numOfNights;
    private BigDecimal dailyRate = new BigDecimal("59.99");
    private BigDecimal estTotal = new BigDecimal("0.00").multiply(dailyRate);

    public HotelReservation(String name, int numOfNights) {
        this.name = name;
        this.numOfNights = numOfNights;
    }


    public HotelReservation() {

    }

    public String getName() {
        return name;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public BigDecimal getDailyRate() {
        return dailyRate;
    }

    public BigDecimal getEstTotal() {
        return estTotal;
    }
}
