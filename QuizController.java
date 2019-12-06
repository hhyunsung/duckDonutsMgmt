import javafx.scene.*;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert;
public class QuizController {
    @FXML private VBox questionBlock1;
    @FXML private VBox questionBlock2;
    @FXML private VBox questionBlock3;
    @FXML private VBox questionBlock4;
    @FXML private VBox questionBlock5;
    @FXML private VBox questionBlock6;
    @FXML private VBox questionBlock7;
    @FXML private VBox questionBlock8;
    @FXML private ProgressBar quizProgressBar;
    @FXML private Text progressNumber;

    @FXML private Label question1;
    @FXML private RadioButton q1answer1;
    @FXML private RadioButton q1answer2;
    @FXML private RadioButton q1answer3;
    @FXML private RadioButton q1answer4;
    @FXML private Label question2;
    @FXML private RadioButton q2answer1;
    @FXML private RadioButton q2answer2;
    @FXML private RadioButton q2answer3;
    @FXML private RadioButton q2answer4;
    @FXML private Label question3;
    @FXML private RadioButton q3answer1;
    @FXML private RadioButton q3answer2;
    @FXML private RadioButton q3answer3;
    @FXML private RadioButton q3answer4;
    @FXML private Label question4;
    @FXML private RadioButton q4answer1;
    @FXML private RadioButton q4answer2;
    @FXML private RadioButton q4answer3;
    @FXML private RadioButton q4answer4;
    @FXML private Label question5;
    @FXML private RadioButton q5answer1;
    @FXML private RadioButton q5answer2;
    @FXML private RadioButton q5answer3;
    @FXML private RadioButton q5answer4;
    @FXML private Label question6;
    @FXML private RadioButton q6answer1;
    @FXML private RadioButton q6answer2;
    @FXML private RadioButton q6answer3;
    @FXML private RadioButton q6answer4;
    @FXML private Label question7;
    @FXML private RadioButton q7answer1;
    @FXML private RadioButton q7answer2;
    @FXML private RadioButton q7answer3;
    @FXML private RadioButton q7answer4;
    @FXML private Label question8;
    @FXML private RadioButton q8answer1;
    @FXML private RadioButton q8answer2;
    @FXML private RadioButton q8answer3;
    @FXML private RadioButton q8answer4;
    private static double quizProgress;
    private static int numCorrect;

    String q1 = "How much dry mix do you need to make a large batch of dough?"; //question to be answered
    String q2 = "How often does coffee need to be changed?";
    String q3 = "How long is frosting good?";
    String q4 = "How much blueberry fruit do you need to prepare blueberry frosting?";
    String q5 = "How much water do you need to make a medium batch of dough?";
    String q6 = "What kind of frosting does NOT need extra ingredients?";
    String q7 = "When preparing dough, how many times should you zero the scale?";
    String q8 = "How long can dough be out?;";

    String[] a1 = {"8.0 pounds","One bag","6.5 pounds","5 pounds"}; //possible answer to each question.[0] is the correct one, shuffled when passed into QuizQuestion
    String[] a2 = {"Every 3 hours","Once a day","Twice a day","Every hour"};
    String[] a3 = {"5 days including the day it was made","One day","Only the day it was made","Two weeks"};
    String[] a4 = {"1 cup","3 cups","0.5 cups","2 cups"};
    String[] a5 = {"2.75 pounds","1 pound","3 pounds","2 pounds"};
    String[] a6 = {"Chocolate","Blueberry","Lemon","Strawberry"};
    String[] a7 = {"Twice","Once","Once per day","At closing"};
    String[] a8 = {"30 minutes per batch","An hour","15 minutes per batch","Not at all"};

    QuizQuestion block1 = new QuizQuestion(q1, a1, a1[0]);
    QuizQuestion block2 = new QuizQuestion(q2, a2, a2[0]);
    QuizQuestion block3 = new QuizQuestion(q3, a3, a3[0]);
    QuizQuestion block4 = new QuizQuestion(q4, a4, a4[0]);
    QuizQuestion block5 = new QuizQuestion(q5, a5, a5[0]);
    QuizQuestion block6 = new QuizQuestion(q6, a6, a6[0]);
    QuizQuestion block7 = new QuizQuestion(q7, a7, a7[0]);
    QuizQuestion block8 = new QuizQuestion(q8, a8, a8[0]);
    static
    {
        quizProgress = 0;
        numCorrect = 0;
    }

    @FXML protected void start(ActionEvent event)
    {
        question1.setText(block1.getQuestion());
        q1answer1.setText(block1.getAnswer(0));
        q1answer2.setText(block1.getAnswer(1));
        q1answer3.setText(block1.getAnswer(2));
        q1answer4.setText(block1.getAnswer(3));
        question2.setText(block2.getQuestion());
        q2answer1.setText(block2.getAnswer(0));
        q2answer2.setText(block2.getAnswer(1));
        q2answer3.setText(block2.getAnswer(2));
        q2answer4.setText(block2.getAnswer(3));
        question3.setText(block3.getQuestion());
        q3answer1.setText(block3.getAnswer(0));
        q3answer2.setText(block3.getAnswer(1));
        q3answer3.setText(block3.getAnswer(2));
        q3answer4.setText(block3.getAnswer(3));
        question4.setText(block4.getQuestion());
        q4answer1.setText(block4.getAnswer(0));
        q4answer2.setText(block4.getAnswer(1));
        q4answer3.setText(block4.getAnswer(2));
        q4answer4.setText(block4.getAnswer(3));
        question5.setText(block5.getQuestion());
        q5answer1.setText(block5.getAnswer(0));
        q5answer2.setText(block5.getAnswer(1));
        q5answer3.setText(block5.getAnswer(2));
        q5answer4.setText(block5.getAnswer(3));
        question6.setText(block6.getQuestion());
        q6answer1.setText(block6.getAnswer(0));
        q6answer2.setText(block6.getAnswer(1));
        q6answer3.setText(block6.getAnswer(2));
        q6answer4.setText(block6.getAnswer(3));
        question7.setText(block7.getQuestion());
        q7answer1.setText(block7.getAnswer(0));
        q7answer2.setText(block7.getAnswer(1));
        q7answer3.setText(block7.getAnswer(2));
        q7answer4.setText(block7.getAnswer(3));
        question8.setText(block8.getQuestion());
        q8answer1.setText(block8.getAnswer(0));
        q8answer2.setText(block8.getAnswer(1));
        q8answer3.setText(block8.getAnswer(2));
        q8answer4.setText(block8.getAnswer(3));
    }

    private void update()
    {
        numCorrect+=1;
        quizProgress+= .125;
        progressNumber.setText(Integer.toString(numCorrect) + "/8");
        quizProgressBar.setProgress(quizProgress);
    }

    private void wrong()
    {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Wrong Answer");
        alert.setHeaderText("That's not right. Try again!");
        alert.showAndWait();
    }
    
    @FXML protected void exit(ActionEvent event) throws IOException
    {
        Parent sign = FXMLLoader.load(getClass().getResource("sign.fxml"));
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.getScene().setRoot(sign);
    }
    
    @FXML protected void answer(ActionEvent event)
    {
        if(((Node)event.getSource()).getParent() == questionBlock1)
        {
            if(block1.validate(((RadioButton)event.getSource()).getText()))
            {
                update();  
                for(Toggle e : ((RadioButton)event.getSource()).getToggleGroup().getToggles())
                {
                    ((RadioButton)e).setDisable(true);
                }
            }
            else
            {
                wrong();
                ((RadioButton)event.getSource()).setDisable(true);
            }
        }

        else if(((Node)event.getSource()).getParent() == questionBlock2)
        {
            if(block2.validate(((RadioButton)event.getSource()).getText()))
            {
                update();  
                for(Toggle e : ((RadioButton)event.getSource()).getToggleGroup().getToggles())
                {
                    ((RadioButton)e).setDisable(true);
                }
            }
            else
            {
                wrong();
                ((RadioButton)event.getSource()).setDisable(true);
            }
        }
        else if(((Node)event.getSource()).getParent() == questionBlock3)
        {
            if(block3.validate(((RadioButton)event.getSource()).getText()))
            {
                update();  
                for(Toggle e : ((RadioButton)event.getSource()).getToggleGroup().getToggles())
                {
                    ((RadioButton)e).setDisable(true);
                }
            }
            else
            {
                wrong();
                ((RadioButton)event.getSource()).setDisable(true);
            }
        }
        else if(((Node)event.getSource()).getParent() == questionBlock4)
        {
            if(block4.validate(((RadioButton)event.getSource()).getText()))
            {
                update();  
                for(Toggle e : ((RadioButton)event.getSource()).getToggleGroup().getToggles())
                {
                    ((RadioButton)e).setDisable(true);
                }
            }
            else
            {
                wrong();
                ((RadioButton)event.getSource()).setDisable(true);
            }
        }
        else if(((Node)event.getSource()).getParent() == questionBlock5)
        {
            if(block5.validate(((RadioButton)event.getSource()).getText()) )
            {
                update();  
                for(Toggle e : ((RadioButton)event.getSource()).getToggleGroup().getToggles())
                {
                    ((RadioButton)e).setDisable(true);
                }
            }
            else
            {
                wrong();
                ((RadioButton)event.getSource()).setDisable(true);
            }
        }
        else if(((Node)event.getSource()).getParent() == questionBlock6)
        {
            if(block6.validate(((RadioButton)event.getSource()).getText()) )
            {
                update();  
                for(Toggle e : ((RadioButton)event.getSource()).getToggleGroup().getToggles())
                {
                    ((RadioButton)e).setDisable(true);
                }
            }
            else
            {
                wrong();
                ((RadioButton)event.getSource()).setDisable(true);
            }
        }
        else if(((Node)event.getSource()).getParent() == questionBlock7)
        {
            if(block7.validate(((RadioButton)event.getSource()).getText()) )
            {
                update();  
                for(Toggle e : ((RadioButton)event.getSource()).getToggleGroup().getToggles())
                {
                    ((RadioButton)e).setDisable(true);
                }
            }
            else
            {
                wrong();
                ((RadioButton)event.getSource()).setDisable(true);
            }
        }
        else if(((Node)event.getSource()).getParent() == questionBlock8)
        {
            if(block8.validate(((RadioButton)event.getSource()).getText()) )
            {
                update();  
                for(Toggle e : ((RadioButton)event.getSource()).getToggleGroup().getToggles())
                {
                    ((RadioButton)e).setDisable(true);
                }
            }
            else
            {
                wrong();
                ((RadioButton)event.getSource()).setDisable(true);
            }
        }

    }
}
