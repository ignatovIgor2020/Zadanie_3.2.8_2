import java.lang.reflect.Array;
import java.util.*;

// read input string from console and chek if this string
//  contain FIO and write result to console
public class StringTests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        System.out.println("Введите ваше имя!");
        while (!isCorrectName) {
            String name = scanner.nextLine(); //read string from System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println("Имя введено корректно");
                break;
            }
        }
    }
    /*
    Check sting name to availability 3 words of FIO
     */
    private static boolean checkName(String name) {
        int wordCount = 0;
        String[] stringFromName = name.split(" ");
        if (stringFromName.length >= 3) {
            for (int i = 0; i < stringFromName.length; i++) {
                //chek all strings in array, if stringLen > 2 -> this is correct string
                if (stringFromName[i].length() > 2) {
                   // calculate all correct strings
                    wordCount++;
                }
            }
            // chek to have all 3 correct string on name (FIO)
            if (wordCount == 3) {
                System.out.println(" good name");
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
