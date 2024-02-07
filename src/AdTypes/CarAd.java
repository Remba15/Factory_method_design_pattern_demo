package AdTypes;

public class CarAd implements Ad{
    public String mCarManufacturer;
    private String mCarModel;
    private double mMileage;
    private double mPrice;
    @Override
    public void postAd() {
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
