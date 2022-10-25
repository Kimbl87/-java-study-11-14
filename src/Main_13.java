import java.util.Locale;
import java.util.Scanner;

public class Main_13 {
    public static void main(String[] args) {
        System.out.println("!!");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char aLow = '\u0061';
        char zLow = '\u007A';
//Разбили строку на массив слов
        String[] textArr = text.split(" ");

//Внешний  for разбирает массив на слова
        int j = 0; //счетчик латинских слов
        for (int i = 0; i< textArr.length;i++){
            //Второй for разбирает слово на буквы
            String word = textArr[i].toLowerCase(Locale.ROOT);
            char[] wordArr =word.toCharArray();
            boolean wordLat = true;
            for (int k=0; k < wordArr.length;k++){
                //Условие проверяет есть ли в слове буква отличная от латинской и ставит флаг false если есть хоть одно отлдичие
                if  (wordArr[k]<aLow|wordArr[k]>zLow) wordLat = false;
            }
            //Если флаг true - печатаем слово и увеличиваем счетчик напечатанных слов
            if (wordLat){
                System.out.println(textArr[i]);
                j++;

            }

        }
        System.out.println(j);
    }
}


