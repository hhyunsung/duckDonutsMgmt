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
    @FXML private ScrollPane empViewScrollPane;
    @FXML private ToggleGroup employees = new ToggleGroup();
    @FXML private ArrayList<ToggleButton> info = new ArrayList();

    //empViewScrollPane.setVbarPolicy(ScrollBarPolicy.ALWAYS);

    /**
     * Sends user back to sign in screen.
     * 
     */@FXML protected void exit(ActionEvent event) throws IOException
    {
        Parent sign = FXMLLoader.load(getClass().getResource("sign.fxml"));
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.getScene().setRoot(sign);
    }

    /**
     * Opens the window to create new employee objects
     * 
     */@FXML protected void employeeWindow() throws IOException
    {
        Parent emp = FXMLLoader.load(getClass().getResource("createEmp.fxml"));
        Stage empWindow = new Stage();
        empWindow.setTitle("Create Employee");
        empWindow.setScene(new Scene(emp, 450, 300));
        empWindow.setResizable(false);
        empWindow.show();
    }

    /**
     * Opens window to add tasks to an employee
     * 
     */@FXML protected void taskWindow() throws IOException
    {
        Parent t = FXMLLoader.load(getClass().getResource("createTask.fxml"));
        Stage taskWindow = new Stage();
        taskWindow.setTitle("Create Task");
        taskWindow.setScene(new Scene(t, 450, 300));
        taskWindow.setResizable(false);
        taskWindow.show();
    }

    /**
     * Displays tasks of selected employee
     * @param temp the employee whose tasks will be displayed
     * 
     */@FXML protected void showTasks(Employee temp)
    {
        taskView.getChildren().clear();
        Text task = new Text(temp.writeTasks());
        taskView.getChildren().add(task);

    }
     
    /**
     * Opens window that displays tasks of currently selected employee
     * 
     */@FXML protected void removeTaskWindow(ActionEvent event) throws IOException
    {
        Parent t = FXMLLoader.load(getClass().getResource("removeTask.fxml"));
        Stage detailWindow = new Stage();
        detailWindow.setTitle(((ToggleButton)employees.getSelectedToggle()).getText());
        detailWindow.setScene(new Scene(t, 450, 300));
        detailWindow.setResizable(false);
        detailWindow.show();
        
    }

    /**
     * Opens window that displays all employees
     * 
     */@FXML protected void viewDetail(ActionEvent event) throws IOException
    {
        Parent t = FXMLLoader.load(getClass().getResource("empDetail.fxml"));
        Stage taskWindow = new Stage();
        taskWindow.setTitle("Employees");
        taskWindow.setScene(new Scene(t, 450, 300));
        taskWindow.setResizable(false);
        taskWindow.show();
    }
    
    /**
     * Refreshes the side of the screen displaying the employees, showing new ones that were added.
     * 
     */@FXML protected void addEmp(ActionEvent event)
    {
        for(int i = 0; i< Employee.getEmployees().size();i++)
        {
            Employee temp = Employee.getEmployees().get(i);

            ToggleButton tempR = new ToggleButton(temp.getName());
            if(!exists(tempR.getText()))
            {
                tempR.setOnAction(e -> 
                    {
                        if(tempR.isSelected())
                        {
                            showTasks(temp);
                        }
                        else
                        {
                            taskView.getChildren().clear();
                        }
                    });
                tempR.setToggleGroup(employees);
                info.add(tempR);
            }
        }
        empShortView.getChildren().clear();
        for( ToggleButton b : info)
        {
            empShortView.getChildren().add(b);
        }
        Employee.save();
    }

    /**
     * Checks if button associated with employee already exists to avoid duplicates
     * @param name of employee used to match wit hthe text of a button
     * 
     */private boolean exists(String name)
    {
        for( ToggleButton b : info)
        {
            if(name == b.getText())
            {
                return true;
            }
        }
        return false;
    }
}