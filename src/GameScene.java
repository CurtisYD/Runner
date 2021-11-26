import javafx.animation.AnimationTimer;
import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.io.File;

public class GameScene extends Scene {

    private static int cam;
    private static GameScene timers;
    Camera CamJeux = new Camera(0, 0);
    public int saut = 0;

    public GameScene(Pane pane, int X, int Y) {
        super(pane, X, Y);
        timer.start();
        Pane root = pane;
        root.getChildren().addAll(left.getSprite());
        root.getChildren().addAll(right.getSprite());
        root.getChildren().addAll(StartH.getPerso());
        makejump();
    }

    staticThing left = new staticThing(0, 0, "C:\\Staticz\\School\\S7\\Informatique\\Java Labs\\Projet\\Image\\desert4.png");
    staticThing right = new staticThing(2400, 0, "C:\\Staticz\\School\\S7\\Informatique\\Java Labs\\Projet\\Image\\desert4.png");
    Hero StartH = new Hero(350, 250, "C:\\Staticz\\School\\S7\\Informatique\\Java Labs\\Projet\\Image\\Heros.png");

    AnimationTimer timer = new AnimationTimer() {
        int framecount = 0;

        @Override
        public void handle(long time) {
            if(framecount%6==0){
            AnimatedThing.update(time);}
            Camera.update(time);
            GameScene.update(time);
            framecount++;
            //System.out.println(framecount);
        }
    };

    public AnimationTimer getTimer() {
        return timer;
    }

    private static void update(long time) {

    }

    void makejump() {
        this.setOnMouseClicked(event -> {
            saut=1;
            //System.out.println("Jump");
            //System.out.println(saut);
            AnimatedThing.jump(timer,saut);


        });

    }

    public int getSaut() {
        return saut;
    }
}