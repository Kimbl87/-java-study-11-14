import java.util.Scanner;

public class Main_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String m = sc.next();
        Integer n = sc.nextInt();
        int resultCompare;
        resultCompare = n.compareTo(Integer.valueOf(m));
        if (resultCompare>0) {
            System.out.println(n);
            System.out.println(Double.valueOf(m));
        }
        else {
            System.out.println(m);
            System.out.println(Double.valueOf(n));
        }



    }
}


