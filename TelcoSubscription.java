public interface TelcoSubscription {
    // account
    String accept(UsagePromo usage, double price);
    String accept(UnliCallTextOffer offer, boolean unliCallText);

    String getTelcoName();

    double getPromoPrice();

    boolean getUnliCallText();
}
