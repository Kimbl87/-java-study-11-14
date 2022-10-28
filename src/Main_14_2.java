import java.util.Random;
import java.util.Scanner;

public class Main_14_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int min = 21; // Потенциальное минимальное число, в начале больше любого из элементов массива
        int max = -21;// Потенциальное максимальнро число, в начале меньше любого из элементов массива


        int[] arr = new int[15];
        for (int i = 0;i<15;i++){
        //Создаем массив
            arr[i] = random.nextInt(-20, 21);
            if (arr[i]>max) max = arr[i]; //Сравниваем с предыдущим элементом, если больше - переназначаем максимальное
            if (arr[i]<min) min = arr[i]; //Сравниваем с предыдущим элементом, если меньше - переназначаем минимальное
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nMax= "+max);//Вывод максимального
        System.out.println("Min="+min);//Вывод минимального
        // Сравниваем модули выводим значение, модуль которого больше
        if (Math.abs(max)>Math.abs(min)) System.out.println("Max abs="+max);
        else System.out.println("Max abs="+min);
    }

}


