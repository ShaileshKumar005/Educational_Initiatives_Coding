package command;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Main class to demonstrate the Command pattern
public class App {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        // Creating Light objects
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Light bedroomLight = new Light("Bedroom");

        // Creating Command objects
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightOnCommand bedroomLightOn = new LightOnCommand(bedroomLight);
        LightOffCommand bedroomLightOff = new LightOffCommand(bedroomLight);

        // Setting commands in the remote
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, bedroomLightOn, bedroomLightOff);

        // Initializing all lights to be off
        remote.offButtonWasPushed(0);
        remote.offButtonWasPushed(1);
        remote.offButtonWasPushed(2);

        // Mapping rooms to their respective slots and states
        Map<String, Integer> roomMap = new HashMap<>();
        roomMap.put("living room", 0);
        roomMap.put("kitchen", 1);
        roomMap.put("bedroom", 2);

        Map<Integer, Boolean> lightState = new HashMap<>();
        lightState.put(0, false); // Living room light is off
        lightState.put(1, false); // Kitchen light is off
        lightState.put(2, false); // Bedroom light is off

        // User interaction
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a room name to use (living room, kitchen, bedroom) or 'status' to see all room statuses or 'exit' to quit:");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) {
                break;
            } else if (input.equals("status")) {
                printRoomStatus(lightState);
            } else if (roomMap.containsKey(input)) {
                int slot = roomMap.get(input);
                boolean isLightOn = lightState.get(slot);

                if (!isLightOn) {
                    System.out.println("The light is currently OFF. Turning it ON as the room is in use.");
                    remote.onButtonWasPushed(slot);
                    lightState.put(slot, true);
                }

                System.out.println("The light is currently ON. Do you want to finish using the room and turn it OFF? (yes/no):");
                String action = scanner.nextLine().toLowerCase();
                if (action.equals("yes")) {
                    remote.offButtonWasPushed(slot);
                    lightState.put(slot, false);
                } else {
                    System.out.println("No action taken.");
                }

                // Show status after action
                printRoomStatus(lightState);
            } else {
                System.out.println("Invalid room. Please enter a valid room name.");
            }
        }

        scanner.close();
    }

    // Method to print the status of all rooms
    private static void printRoomStatus(Map<Integer, Boolean> lightState) {
        System.out.println("Current room statuses:");
        for (Map.Entry<Integer, Boolean> entry : lightState.entrySet()) {
            String room = "";
            switch (entry.getKey()) {
                case 0: room = "Living Room"; break;
                case 1: room = "Kitchen"; break;
                case 2: room = "Bedroom"; break;
            }
            System.out.println(room + ": " + (entry.getValue() ? "ON" : "OFF"));
        }
    }
}
