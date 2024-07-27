package Educational_Initiatives_Coding.EX1.Creational_Patterns.CloningUserProfile_Prototype_Pattern;

public class PremiumUserProfile extends UserProfile {
    private String premiumFeatures;

    public PremiumUserProfile(String username, String email, String premiumFeatures) {
        super(username, email);
        this.premiumFeatures = premiumFeatures;
    }

    public String getPremiumFeatures() {
        return premiumFeatures;
    }

    public void setPremiumFeatures(String premiumFeatures) {
        this.premiumFeatures = premiumFeatures;
    }

    @Override
    public UserProfile clone() {
        return new PremiumUserProfile(getUsername(), getEmail(), premiumFeatures);
    }

    @Override
    public String getProfileType() {
        return "Premium";
    }

    @Override
    public String toString() {
        return super.toString() + ", premiumFeatures=" + premiumFeatures;
    }
}
