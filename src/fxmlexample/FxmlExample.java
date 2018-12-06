/***************************************************
 * File: FxmlExample.java                           *
 * Author: Marion Armbruster                        *
 * Date: 30 August 2018                             *
 ****************************************************/

package fxmlexample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The standard class for an JavaFX and FXML program with a main method and a JavaFX start method
 * that details the first stage and scene.
 */
public class FxmlExample extends Application {

  // creates a blank windows with a title name in the title-bar - uses .css, Controller, and .fxml
  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));

    // sets the scene; class Scene, and object scene; each "scene" can be different
    Scene scene = new Scene(root, 300, 275);

    primaryStage.setTitle("FXML Welcome");
    primaryStage.setScene(scene);

    // call to show function - makes the window actually appear
    primaryStage.show();

  } // end javaFX start method

  public static void main(String[] args) {
    launch(args);
  } // end main method

}


  /* the start function for javaFX that was for the 1st tutorial section; old stuff
  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Hello World!");
    Button btn = new Button();
    btn.setText("Say 'Hello World'");
    btn.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {
        System.out.println("Hello World!");
      }
    });
    // needs import scene.layout.StackPane
    StackPane root = new StackPane();
    root.getChildren().add(btn);
    primaryStage.setScene(new Scene(root, 300, 250));
    primaryStage.show();
  }*/


/*This was put into the fxml file, version 1 through 3
    // accesses and customizes what goes in the "primary stage", the new blank window
    GridPane grid = new GridPane();
    grid.setAlignment(Pos.CENTER);
    grid.setHgap(10);
    grid.setVgap(10);
    // order of padding is top, right, bottom, left
    grid.setPadding(new Insets(25, 25, 25, 25));

    // make the button and set position, etc
    Button btn = new Button("Sign in");
    HBox hbBtn = new HBox(10);
    hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
    hbBtn.getChildren().add(btn);
    grid.add(hbBtn, 1, 4);

    final Text actionTarget = new Text();
    actionTarget.setId("actionTarget");
    grid.add(actionTarget, 1, 6);

    // makes the button action/event
    btn.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent e) {
        actionTarget.setText("Sign in button pressed!");
      }
    });

    // title inside window with font specifications;
    Text sceneTitle = new Text("Welcome");
    sceneTitle.setId("welcome-text");
    grid.add(sceneTitle, 0, 0, 2, 1); // column, row, column span, row span

    // creates label for an input box
    Label userName = new Label("User Name:");
    grid.add(userName, 0, 1);

    // creates the actual input box
    TextField userTextField = new TextField();
    grid.add(userTextField, 1, 1);

    // creates label for another input box
    Label passW = new Label("Password:");
    grid.add(passW, 0, 2);

    // creates another input box
    PasswordField pwBox = new PasswordField();
    grid.add(pwBox, 1, 2);

    // shows all grid lines
    //grid.setGridLinesVisible(true);  //end of what was moved to the fxml file*/

    /*Not necessary as of tutorial 4
    // allows .java to "see" that there is a CSS file and use it
    scene.getStylesheets().add(FxmlExample.class.getResource("FxmlExample.css").toExternalForm());*/
