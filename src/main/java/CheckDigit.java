public class CheckDigit 
{   
  /** Returns the check digit for num, as described in part (a).  
   *  Precondition: The number of digits in num is between one and six, inclusive.  
   *  num >= 0  
   */  
   public static int getCheck(int num) 
   {  
     int sum = 0;
     for (int i = 1; i <= getNumberOfDigits(num); i++) {
       sum += getDigit(num, i) * (8 - i); 
     }
     return sum % 10; 
   }
 
  /** Returns true if numWithCheckDigit is valid, or false otherwise, as described in part (b). */
   public static boolean isValid(int numWithCheckDigit)    
   {      
     int num = numWithCheckDigit / 10; 
     int checkDigit = numWithCheckDigit % 10; 
     return getCheck(num) == checkDigit; 
   }    
   
   /** Returns the number of digits in num. */    
   public static int getNumberOfDigits(int num)    
   {      
     if (num < 10)
       return 1;
     return 1 + getNumberOfDigits(num / 10);    
   }    
   
   /** Returns the nth digit of num.      
    *  Precondition: n >= 1 and n <= the number of digits in num     
    */    
    public static int getDigit(int num, int n)    
    {      
      int numDigits = getNumberOfDigits(num);
      for (int i = 0; i < numDigits - n; i++) {
        num /= 10;
      }
      return num % 10;
    }     
}
