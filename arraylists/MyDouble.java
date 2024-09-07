package arraylists;

public class MyDouble implements Custom {
    double d;
    public MyDouble(double d) {
        this.d = d;
    }

    public double numeric() {
        return this.d;
    }
    @Override
    public String toString() {
         return this.d+"";
    }
}
