package Educational_Initiatives_Coding.EX1.Creational_Patterns.Com_Builder_Pattern;

public class ComputerFactory {

    public static Computer createGamingComputer() {
        return new ComputerBuilder()
                .setMotherboard("ASUS ROG")
                .setProcessor("Intel i9")
                .setMemory("32GB DDR4")
                .setStorage("1TB SSD")
                .build();
    }

    public static Computer createOfficeComputer() {
        return new ComputerBuilder()
                .setMotherboard("MSI B450")
                .setProcessor("AMD Ryzen 5")
                .setMemory("16GB DDR4")
                .setStorage("512GB SSD")
                .build();
    }
}
