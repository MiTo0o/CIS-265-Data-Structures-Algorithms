package arraylists;

public class MyInteger implements Custom{
    int i;
    public MyInteger(int i) {
        this.i = i;
    }

    public double numeric() {
        return this.i;
    }

    @Override
    public String toString() {
         return this.i+"";
    }
}
