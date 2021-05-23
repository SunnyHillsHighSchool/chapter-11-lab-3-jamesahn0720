//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TenToAny
{
   private int base10;
   private int newBase;

 public void setBN(int base10, int newBase) {
        base10 = b10;
        newBase = any;
    }

   public void setNumber(int n)
  {
    base10 = n;
  }
  public void setBase(int b)
  {
    newBase = b;
  }

	public String getNewNum()
	{
	int num = base10;
		String newNum="";
    while(num>0)
    {
      if(num%newBase >=10)
      {
        int a = num%newBase;
        char c=Character.forDigit(a,newBase);    
        newNum = Character.toUpperCase(c)+ newNum;
      }else{
        newNum = num%newBase+newNum;
      }
      num = num/newBase;
    }
		return newNum;
	}

  public String toString() {
        return ""+base10 + " base 10 is "+getNewNum()+" in base "+newBase;
    }
	
}
