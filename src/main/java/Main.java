import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(bf.readLine());
//        int b = Integer.parseInt(bf.readLine());
//        int c = Integer.parseInt(bf.readLine());
//        System.out.printf("Min = " + minFromThreeNumsVerTwo(a, b, c));

//        String s = bf.readLine();
//        System.out.println("Abbreviation = " + abbreviationForSrtringsVerTwo(s));
    }

    // first task
    public int minFromThreeNums(int a, int b, int c) {
        int minValue = a;

        if ((minValue < b) && (minValue < c)) {
            System.out.println("min number = " + minValue);
            return minValue;
        } else if ((b < minValue) && (b < c)) {
            System.out.println("min number = " + b);
            return b;
        } else if ((c < minValue) && (c < b)) {
            System.out.println("min number = " + c);
            return c;
        }
        return minValue;
    }

    public int minFromThreeNumsVerTwo(int a, int b, int c) {
        int[] mas = new int[]{a, b, c};
        int minValue = mas[0];

        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i + 1] < minValue)
                minValue = mas[i + 1];
        }
        return minValue;
    }

    // second task
    public String abbreviationForSrtrings(String s) {
        String[] splittedStrings = s.split(" ");
        String finishString = "";
        for (int i = 0; i < splittedStrings.length; i++) {
            finishString += splittedStrings[i].charAt(0);
        }
        return finishString.toUpperCase();
    }

    public String abbreviationForSrtringsVerTwo(String s) {
        return Arrays.stream(s.split(" "))
                .map(i -> i.charAt(0))
                .map(String::valueOf)
                .map(String::toUpperCase)
                .collect(Collectors.joining());
    }
}
