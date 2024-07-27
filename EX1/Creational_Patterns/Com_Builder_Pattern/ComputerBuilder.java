package Educational_Initiatives_Coding.EX1.Creational_Patterns.Com_Builder_Pattern;

public class ComputerBuilder {
    private String motherboard;
    private String processor;
    private String memory;
    private String storage;

    public ComputerBuilder setMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public ComputerBuilder setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public Computer build() {
        return new Computer(motherboard, processor, memory, storage);
    }
}
