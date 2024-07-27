package Educational_Initiatives_Coding.EX1.Creational_Patterns.QuestionFactoryPattern;

public class Blank implements Question {
    @Override
    public void addQuestion(String question) {
        System.out.println("Creating Blank question\n" + question);
    }

    @Override
    public void addAnswer(String answer) {
        System.out.println("Creating Blank answer\n" + answer);
    }

    @Override
    public void addMarks(int marks) {
        System.out.println("This question is of marks - " + marks);
    }
}
