public class CarAdFactory extends AdFactory{
    @Override
    protected Ad createAd() {
        return new CarAd();
    }
}
