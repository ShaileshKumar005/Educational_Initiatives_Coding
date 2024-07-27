package Educational_Initiatives_Coding.EX1.Creational_Patterns.QuestionFactoryPattern;

public class Main {
    public static void main(String[] args) {
        Question mcq = QuestionFactory.createQuestion("MCQ");
        mcq.addQuestion("MCQ question");
        mcq.addAnswer("MCQ answer");
        mcq.addMarks(1);

        Question blank = QuestionFactory.createQuestion("Blank");
        blank.addQuestion("Blank question");
        blank.addAnswer("Blank answer");
        blank.addMarks(2);

        Question dropdown = QuestionFactory.createQuestion("Dropdown");
        dropdown.addQuestion("Dropdown question");
        dropdown.addAnswer("Dropdown answer");
        dropdown.addMarks(2);
    }
}
