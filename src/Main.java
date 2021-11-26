import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;

 public class Main extends Application {

     @Override
     public void start(Stage primaryStage) {

         primaryStage.setTitle("Map");
         Group root = new Group();
         Pane pane = new Pane(root);
         GameScene theScene = new GameScene(pane, 800, 400);
         primaryStage.setScene(theScene);
         primaryStage.show();

     }

     public static void main(String[] args) {
         launch(args);
     }
 }

