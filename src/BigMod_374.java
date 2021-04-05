import java.util.Scanner;

public class BigMod_374 {

    static int aModM(String s, int mod)
    {
        int number = 0;
        for (int i = 0; i < s.length(); i++)
        {
            number = (number * 10 );
            int x = Character.getNumericValue(s.charAt(i));
            number = number + x;
            number %= mod;
        }
        return number;
    }

    static int ApowBmodM(String a, int b, int m)
    {
        int ans = aModM(a, m);
        int mul = ans;

        for (int i = 1; i < b; i++)
            ans = (ans * mul) % m;

        return ans;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            String a = sc.next();
            int b = sc.nextInt();
            int m = sc.nextInt();

            System.out.println(ApowBmodM(a, b, m));
        }


    }
}
