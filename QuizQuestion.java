import java.lang.Math;
public class QuizQuestion
{
    private String question;
    private String[] answers;
    private String correctAnswer;
    public QuizQuestion(String q, String[] a, String cA)
    {
        this.question = q;
        this.correctAnswer = cA;
        for(int i = 1; i<3;i++) //apparently this doesn't work properly
        {
            int pos = (int) Math.random() * 3; 
            String temp = a[i];
            a[i] = a[pos];
            a[pos] = temp;
        }
        this.answers = a;
    }

    public boolean validate(String selected)
    {
        return selected.equals(this.correctAnswer);

    }

    public String getQuestion()
    {
        return this.question;
    }

    public String getAnswer(int i)
    {
        return this.answers[i];
    }
}
