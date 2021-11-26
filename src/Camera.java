import javafx.geometry.Rectangle2D;

public class Camera {

        private int X, Y, V;

    public Camera ( int x, int y){
            this.X = x;
            this.Y = Y;
            Rectangle2D camera = new Rectangle2D(x,y,82,100);
        }

    public int getX () {
            return X;
        }

        public int getY () {
            return Y;
        }

    @Override
    public String toString() {
        return "X =" + X + "\'" + ", Y=" + Y + "\'" ;

    }

    public static void update(long time) {
    }
}

