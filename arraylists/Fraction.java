package arraylists;
public class Fraction implements Custom{
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    // https://www.w3schools.com/java
    @Override
    public String toString() {
        int whole = this.numerator / this.denominator;

        if (whole == 0) {
            return this.numerator + "/" + this.denominator;
        } else {
            int newNumerator = this.numerator - this.denominator * whole;
            return whole + " " + newNumerator + "/" + this.denominator;
        }
    }

    public double numeric() {
        return (double)this.numerator / this.denominator;
    }
}
