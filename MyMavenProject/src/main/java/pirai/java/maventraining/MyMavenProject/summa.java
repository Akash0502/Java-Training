import java.util.Scanner;
import java.util.Stack;
public class summa 
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter brackets");
    	String s=sc.next();
    	char c[]=new char[s.length()];
    	Stack stk=new Stack();
    	for(int i=0;i<s.length();i++)
    	{
    		c[i]=s.charAt(i);
    		stk.push(c[i]);
    	}
    	int count=0;
    	for(int j=0;j<stk.size();j++)
    	{ 
    		if(stk.get(j).equals('(' ) || stk.get(j).equals('[' ) || stk.get(j).equals('{' ))
    			count++;
    		if(stk.get(j).equals(')' ) || stk.get(j).equals(']' ) || stk.get(j).equals('}' ))
    			count--;
    	}		
    	if(count==0)
    		System.out.println("True");
    	else
    		System.out.println("False");
    }
}
