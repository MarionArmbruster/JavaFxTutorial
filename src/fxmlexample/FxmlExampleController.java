/*********************************************************
 * File: FxmlExampleController.java                      *
 * Author: Marion Armbruster                             *
 * Date: 12 September 2018                               *
 *********************************************************/

package fxmlexample;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class FxmlExampleController {

  @FXML
  private Text actionTarget;

  /**
   * This method handles and controls what happens when the button is pressed; i.e. text is
   * displayed on the stage. It also includes a lambda expression to give the scene the appearance
   * of the text disappearing afterwards.
   *
   * @param event The standard event action listener.
   */
  @FXML
  protected void handleSubmitButtonAction(ActionEvent event) {
    actionTarget.setText("Sign in button pressed");
    PauseTransition pause = new PauseTransition(Duration.seconds(5));
    pause.setOnFinished((ActionEvent event2) -> actionTarget.setText(" "));
    pause.play();
  }
}