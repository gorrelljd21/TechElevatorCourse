import java.math.BigDecimal;

public class HotelReservation {

    private String name;
    private int numOfNights;
    private final BigDecimal DAILY_RATE = new BigDecimal("59.99");

    public HotelReservation(String name, int numOfNights) {
        this.name = name;
        this.numOfNights = numOfNights;
    }

    public BigDecimal getEstTotal(){
        return DAILY_RATE.multiply(BigDecimal.valueOf(this.numOfNights));
    }

    @Override
    public String toString(){
        return "RESERVATION - " + this.name + " - " + this.getEstTotal();
    }
}

