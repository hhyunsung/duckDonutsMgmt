import javafx.scene.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.*;
import javafx.scene.control.PasswordField;
public class SignController {
    @FXML private PasswordField quizPIN;
    
    @FXML protected void enterQuiz(ActionEvent event) throws IOException
    {
        Parent quiz = FXMLLoader.load(getClass().getResource("quiz.fxml"));
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.getScene().setRoot(quiz);
    }
     @FXML protected void enterEmployee(ActionEvent event) throws IOException
    {
        Parent emp = FXMLLoader.load(getClass().getResource("employeeview.fxml"));
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.getScene().setRoot(emp);
        
    }
}
