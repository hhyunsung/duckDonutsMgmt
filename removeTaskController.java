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
public class removeTaskController {
    @FXML private RadioButton showButton;
    @FXML private VBox taskView;
    private ArrayList<ToggleButton> tasklist = new ArrayList();
    private Employee employee;
    
    @FXML protected void show(ActionEvent event)
    {
        
        for(int i = 0;i<Employee.getEmployees().size();i++)
        {
            if(((Stage)((Node)event.getSource()).getScene().getWindow()).getTitle().equals(Employee.getEmployees().get(i).getName()))
            {
                employee = Employee.getEmployees().get(i);
            }
        }
         
        for( Task t : employee.getTasks())
        {
            ToggleButton button = new ToggleButton(t.getDescription());
            button.setOnAction(e -> {delete(button);});
            taskView.getChildren().add(button);
            
            tasklist.add(button);
        }
        
        showButton.setDisable(true);
    }
    
    /**
     * removes selected task from list
     * @param button passed from lambda expression to match postion in arraylist with that of the task in its own list
     */protected void delete(ToggleButton button)
    {
        int index = tasklist.indexOf(button);
        employee.getTasks().remove(index);
    }
    
   @FXML protected void close(ActionEvent event)
    {
        ((Stage)((Node)event.getSource()).getScene().getWindow()).close();
    }
    
}
