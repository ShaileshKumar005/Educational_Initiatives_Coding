package Educational_Initiatives_Coding.EX1.Creational_Patterns.CloningUserProfile_Prototype_Pattern;

public class Main {
    public static void main(String[] args) {
        // Create and register profiles
        UserProfileRegistry registry = new UserProfileRegistry();

        registry.addProfile("Basic", new BasicUserProfile("basicUser", "basic@example.com"));
        registry.addProfile("Premium", new PremiumUserProfile("premiumUser", "premium@example.com", "All Features"));

        // Clone and modify profiles
        UserProfile basicProfileClone = registry.getProfile("Basic");
        System.out.println("Cloned Basic Profile: " + basicProfileClone);

        UserProfile premiumProfileClone = registry.getProfile("Premium");
        if (premiumProfileClone instanceof PremiumUserProfile) {
            premiumProfileClone.setUsername("newPremiumUser");
            ((PremiumUserProfile) premiumProfileClone).setPremiumFeatures("Some Features");
        }
        System.out.println("Modified Cloned Premium Profile: " + premiumProfileClone);
    }
}
