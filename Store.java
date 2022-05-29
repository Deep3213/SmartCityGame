public class Store extends Service {

    private String storeType, storeName;

    public Store() {
        setStoreType("");
        setStoreName("");
    }

    public Store(String t, String n) {
        setStoreType(t);
        setStoreName(n);
    }

    public void setStoreType(String t) {

        if (t.equals("Toy")) {
            this.storeType = t;
        } else if (t.equals("Footwear")) {
            this.storeType = t;
        } else if (t.equals("Clothing")) {
            this.storeType = t;
        } else if (t.equals("Tech")) {
            this.storeType = t;
        }
    }

    public String getStoreType () {
        return this.storeType;
    }

    public void setStoreName (String n){
        this.storeName = n;
    }

    public String getStoreName () {
        return this.storeName;
    }

    public String toString () {
        return "\nType of Store: " + getStoreType() + "\nStore Name: " + getStoreName();
    }
}

// In Mall put in scanner asking what type of store the user would like to go into (1 - something, 2 - something else)
// Then put all the stores in each category into their own list (ex. list of tech stores with names as the elements)
// Then show the user all the store names in the chosen store category