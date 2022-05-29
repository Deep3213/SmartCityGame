public class Restaurant extends Service{

    private String cuisine, menuItem;

    public Restaurant() {
        setCuisine("");
        setMenuItem("Yes");
    }

    public Restaurant(String c, String m) {
        setCuisine(c);
        setMenuItem(m);
    }

    public void setCuisine (String c) {

        if (c.equals("Japanese")) {
            this.cuisine = c;
        } else if (c.equals("Chinese")) {
            this.cuisine = c;
        } else if (c.equals("Vietnamese")) {
            this.cuisine = c;
        } else if (c.equals("French")) {
            this.cuisine = c;
        } else if (c.equals("Italian")) {
            this.cuisine = c;
        } else if (c.equals("Mexican")) {
            this.cuisine = c;
        }
    }

    public String getCuisine() {
        return this.cuisine;
    }

    public void setMenuItem (String m) {

        if (m.equals("Sushi")) {
            this.menuItem = m;
            setPrice(this.getPrice() + 25.00);
        } else if (m.equals("Ramen")) {
            this.menuItem = m;
            setPrice(this.getPrice() + 15.00);
        } else if (m.equals("Lo Mein")) {
            this.menuItem = m;
            setPrice(this.getPrice() + 25.00);
        } else if (m.equals("Dumplings")) {
            this.menuItem = m;
            setPrice(this.getPrice() + 30.00);
        } else if (m.equals("Pho")) {
            this.menuItem = m;
            setPrice(this.getPrice() + 20.00);
        } else if (m.equals("Banh Xeo")) {
            this.menuItem = m;
            setPrice(this.getPrice() + 10.00);
        } else if (m.equals("Boeuf Bourguignon")) {
            this.menuItem = m;
            setPrice(this.getPrice() + 40.00);
        } else if (m.equals("Flamiche")) {
            this.menuItem = m;
            setPrice(this.getPrice() + 50.00);
        } else if (m.equals("Lasagna")) {
            this.menuItem = m;
            setPrice(this.getPrice() + 20.00);
        } else if (m.equals("Pizza")) {
            this.menuItem = m;
            setPrice(this.getPrice() + 15.00);
        } else if (m.equals("Alfredo Fettuccine")) {
            this.menuItem = m;
            setPrice(this.getPrice() + 45.00);
        } else if (m.equals("Tacos")) {
            this.menuItem = m;
            setPrice(this.getPrice() + 15.00);
        } else if (m.equals("Quesadilla")) {
            this.menuItem = m;
            setPrice(this.getPrice() + 30.00);
        }
    }

    public String getMenuItem() {
        return this.menuItem;
    }

    public String toString () {
        return "\nCuisine: " + getCuisine() + "\nMenu Item: " + getMenuItem() + "\nPrice: " +
                getPrice() + "0";
    }
}