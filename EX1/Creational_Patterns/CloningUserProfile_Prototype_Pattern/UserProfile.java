package Educational_Initiatives_Coding.EX1.Creational_Patterns.CloningUserProfile_Prototype_Pattern;

public abstract class UserProfile implements Cloneable {
    private String username;
    private String email;

    public UserProfile(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Clone method
    @Override
    public abstract UserProfile clone();

    @Override
    public String toString() {
        return "UserProfile [username=" + username + ", email=" + email + "]";
    }

    // Abstract method for profile type
    public abstract String getProfileType();
}

