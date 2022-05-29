public class Hotel extends Service {
    private String bed, jacuzzi;
    public double sum = 0.00;

    public Hotel() {
        setBedType("Queen");
        setJacuzzi("No");
    }

    public Hotel(String b, String j) {
        setBedType(b);
        setJacuzzi(j);
    }

    public void setBedType(String b) {

        if (b.equals("King")) {
            this.bed = b;
            setPrice(this.getPrice() + 100.00); // Adds the price of the king bed to getPrice() which has an initial
                                                // value of zero
        } else if (b.equals("Twin")) {
            this.bed = b;
            setPrice(this.getPrice() + 50.00);
        } else if (b.equals("Queen")) {
            this.bed = b;
            setPrice(this.getPrice() + 75.00);
        }
    }

    public String getBedType() {
        return this.bed;
    }

    public void setJacuzzi(String j) {
        if (j.equals("Yes")) {
            this.jacuzzi = j;
            // Adds price of jacuzzi to total price
            setPrice(this.getPrice() + 50.00);
        } else if (j.equals("No")) {
            this.jacuzzi = j;
        }
    }

    public String getJacuzzi() {
        return this.jacuzzi;
    }

    public String toString () {
        return "Bed Size: "+getBedType() + "\nJacuzzi: " + getJacuzzi() + "\nTotal Price: " + getPrice() + "0";
    }


}
