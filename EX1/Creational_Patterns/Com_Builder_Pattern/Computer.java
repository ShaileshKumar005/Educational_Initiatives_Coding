package Educational_Initiatives_Coding.EX1.Creational_Patterns.Com_Builder_Pattern;

public class Computer {
    private String motherboard;
    private String processor;
    private String memory;
    private String storage;

    public Computer(String motherboard, String processor, String memory, String storage) {
        this.motherboard = motherboard;
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer [Motherboard=" + motherboard + ", Processor=" + processor + ", Memory=" + memory + ", Storage=" + storage + "]";
    }
}
