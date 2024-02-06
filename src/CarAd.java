public class CarAd implements Ad{
    public String mCarManufacturer;
    public String mCarModel;
    public double mMileage;
    public double mPrice;
    @Override
    public void printAd() {
        String adString = mCarManufacturer + " " + mCarModel + "\n" +
                "Mileage: " + mMileage + "\n" +
                "Price: " + mPrice + "\n";
        System.out.println(adString);
    }

    public CarAd(){
        this.mCarManufacturer = "Nissan";
        this.mCarModel = "180SX";
        this.mMileage = 0.0;
        this.mPrice = 0.0;
    }
}
