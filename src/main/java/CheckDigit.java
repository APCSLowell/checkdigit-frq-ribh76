public class CheckDigit 
{   
  /** Returns the check digit for num, as described in part (a).  
   *  Precondition: The number of digits in num is between one and    
   *  six, inclusive.  
   *          num >= 0  
   */  
   public static int getCheck(int num) 
   {  
     /* to be implemented in part (a) */
     int sum  = 0;
     for (int i = 0; i==getNumberOfDigits(num); i++){
       sum  = getDigit(num,i) * (8-i) ; 
     }
     return sum % 10; 
   }
 
  /** Returns true if numWithCheckDigit is valid, or false    
   *  otherwise, as described in part (b). 
   *  Precondition: The number of digits in numWithCheckDigit   
   *  is between two and seven, inclusive.
   *                numWithCheckDigit >= 0     
   */     
   public static boolean isValid(int numWithCheckDigit)    
   {      
     /* to be implemented in part (b) */    
     int num = numWithCheckDigit; 
     int checkDigit = numWithCheckDigit % 10; 
     return getCheck(num) == checkDigit; 
   }    
   
   /** Returns the number of digits in num. */    
   public static int getNumberOfDigits(int num)    
   {      
    if(num < 10)
      return 1;
    return 1 + getNumberOfDigits(num/10);    
   }    
   
   /** Returns the nthdigit of num.      
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
