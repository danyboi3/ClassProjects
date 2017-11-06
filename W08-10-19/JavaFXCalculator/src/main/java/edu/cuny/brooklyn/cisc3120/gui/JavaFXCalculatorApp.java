package edu.cuny.brooklyn.cisc3120.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaFXCalculatorApp extends Application {
    private final static String MAIN_SCENE_FXML = "fxml_mainscene.fxml";
    private final static String APP_TITLE = "Simple JavaFX Calculator";
    private final static String MAIN_SCENE_CSS = "appmain.css";
            
            
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane mainPane = (Pane)FXMLLoader.load(getClass().getResource(MAIN_SCENE_FXML));
        Scene mainScene = new Scene(mainPane);
        mainScene.getStylesheets().add(MAIN_SCENE_CSS);
        
        primaryStage.setTitle(APP_TITLE);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
}

/*JavaFXCalculatorApp.java is the View since it sets up the GUI
 * 
 * MainSceneController.java is the Controller since it contains
 * all the actions and uses FXML
 * 
 * CalculatorModel.java is the Model since it contains the code
 * which will be implied
 * 
 * the Controller and View depend on the Model but the Model does not 
 * depend on the either of the two. 
*/