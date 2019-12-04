import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class GuiLoader extends Application {
    
    public static void main(String[] args) {
        Application.launch(GuiLoader.class, args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent splash = FXMLLoader.load(getClass().getResource("splash.fxml"));
        
        stage.setTitle("Duck Donuts Management");
        stage.setScene(new Scene(splash, 900, 600));
        stage.show();
    }
}
