package Factory;

import AdTypes.Ad;
import AdTypes.CarAd;

public class CarAdFactory implements AdFactory{

    @Override
    public Ad createAd() {
        return new CarAd();
    }
}
