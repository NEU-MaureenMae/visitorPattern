public interface TelcoSubscription {

    String accept(UsagePromo usage, double price);

    String accept(UnliCallTextOffer offer, boolean unliCallText);

    String getTelcoName();

    double getPromoPrice();

    boolean getUnliCallText();
}
