package command;

// Light class with methods to turn the light on and off
public class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is ON");
    }

    public void off() {
        System.out.println(location + " light is OFF");
    }

    public String getLocation() {
        return location;
    }
}
