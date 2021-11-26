import javafx.animation.AnimationTimer;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public abstract class AnimatedThing<Public> {

    private double U,W;
    private static ImageView perso;
    private static int index;

    // Affiche le hero
    public AnimatedThing (double X, double Y, String fileName) {
        perso = new ImageView(fileName);
        perso.setX(X);
        perso.setY(Y);
    }

    public ImageView getPerso(){
        return perso;
    }

    // Affiche le hero en train de courir
    static void update(long time) {
        index = index + 84;
            if (index >= 425) {
                index = 0;
            }
            perso.setViewport(new Rectangle2D(index,0,82,100));

    }

    // Fonction de saut
    public static void jump() {
        //Animation saut
       /* perso.setViewport(new Rectangle2D(5, 162, 82, 100));
        perso.setViewport(new Rectangle2D(88, 162, 82, 100));*/

        TranslateTransition Jump = new TranslateTransition(Duration.seconds(0.5), perso);
        Jump.setFromY(0);
        Jump.setToY(-100);
        Jump.setAutoReverse(true);
        Jump.setCycleCount(2);
        Jump.play();

    }
}
