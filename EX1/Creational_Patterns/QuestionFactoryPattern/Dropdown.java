package Educational_Initiatives_Coding.EX1.Creational_Patterns.QuestionFactoryPattern;

public class Dropdown implements Question {
    @Override
    public void addQuestion(String question) {
        System.out.println("Creating Dropdown question\n" + question);
    }

    @Override
    public void addAnswer(String answer) {
        System.out.println("Creating Dropdown answer\n" + answer);
    }

    @Override
    public void addMarks(int marks) {
        System.out.println("This question is of marks - " + marks);
    }
}
