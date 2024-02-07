package AdTypes;

public class FurnitureAd implements Ad{
    private String mType;
    private String mDimensions;
    private double mPrice;

    public FurnitureAd(){
        this.mType = "Table";
        this.mDimensions = "160x80cm";
        this.mPrice = 0.0;
    }
    @Override
    public void postAd() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(mType);
        stringBuilder.append("\n");
        stringBuilder.append(mDimensions);
        stringBuilder.append("\n");
        stringBuilder.append(mPrice);
        stringBuilder.append(" EUR");
        System.out.println(stringBuilder);
    }
}
