package nyc.c4q.shawn;

/**
 * Created by shawnspeaks on 11/21/16.
 */
public class Factorial {

    public int factorialCalculator(int input){
        if(input == 0 || input == 1) {
            return 1;
        }
        return input * factorialCalculator(input-1);
    }

}
