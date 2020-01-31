package sqlit;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;

import javax.xml.soap.Text;
import java.awt.*;
import java.io.IOException;

public class MainWindowController {

    //**********************************************//
    //                   CONTROLS                   //
    //**********************************************//

    @FXML
    AnchorPane executeAnchorPane;

    SQLEditorController editorController;

    //***********************************************//
    //                    METHODS                    //
    //***********************************************//

    @FXML
    protected void initialize() {
        try {
            //STEP ONE: load in the fxml of any children you wish to add
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SQLEditor.fxml"));
            Parent root = fxmlLoader.load();

            //STEP TWO: Assign a controller
            this.editorController = fxmlLoader.getController();

            //STEP THREE: Add the node
            this.executeAnchorPane.getChildren().add(root);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
