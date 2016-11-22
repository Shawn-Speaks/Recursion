package nyc.c4q.shawn;

/**
 * Created by shawnspeaks on 11/21/16.
 */
public class RomanCalc {

    public int calcMe(String str) {
        int currentLetterVal = 0;
        char currentLetter = str.charAt(0);
        char nextLetter = '$';
        int nextLetterVal = 0;
        boolean keepGoing = false;

        if (str.length() != 1) {
            nextLetter = str.charAt(1);
            keepGoing = true;
        }

        currentLetterVal = charToInt(currentLetter);
        nextLetterVal = charToInt(nextLetter);

        if (keepGoing) {
            if (currentLetterVal >= nextLetterVal){
                return currentLetterVal + calcMe(str.substring(1, str.length()));
            }else
                return -currentLetterVal + calcMe(str.substring(1, str.length()));
        }
        return currentLetterVal;
    }


    public int charToInt(char c) {

        switch (c) {
            case 73: // ASCII for 'I'
                return 1;
            case 86:  //ASCII FOR 'V'
                return 5;
            case 88:  //ASCII FOR 'X'
                return 10;
        }
        return -1;
    }


}
