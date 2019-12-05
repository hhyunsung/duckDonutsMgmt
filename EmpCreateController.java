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
public class EmpCreateController {
    @FXML private TextField name;
    @FXML private TextField pin;
    @FXML private TextField phone;
    @FXML private TextField age;
    @FXML private TextField email;

    Employee created;
    @FXML protected void submitEmp(ActionEvent event)
    {
         created = new Employee(name.getText(), phone.getText(), Integer.parseInt(pin.getText()), Integer.parseInt(age.getText()), email.getText());
        
        
        closeCreate(event);
    }
    
    public Employee getCreatedEmp()
    {
        return created;
    }
    
    @FXML protected void closeCreate(ActionEvent event)
    {
        ((Stage)((Node)event.getSource()).getScene().getWindow()).close();
    }
}
