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
import javafx.scene.control.Alert;
public class SignController {
    @FXML private PasswordField quizPIN;
    @FXML private PasswordField managePIN;
    @FXML protected void enterQuiz(ActionEvent event) throws IOException
    {
        if(managePIN.getText() == "" || validate(Integer.parseInt(managePIN.getText())) == false)
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Incorrect PIN");
            alert.setHeaderText("Invalid user PIN");
            alert.showAndWait();
            return;
        }
        else
        {
            Parent quiz = FXMLLoader.load(getClass().getResource("quiz.fxml"));
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.getScene().setRoot(quiz);
        }
    }

    @FXML protected void enterEmployee(ActionEvent event) throws IOException
    {
        if(managePIN.getText() == "" || validate(Integer.parseInt(managePIN.getText())) == false)
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Incorrect PIN");
            alert.setHeaderText("Invalid manager PIN");
            alert.showAndWait();
            return;
        }
        else
        {
            Employee.load();
            Parent emp = FXMLLoader.load(getClass().getResource("employeeview.fxml"));
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.getScene().setRoot(emp);
        }
    }

    private boolean validate(int pass)
    {
        if(pass == 1234)
        {
            return true;
        }
        for( Integer p : Employee.getPinList())
        {
            if(pass == p.intValue())
            {
                return true;
            }
        }
        return false;
    }

    @FXML protected void enterGuides(ActionEvent event) throws IOException
    {
        Parent guide = FXMLLoader.load(getClass().getResource("guides.fxml"));
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.getScene().setRoot(guide);
    }
}
