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
public class SplashController {
    @FXML private Text actiontarget;
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
    }

    @FXML protected void enter(ActionEvent event) throws IOException
    {
        Parent sign = FXMLLoader.load(getClass().getResource("sign.fxml"));
        Scene root = new Scene(sign, 900, 600);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(root);
        window.show();
    }
}
