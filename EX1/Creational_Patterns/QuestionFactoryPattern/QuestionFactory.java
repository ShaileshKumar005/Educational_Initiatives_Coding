package Educational_Initiatives_Coding.EX1.Creational_Patterns.QuestionFactoryPattern;

public class QuestionFactory {
    public static Question createQuestion(String type) {
        switch (type) {
            case "MCQ":
                return new MCQ();
            case "Blank":
                return new Blank();
            case "Dropdown":
                return new Dropdown();
            default:
                throw new IllegalArgumentException("Unknown question type: " + type);
        }
    }
}
