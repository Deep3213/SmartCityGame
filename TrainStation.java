public class TrainStation extends Service{

    private String trainSeat;

    public TrainStation() {
        setTrainSeatType("Economy");
    }

    public TrainStation (String s) {
        setTrainSeatType(s);
    }

    public void setTrainSeatType (String s) {

        if (s.equals("Public")) {
            this.trainSeat = s;
            setPrice(this.getPrice() + 100.00);
        } else if (s.equals("Private")) {
            this.trainSeat = s;
            setPrice(this.getPrice() + 250.00);
        } else if (s.equals("VIP")) {
            this.trainSeat = s;
            setPrice(this.getPrice() + 1000.00);
        }
    }

    public String getTrainSeatType() {
        return this.trainSeat;
    }

    public String toString () {
        return "\nSeat Class: " + getTrainSeatType() + "\nPrice: " + getPrice() + "0";
    }
}