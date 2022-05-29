public class Port extends Service{

    private String boatSeat, boatMeal;

    public double sum = 0;

    public Port() {
        setBoatSeatType("Outside");
        setBoatMeal("Yes");
    }

    public Port(String b, String m) {
        setBoatSeatType(b);
        setBoatMeal(m);
    }

    public void setBoatSeatType (String b) {

        if (b.equals("Inside")) {
            this.boatSeat = b;
            setPrice(this.getPrice() + 50.00);
        } else if (b.equals("Outside")) {
            this.boatSeat = b;
            setPrice(this.getPrice() + 100.00);
        }
    }

    public String getBoatSeatType() {
        return this.boatSeat;
    }

    public void setBoatMeal (String m) {
        if (m.equals("Yes")) {
            this.boatMeal = m;
            setPrice(this.getPrice() + 50.00);
        } else if (m.equals("No")) {
            this.boatMeal = m;
        }
    }

    public String getBoatMeal() {
        return this.boatMeal;
    }

    public String toString () {
        return "\nSeat Type: " + getBoatSeatType() + "\nMeal Plan Included: " + getBoatMeal() + "\nPrice: " +
                getPrice() + "0";
    }
}