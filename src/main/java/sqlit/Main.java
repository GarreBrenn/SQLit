package sqlit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Main extends Application {

    //**********************************************//
    //                  CONSTANTS                   //
    //**********************************************//

    private static final String SQLITE_LOGO = "sqlit/logo-01.png";

    //**********************************************//
    //                  ATTRIBUTES                  //
    //**********************************************//

    private static Image logo;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("SQLit");

        Parent root = FXMLLoader.load(getClass().getResource("main-window.fxml"));

        // Set Stage boundaries to visible bounds of the main screen
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        primaryStage.setX(primaryScreenBounds.getMinX());
        primaryStage.setY(primaryScreenBounds.getMinY());
        primaryStage.setWidth(primaryScreenBounds.getWidth());
        primaryStage.setHeight(primaryScreenBounds.getHeight());

        // Load logo
        try {
            primaryStage.getIcons().add(new Image(SQLITE_LOGO));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static Image getLogo() {
        return logo;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
