import java.io.*;
import java.util.*;
class vow
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
       String a[]={"a","e","i","o","u"};
        String b=sc.next();
        int count=0;
        for(int i=0;i<a.length;i++)
        {
         
         if(a[i].equals(b))
        {
            count++;
            
        }
     
        } 
        if(count>0)
        {
            System.out.println("vowel");
            
        }
        else
        {
            System.out.println("consonent");
         }
      
        
    }
}
