# JavaFxTutorial

The JavaFX Tutorial is a program designed by Oracle to introduce an beginning or intermediate programmer to common JavaFX tasks, such as
working with layouts, controls, style sheets, and visual effects. JavaFX is a facet of Java that uses fxml files for formatting a gui and controller files to determine what objects in the gui do, such as actions that occur due to user input. This JavaFX program was an individual assignment for my COP 3003 class during the Fall 2018 semester and it displays a simple gui that showcases a background image set to the scene and a button that displays pre-determined text when pushed. The secondary program, Colorful Circles, showcases an animation done with JavaFX's Animation class. This program uses the Google Java Style guide and was developed using Java and JavaFX in the IntelliJ Ultimate Integrated Development Environment.

# Demonstration
// TO DO: Add an animated gif. You can use ShareX, GIPHY Capture or another tool. https://blog.github.com/2018-06-29-GIF-that-keeps-on-GIFing/ Note for school project: This is a great way for friends and family to easily see your project in action.

# Getting Started
To run the program, download the package "fxmlexample" and/or "colorfulcircles" and open the .java files in an IDE of your choosing. To
interact with either program, run the Main class contained in one package and follow the below instructions:

- For the fxmlexample package, a grey window will appear when Main is run, containing to text fields and a button. The text fields are
editable, however, they are not coded for any action. 
  - If the button is pressed, text will appear for a few seconds, and then disappear. You can push the button as many times as you like.

- For the colorfulcircles package, a black window will open when Main is run and it will show several circles moving in a randomized
fashion, changing in a gradient of rainbow colors. The animation lasts for forty seconds and there is no interation with the user beyond
opening the window. It showcases a simple animation only.

# Built With
The JavaFxTutorial program was built in the Intellij IDEA integrated development environment. It was made using the Java ver. 1.8.0_181.
Resources used: [Getting Started](https://docs.oracle.com/javafx/2/get_started/jfxpub-get_started.htm)

# Author
- Developed by Marion Armbruster

# License
MIT License

Copyright (c) 2018 Marion Armbruster. See License.

# Acknowledgments
Web sites utilized: [Instructions](https://docs.oracle.com/javafx/2/get_started/jfxpub-get_started.htm)

Ackowledgements are also due to Professor Vanselow and Damian Morgan for assisting in various instances with the program as well as the
shenanigans introduced by both githib and IntelliJ. 

# Key Programming Concepts Utilized

Key concepts: JavaFX: always has a start method to initialize the first stage and the scene within it, and a Main tha launches it. Uses Controllers and fxml files for the bulk of the program and can use css to separate the style and looks from the rest of the scene. JavaFX can utilize a Model-view-controller (MVC) design principle and design where the model of the program is spearate from both the view (fxml file) and the control (controller file) of the program.

JavaFX is much easier to use than Java Swing for some cases. 
