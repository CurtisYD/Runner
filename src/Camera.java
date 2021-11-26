public class Camera {

        private int X, Y;

    public Camera ( int x, int y){
            this.X = x;
            this.Y = Y;
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

