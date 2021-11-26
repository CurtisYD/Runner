import javafx.animation.AnimationTimer;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public abstract class AnimatedThing<Public> {
    private static int cam = 0;
    private double U,W;
    private static ImageView perso;
    private int attitude;
    private int index,indexmax, Tframes, Wsize,Offsetframes;
    private float m;

    public AnimatedThing (double X, double Y, String fileName) {
        perso = new ImageView(fileName);
        perso.setX(X);
        perso.setY(Y);
    }

    static void update(long time) {
            cam = cam + 84;
            if (cam >= 425) {
                cam = 0;
            }

            perso.setViewport(new Rectangle2D(cam,0,82,100));


    }

    public ImageView getPerso(){
            return perso;
        }

        public static void jump(AnimationTimer timer, int Saut) {


            perso.setViewport(new Rectangle2D(5, 162, 82, 100));
            perso.setViewport(new Rectangle2D(88, 162, 82, 100));

            TranslateTransition Jump = new TranslateTransition(Duration.seconds(0.5), perso);
            Jump.interpolatorProperty().set(Interpolator.SPLINE(.1, .1, .7, .7));
            Jump.setFromY(0);
            Jump.setToY(-150);
            Jump.setAutoReverse(true);
            Jump.setCycleCount(2);

            TranslateTransition Pumj = new TranslateTransition(Duration.seconds(0.5), perso);
            Jump.interpolatorProperty().set(Interpolator.SPLINE(.1, .1, .7, .7));
            Jump.setFromY(0);
            Jump.setToY(-150);
            Jump.setAutoReverse(true);
            Jump.setCycleCount(2);

        }
}
