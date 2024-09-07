package arraylists;

class MyString implements Custom{
    String str;
    public MyString(String str) {
        this.str = str;
    }

    public double numeric() {
        double num = 0;
        for (char c : this.str.toCharArray()) {
            num += (int)c;
        }
        return num;
    }

    @Override
    public String toString() {
        return str;
    }
}