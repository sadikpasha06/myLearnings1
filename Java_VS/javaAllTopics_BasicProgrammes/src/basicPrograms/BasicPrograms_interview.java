package basicPrograms;

public class BasicPrograms_interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=10, n2=20;
		
            n1=n1+n2;
            n2=n1-n2;
            n1=n1-n2;
           System.out.println(n1 +"        "+n2);
         
           // for non-Numeric
           String    s1="string1", s2="string2",temp;
              
              
              temp=s1;
              s1=s2;
              s2=temp;
              System.out.println(s1 +"        "+s2);
            
	// NUMERIC PALINDROM	
              
              int num1=12321;
              int   temp1=0;
            
              while(num1!=0) {
            	  
            	  int rem=num1%10;
            	  
            	    temp1=temp1*10+rem;
            	  num1=num1/10;
              }
              System.out.println(temp1);

              
          	// STRING PALINDROM	
            
           String s="madammmm" ,temstr="";
            int l=s.length()-1;
            
            while(l>=0) {
            	
            	temstr=temstr+s.charAt(l);
            	l--;
            	
            }

            System.out.println(temstr);

           
   // Prime Number         
            


            
              
	}

}
/* 
    -- THE list of programs 
    
     1) Swiping variables  
     2) string / number palindroms
     3)prime / strong / armstrong numbers 
     4)Array sorting
     5)searching 
     6)leap year
     7)Toggle case 
     8)
     9)2d arrays 
    10)
   

 


*/