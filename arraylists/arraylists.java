package arraylists;
import java.util.Scanner;
import java.util.ArrayList;


public class arraylists {
    public static void main(String[] args) {

        
        String options = "option 0 - Exit\n"
                    + "option 1 - Print author info\n"
                    + "option 2 - Enter an integer\n"
                    + "option 3 - Enter a numerator and a denominator\n"
                    + "option 4 - Enter a floating point value\n"
                    + "option 5 - Enter a single \"word\" of text\n"
                    + "option 6 - Print all values that have been entered via options 2 through 5 since the last time the data was clearedr\n"
                    + "option 7 - Print all fractions that have been entered since the last clear\n"
                    + "option 8 - Print all whole numbers that have been entered since the last clear\n"
                    + "option 9 - Print all floating point values that have been entered since the last clear\n"
                    + "option 10 - Print all strings that have been entered since the last clear\n"
                    + "option 11 - Sum all stored values, for strings the value of a string is considered to the sum of all of all of the ascii values of the characters in the string\n"
                    + "option 12 - Remove all entered data\n";

        Scanner Scan = new Scanner(System.in); 
        ArrayList<Custom> list = new ArrayList <>();

        while(true) {
            System.out.println(options);
            int option = Scan.nextInt();

            switch(option) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Name: Derzan Chiang\nCSU ID: 2888469");
                    break;
                case 2:
                    System.out.print("Enter an integer: ");
                    int num = Scan.nextInt();
                    list.add(new MyInteger(num));
                    break;
                case 3:
                    System.out.print("Enter a numberator: ");
                    int numerator = Scan.nextInt();
                    System.out.println("");
                    System.out.print("Enter a denominator: ");
                    int denominator = Scan.nextInt();
                    System.out.println("");
                    list.add(new Fraction(numerator, denominator));
                    break;
                case 4:
                    System.out.print("Enter a decimal: ");
                    double dec = Scan.nextDouble();
                    list.add(new MyDouble(dec));
                    break;
                case 5:
                    System.out.print("Enter a word: ");
                    String str = Scan.next();
                    list.add(new MyString(str));
                    break;
                case 6:
                    for (Custom c: list) {
                        System.out.println(c);
                    }
                    System.out.println();
                    break;
                case 7:
                    for (Custom c: list) {
                        if (c instanceof Fraction) {
                            System.out.println(c);
                        }
                    }
                case 8:
                    for (Custom c: list) {
                        if (c instanceof MyInteger) {
                            System.out.println(c);
                        }
                    }
                // case 9:
                // case 10:
                // case 11:
                // case 12:
                // case 13:

            }

        }

        // Scan.close();
    }

  }
  