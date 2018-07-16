import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int N = sc.nextInt();
		int position = 0;
		String temp = "";
		for(int i=0;i<input.length();i++)
		{
		    if(isVowel(input.charAt(i)))
		    {
		       for(int j=i;j>=position;j--)
		       {
		           temp += input.charAt(j);
		       }
		       if(temp.length()>=N)
		       {
		           System.out.println(new StringBuffer(temp).reverse().toString()+" ");
		           position = i+1;
		       }
		       temp = "";
		    }
		}
	}
	
	public static boolean isVowel(char temp)
	{
	    return (temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u');
	}
}
