

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		System.out.println("Not the right string, tests will fail!");
	}
	
public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
boolean isFound;
int count;

public void setup()  
{            
  isFound = false;
  count = 2;
  while (isFound == false)
  {
    String digits = e.substring(count, count+10);
    double dNum = Double.parseDouble(digits);
    if (isPrime(dNum)==true)
    {
      isFound = true;
      System.out.println(dNum);
    }
    count++;
  }
}  

public boolean isPrime(double num)  
{   
  if (num<=1)
  {
    return false;
  }
  for (int i = 2; i<=Math.sqrt(num); i++)
  {
    if (num%i==0)
    {
      return false;
    }
  }
  return true;
} 
