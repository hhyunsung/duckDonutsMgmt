import java.util.ArrayList;
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
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
public class detailController {
    @FXML private VBox empPanel;
    @FXML private RadioButton showButton;
    
    @FXML protected void show(ActionEvent event)
    {
        for( Employee e : Employee.getEmployees())
        {
            empPanel.getChildren().add(new Text(e.getName()));
            empPanel.getChildren().add(new Text(e.getPhone()));
            empPanel.getChildren().add(new Text(((Integer)e.getPin()).toString()));
            empPanel.getChildren().add(new Text(((Integer)e.getAge()).toString()));
            empPanel.getChildren().add(new Text(e.getEmail()));
        }
        
        showButton.setDisable(true);
    }

   @FXML protected void close(ActionEvent event)
    {
        ((Stage)((Node)event.getSource()).getScene().getWindow()).close();
    }
    
}
