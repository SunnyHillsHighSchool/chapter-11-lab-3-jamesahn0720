//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TenToAny
{
   private int base10;
   private int newBase;

 public void setBN(int base10, int newBase) {
        this.base10 = base10;
        this.newBase = newBase;
    }

    private String answer;

	public String getNewNum()
	{
	int number = base10;
        answer = "";
        while (number != 0) {
            int val = number % newBase;
            if (val < 10) {
                answer = val + answer;
            } else if (val == 10) {
                answer = "A" + answer;
            } else if (val == 11) {
                answer = "B" + answer;
            } else if (val == 12) {
                answer = "C" + answer;
            } else if (val == 13) {
                answer = "D" + answer;
            } else if (val == 14) {
                answer = "E" + answer;
            } else if (val == 15) {
                answer = "F" + answer;
            }
            number = number / newBase;
        }
        return answer;
	}

  public String toString() {
        return base10 + " base 10 is " + answer + " in base " + newBase;
    }
	
}
