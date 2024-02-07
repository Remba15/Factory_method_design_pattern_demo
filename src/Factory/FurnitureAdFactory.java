package Factory;

import AdTypes.Ad;
import AdTypes.FurnitureAd;

public class FurnitureAdFactory implements AdFactory{
    @Override
    public Ad createAd() {
        return new FurnitureAd();
    }
}
