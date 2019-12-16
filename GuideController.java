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
public class GuideController
{
    @FXML private Text guideField;

    @FXML protected void back(ActionEvent event) throws IOException
    {
        Parent sign = FXMLLoader.load(getClass().getResource("sign.fxml"));
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.getScene().setRoot(sign);
    }

    @FXML protected void guide1(ActionEvent event)
    {
        guideField.setText("1. Place large coffee filter in empty coffee drip\n2. Place the coffee drip in the grinder, select the desired amount of coffee, and press Grind\n3. Once the grinder is finished, place the drip into the brewer\n4. Place the empty coffee holder under the drip and begin brewing\n5. Once finished, place in front of store\nRemember that coffee must be changed every 3 hours");
    }

    @FXML protected void guide2(ActionEvent event)
    {
        guideField.setText("1. Spray bowl, mixing paddle, and spatula with cooking spray\n2. Place empty water pitcher on scale and press Tare to zero\n3. Measure out 5.0 pounds of water and pour into the bowl\n4. Place empty dry mix container on scale and press Tare to zero\n5. Measure out 2.75 pounds of dry mix and pour into the bowl\n6. Mix with paddle, then place bowl and paddle on the mixer\n7. Set mixer for 1 minute on speed one and mix\n8. When finished, set mixer for 2 minutes on speed two and mix\n9. Unlatch the bowl and paddle and scrape extra dough off of the paddle using the spatula");
    }

    @FXML protected void guide3(ActionEvent event)
    {
        guideField.setText("1. Open the cardboard Primex box and cut off the sides\n2. Using a kitchen knife, cut the solid oil into cubes\n3. Fill each plastic container 3/4 of the way full with the oil cubes\n\nIf the donuts are sticking to each other and the machine, the oil level is low. Skip to step 4!\nIf the donuts are baseball-shaped, the oil level is too high. Skip to step 8!\n\n4. LOW OIL LEVEL: Use a ladle to scoop more oil into the machine from the oil holder\n5. If there is not enough oil in the holder, microwave a plastic container full of solid oil for 9 minutes\n6. Once the microwave is finished, pour the melted oil into the oil holder\n7. Ladle oil into the fryer, making sure that it is only as full as the oil level indicator in the fryer\n\n8. HIGH OIL LEVEL: Ladle oil out of the fryer into the oil holder, making sure to keep the oil level at the oil level indicator in the fryer");
    }

    @FXML protected void guide4(ActionEvent event)
    {
        guideField.setText("1. Open an espresso pod pack and load into the espresso machine\n2. Pick the proper hot cup size, place under the espresso drip, and press the 2 shot button\n3. Fill a metal cup with milk and steam using the steam extension on the espresso machine until hot to the touch\n4. Pour the milk into the hot cup with espresso\n5. According to the recipes, put the proper amount of syrup into the drink and stir\n6. If desired, top with whipped cream and other toppings");
    }

    @FXML protected void guide5(ActionEvent event)
    {
        guideField.setText("1. Get an empty plastic container of the appropriate size\n2. According to the recipe, scoop the proper amount of base frosting into the container\n3. Once the frosting has been scooped, add necessary ingredients according to the type of frosting being prepped\n4. Place a lid on the container\n5. Take a designated prep sticker and label with employee initials, type of frosting, date of prep, and 5 days after date of prep\n6. Place sticker on the container and place on shelf with other frostings");
    }

    @FXML protected void guide6(ActionEvent event)
    {
        guideField.setText("guide6");
    }
}
