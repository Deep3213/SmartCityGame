public class Airport extends Service{

    private String planeClass, planeFood;

    public Airport() {
        setPlaneSeatType("Economy");
        setPlaneFood("Yes");
    }

    public Airport(String c, String f) {
        setPlaneSeatType(c);
        setPlaneFood(f);
    }

    public void setPlaneSeatType (String c) {

        if (c.equals("First")) {
            this.planeClass = c;
            setPrice(this.getPrice() + 500.00);
        } else if (c.equals("Business")) {
            this.planeClass = c;
            setPrice(this.getPrice() + 250.00);
        } else if (c.equals("Economy")) {
            this.planeClass = c;
            setPrice(this.getPrice() + 100.00);
        }
    }

    public String getPlaneClass() {
        return this.planeClass;
    }

    public void setPlaneFood (String f) {
        if (f.equals("Yes")) {
            this.planeFood = f;
            setPrice(this.getPrice() + 25.00);
        } else if (f.equals("No")) {
            this.planeFood = f;
        }
    }

    public String getPlaneFood() {
        return this.planeFood;
    }

    public String toString () {
        return "\nSeat Class: " + getPlaneClass() + "\nFood Included: " + getPlaneFood() + "\nPrice: " + getPrice() + "0";
    }
}
