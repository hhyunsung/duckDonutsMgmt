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
public class TaskController {
    @FXML protected TextField name;
    @FXML protected TextField description;
    @FXML protected TextField priority;
    
    Task created;
    /**
     * takes user inputt of task description and assigns task to employee ordered by integer value priority
     * 
     */@FXML protected void submitTask(ActionEvent event)
    {
        created = new Task(description.getText(), Integer.parseInt(priority.getText()));
        for(int i = 0;i<Employee.getEmployees().size();i++)
        {
            if(name.getText().equals(Employee.getEmployees().get(i).getName()))
            {
                Employee.getEmployees().get(i).addTask(created);
            }
        }
         
        
        
        closeCreate(event);
    }
    
   @FXML protected void closeCreate(ActionEvent event)
    {
        ((Stage)((Node)event.getSource()).getScene().getWindow()).close();
    }
    
}
