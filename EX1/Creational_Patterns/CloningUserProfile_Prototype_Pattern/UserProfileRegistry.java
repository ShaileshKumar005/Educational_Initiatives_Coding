package Educational_Initiatives_Coding.EX1.Creational_Patterns.CloningUserProfile_Prototype_Pattern;

import java.util.HashMap;
import java.util.Map;

public class UserProfileRegistry {
    private Map<String, UserProfile> profiles = new HashMap<>();

    public void addProfile(String type, UserProfile profile) {
        profiles.put(type, profile);
    }

    public UserProfile getProfile(String type) {
        UserProfile prototype = profiles.get(type);
        return (prototype != null) ? prototype.clone() : null;
    }
}
