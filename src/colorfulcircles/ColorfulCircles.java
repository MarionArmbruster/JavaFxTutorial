/***************************************************
 * File: ColorfulCircles.java                      *
 * Author: Marion Armbruster                       *
 * Date: 8 November 2018                           *
 *                                                 *
 * A separate program altogether from the          *
 * FxmlExample.java program. This showcases        *
 * a group of possible animations that javaFX is   *
 * capable of. This is an example only.            *
 ***************************************************/

package colorfulcircles;

import static java.lang.Math.random;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.BoxBlur;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * A class that uses circles and rectangles to make a gradient, blurry animation of rainbow colors.
 * The rectangle maintains a black background, while the circles shift through the gradient of
 * colors. The animation lasts for 40 seconds and is randomized. Due to this being a tutorial, all
 * code is in the main start method. Ideally, it would be separated into the model, view, and
 * controller files.
 */
public class ColorfulCircles extends Application {

  @Override
  public void start(Stage primaryStage) {

    // set up the stage and scene, along with an object of the group class for the shapes
    Group root = new Group();
    Scene firstScene = new Scene(root, 800, 600, Color.BLACK);
    primaryStage.setScene(firstScene);
    primaryStage.setTitle("Colorful Circles");

    // creates 30 circle shapes in the scene, stacked on top of each other at (0,1), the top-left
    // corner, because no location within the scene was specified for each one
    Group circles = new Group();
    for (int i = 0; i < 30; i++) {
      Circle circle = new Circle(150, Color.web("white", 0.05));
      circle.setStrokeType(StrokeType.OUTSIDE);
      circle.setStroke(Color.web("white", 0.16));
      circle.setStrokeWidth(4);
      // adds each circle to the "group"
      circles.getChildren().add(circle);
    }

    /* sets the background as a rectangle "behind" the group of circles and makes the scene have
     many different colors as a diagonal rainbow, similar to what would be seen in
     default powerpoint background.*/
    Rectangle colors = new Rectangle(firstScene.getWidth(), firstScene.getHeight(),

        /* new linear gradient, with parameters of where it starts and where it ends (0,1)
         and (1,0) respectively; "true" makes the gradient proportional to the rectangle shape;
         the colors don't cycle through repeatedly on the scene, and a new stop array (sequence)
         that says where each color starts and stops.*/
        new LinearGradient(0f, 1f, 1f, 0f, true, CycleMethod.NO_CYCLE, new
            Stop[]{
            new Stop(0, Color.web("#f8bd55")),
            new Stop(0.14, Color.web("#c0fe56")),
            new Stop(0.28, Color.web("#5dfbc1")),
            new Stop(0.43, Color.web("#64c2f8")),
            new Stop(0.57, Color.web("#be4af7")),
            new Stop(0.71, Color.web("#ed5fc2")),
            new Stop(0.85, Color.web("#ef504c")),
            new Stop(1, Color.web("#f2660f")),}));

    // binds the colors to the size of the scene so that it moves accordingly whenever the size
    // of the scene is changed; i.e. the size of the rectangle, which follows the size of the stage
    colors.widthProperty().bind(firstScene.widthProperty());
    colors.heightProperty().bind(firstScene.heightProperty());

    // since the circles and rectangle are "children" of the root group, they can both be changed
    // and modified for a different effect instead of just plain adding them to the scene.
    Group blendModeGroup =
        new Group(new Group(new Rectangle(firstScene.getWidth(), firstScene.getHeight(),
            Color.BLACK), circles), colors);

    colors.setBlendMode(BlendMode.OVERLAY);
    root.getChildren().add(blendModeGroup);

    // makes the circles look blurry; BoxBlur(wide, height, blur iteration)
    circles.setEffect(new BoxBlur(10, 10, 3));

    /* makes the animation; establishes a timeline and the length of it. Has two
     "keyframes" - one designates the beginning, and one the end of the timeline with the
     translations of the circles randomized throughout*/
    Timeline timeline = new Timeline();
    for (Node circle : circles.getChildren()) {
      timeline.getKeyFrames().addAll(
          new KeyFrame(Duration.ZERO, // set start position at 0
              new KeyValue(circle.translateXProperty(), random() * 800),
              new KeyValue(circle.translateYProperty(), random() * 600)
          ),
          new KeyFrame(new Duration(40000), // set end position at 40s
              new KeyValue(circle.translateXProperty(), random() * 800),
              new KeyValue(circle.translateYProperty(), random() * 600)
          )
      );
    }

    // plays 40sec of animation
    timeline.play();

    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

} // end of ColorfulCircles