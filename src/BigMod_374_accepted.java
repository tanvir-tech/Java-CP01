import java.util.*;
import java.math.*;

public class BigMod_374_accepted {
        public static void main(String[] args)
        {
            Scanner input=new Scanner(System.in);
            while(input.hasNext())
            {
                BigInteger B,P,M;
                B=input.nextBigInteger();
                P=input.nextBigInteger();
                M=input.nextBigInteger();
                BigInteger ans=B.modPow(P, M);
                System.out.println(ans);
            }




        }

    }

