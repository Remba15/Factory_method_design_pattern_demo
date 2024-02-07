import AdTypes.Ad;
import Factory.CarAdFactory;
import Factory.FurnitureAdFactory;
import Factory.RealEstateAdFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        carAdDemo();
        realEstateAdDemo();
        furnitureAdDemo();

    }


    private static void carAdDemo() {
        CarAdFactory carAdFactory = new CarAdFactory();

        Ad CarAd1 = carAdFactory.createAd();
        CarAd1.postAd();
    }

    private static void realEstateAdDemo() {
        RealEstateAdFactory realEstateAdFactory = new RealEstateAdFactory();

        Ad realEstateAd1 = realEstateAdFactory.createAd();
        realEstateAd1.postAd();
    }

    private static void furnitureAdDemo() {
        FurnitureAdFactory furnitureAdFactory = new FurnitureAdFactory();

        Ad furnitureAd1 = furnitureAdFactory.createAd();
        furnitureAd1.postAd();
    }
}