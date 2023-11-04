import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int t = stdIn.nextInt();

        for (int i = 0; i < t; i++){
            ArrayList<Integer> square = new ArrayList<>(4);
            ArrayList<Integer> dot = new ArrayList<>(2);
            int cnt1 = 4;
            while (cnt1 != 0){
                int element = stdIn.nextInt();
                square.add(element);
                cnt1--;
            }
            int cnt2 = 2;
            while (cnt2 != 0){
                int element = stdIn.nextInt();
                dot.add(element);
                cnt2--;
            }

            if (dot.get(0) < square.get(0)){
                if (dot.get(1) < square.get(1)){
                    double result1 = Math.pow(square.get(0)-dot.get(0), 2) + Math.pow(square.get(1)-dot.get(1), 2);
                    int result2 = square.get(0)-dot.get(0) + square.get(1)-dot.get(1);
                    System.out.println((int) result1 + " " + result2);
                } else if (square.get(1) <= dot.get(1) && dot.get(1) <= square.get(3)) {
                    double result1 = Math.pow(square.get(0)-dot.get(0), 2);
                    int result2 = square.get(0) - dot.get(0);
                    System.out.println((int) result1 + " " + result2);
                } else {
                    double result1 = Math.pow(square.get(0)-dot.get(0), 2) + Math.pow(dot.get(1) - square.get(3), 2);
                    int result2 = square.get(0)-dot.get(0) + dot.get(1) - square.get(3);
                    System.out.println((int) result1 + " " + result2);
                }
            } else if (square.get(0) <= dot.get(0) && dot.get(0) <= square.get(2)) {
                if (dot.get(1) < square.get(1)){
                    double result1 = Math.pow(square.get(1)-dot.get(1), 2);
                    int result2 = square.get(1)-dot.get(1);
                    System.out.println((int) result1 + " " + result2);
                } else if (square.get(1) <= dot.get(1) && dot.get(1) <= square.get(3)) {
                    System.out.println(0 + " " + 0);
                } else {
                    double result1 = Math.pow(dot.get(1) - square.get(3), 2);
                    int result2 = dot.get(1) - square.get(3);
                    System.out.println((int) result1 + " " + result2);
                }
            } else {
                if (dot.get(1) < square.get(1)){
                    double result1 = Math.pow(square.get(2)-dot.get(0), 2) + Math.pow(square.get(1)-dot.get(1), 2);
                    int result2 = -square.get(2)+dot.get(0) + square.get(1)-dot.get(1);
                    System.out.println((int) result1 + " " + result2);
                } else if (square.get(1) <= dot.get(1) && dot.get(1) <= square.get(3)) {
                    double result1 = Math.pow(square.get(2)-dot.get(0), 2);
                    int result2 = -square.get(2) + dot.get(0);
                    System.out.println((int) result1 + " " + result2);
                } else {
                    double result1 = Math.pow(square.get(2)-dot.get(0), 2) + Math.pow(dot.get(1) - square.get(3), 2);
                    int result2 = -square.get(2)+dot.get(0) + dot.get(1) - square.get(3);
                    System.out.println((int) result1 + " " + result2);
                }
            }
        }
    }
}
