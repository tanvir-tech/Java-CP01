import java.util.Scanner;

public class Split_Polycarp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String enc = sc.next();


        String[] Digit = enc.split("0");

        String resultString ="";
        for (String d:Digit) {
            resultString = resultString + d.length();
        }
        System.out.println(Integer.parseInt(resultString));
    }
}