package Educational_Initiatives_Coding.EX1.Creational_Patterns.CloningUserProfile_Prototype_Pattern;

public class BasicUserProfile extends UserProfile {

    public BasicUserProfile(String username, String email) {
        super(username, email);
    }

    @Override
    public UserProfile clone() {
        return new BasicUserProfile(getUsername(), getEmail());
    }

    @Override
    public String getProfileType() {
        return "Basic";
    }
}
