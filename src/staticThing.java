import com.sun.javafx.scene.control.DoubleField;
import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.io.File;

public class staticThing {


    private double X;
    private double Y;
    private ImageView sprite;


    public staticThing (double X, double Y, String fileName) {
        // Affichage backround
        sprite = new ImageView(fileName);
        sprite.setX(X);
        sprite.setY(Y);

       //Translation du backround
        TranslateTransition trans1 = new TranslateTransition(Duration.seconds(2.5), sprite);
        trans1.setFromX(0);
        trans1.setToX(-800);
        trans1.setInterpolator(Interpolator.LINEAR);
        trans1.setCycleCount(Animation.INDEFINITE);
        trans1.play();
   }


        public ImageView getSprite() {
            return sprite;
        }


}
