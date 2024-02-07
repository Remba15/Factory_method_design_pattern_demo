package Factory;

import AdTypes.Ad;
import AdTypes.RealEstateAd;

public class RealEstateAdFactory implements AdFactory{
    @Override
    public Ad createAd() {
        return new RealEstateAd();
    }
}
