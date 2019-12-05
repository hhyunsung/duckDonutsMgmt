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
public class EmployeeController  {
    @FXML private VBox taskView;
    @FXML private VBox empShortView;

    @FXML private ToggleGroup employees = new ToggleGroup();
    @FXML private ArrayList<RadioButton> info = new ArrayList();

    //@FXML protected void setup(ActionEvent event)
    //{
    //   for(Employee e : Employee.emps)
    //   {

    //        info.add(new RadioButton(e.shortView()));

    //    }

    //    for (RadioButton b : info)
    //   {
    //b.setToggleGroup(employees);
    //if(b !=
    //empShortView.getChildren().add(b);
    //    }
    //}

    @FXML protected void exit(ActionEvent event) throws IOException
    {
        Parent sign = FXMLLoader.load(getClass().getResource("sign.fxml"));
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.getScene().setRoot(sign);
    }

    @FXML protected void enter(ActionEvent event) throws IOException
    {
        Parent quiz = FXMLLoader.load(getClass().getResource("quiz.fxml"));
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.getScene().setRoot(quiz);
    }

    @FXML protected void employeeWindow() throws IOException
    {
        Parent emp = FXMLLoader.load(getClass().getResource("createEmp.fxml"));
        Stage empWindow = new Stage();
        empWindow.setTitle("Create Employee");
        empWindow.setScene(new Scene(emp, 450, 300));
        empWindow.show();
    }
    
    @FXML protected void taskWindow() throws IOException
    {
        Parent emp = FXMLLoader.load(getClass().getResource("createTask.fxml"));
        Stage empWindow = new Stage();
        empWindow.setTitle("Create Task");
        empWindow.setScene(new Scene(emp, 450, 300));
        empWindow.show();
    }
    @FXML protected void showTasks(Employee temp)
    {
        Text tempR = new Text(temp.getTasks());
        taskView.getChildren().add(tempR);
        
    }
    
    @FXML protected void addEmp(ActionEvent event)
    {
        Employee temp = Employee.emps.get(0);
        RadioButton tempR = new RadioButton(temp.shortView());
        tempR.setOnAction(e -> { showTasks(temp);});
        tempR.setToggleGroup(employees);
        info.add(tempR);
        empShortView.getChildren().add(tempR);
    }
}