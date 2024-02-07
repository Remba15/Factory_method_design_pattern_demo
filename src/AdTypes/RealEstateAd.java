package AdTypes;

public class RealEstateAd implements Ad{
    private String mLocation;
    private double mQuadrature;
    private double mPrice;

    public RealEstateAd(){
        this.mLocation = "Osijek";
        this.mQuadrature = 50;
        this.mPrice = 0.0;
    }

    @Override
    public void postAd() {
        String adString = mLocation + "\n"
                + mQuadrature + "\n"
                + mPrice + " EUR" + "\n";
        System.out.println(adString);
    }
}
