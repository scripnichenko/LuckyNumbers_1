
/**
 * Created by ansk0413 on 07.10.15.
 */

public class LuckyLevelsCalc
{
    public static int LuckyCount (int luckyLevel){


        int[] mas1digit = {0,1,2,3,4,5,6,7,8,9};
        int[] mas2digit = {0,1,2,3,4,5,6,7,8,9};
        int[] mas3digit = {0,1,2,3,4,5,6,7,8,9};
        int counterOfLucky = 0;


        if (luckyLevel<27){

            for(int i=0; i<mas1digit.length; i++)
            {
                for(int j=0; j<mas2digit.length; j++)
                {
                    for(int k=0; k<mas3digit.length; k++)
                    {

                        if ((mas1digit[i]+mas2digit[j]+mas3digit[k])== luckyLevel){
                            counterOfLucky++;
                        }
                    }

                }

            }

            return counterOfLucky;
        }
        else {
            System.out.println("Please, enter a correct number (< (9+9+9) =27)");
            return counterOfLucky;
        }

    }
}
