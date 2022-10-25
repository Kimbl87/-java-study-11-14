import java.util.Locale;
import java.util.Scanner;

public class Main_12 {
    public static void main(String[] args) {
        final String  J = "I like Java!!!";

//        1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        boolean javaCont = J.contains("Java");
//        2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
        boolean javaStart = J.startsWith("I like");
//        3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        boolean javaEnd = J.endsWith("!!!");
//        4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        if (javaCont && javaStart && javaEnd) System.out.println(J.toUpperCase(Locale.ROOT));
//        5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
        String jo = J.replace('a', 'o');
        System.out.println(jo.substring(7,11));
    }
}


