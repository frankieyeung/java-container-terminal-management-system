public class Terminal {
    private String id;
    private double chargePerDay;
    private boolean isAvailable;

    public Terminal(String id, int chargePerDay) {
        this.id = id;
        this.chargePerDay = chargePerDay;
        this.isAvailable = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getChargePerDay() {
        return chargePerDay;
    }

    public void setChargePerDay(int chargePerDay) {
        if (chargePerDay >= 0) {
            this.chargePerDay = chargePerDay;
        } else {
            System.out.println("Charge amount must be greater than or equal to 0");
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean available) {
        isAvailable = available;
    }
}