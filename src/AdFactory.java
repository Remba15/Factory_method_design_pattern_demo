public abstract class AdFactory {
    public Ad create(){
        Ad ad = createAd();
        return ad;
    }
    protected abstract Ad createAd();

}
