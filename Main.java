import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args)throws IOException {
	    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	    int i,j,n,t,a=0,b=0;
	    t=Integer.parseInt(br.readLine());
	    int t1=t;
	    while(t>0)
	    {
	        t=t-1;
	        n=Integer.parseInt(br.readLine());
	        String s=(br.readLine());
	        a=0;b=0;
	        for(i=0;i<n;i++)
	        {
	            if(s.charAt(i)=='A')
	            a++;
	            else
	            b++;
	        }
	        int c=a-b;
	        if((Math.abs(c))==1)
	        System.out.println("Case #"+(t1-t)+":  Y");
	        else
	        System.out.println("Case #"+(t1-t)+":  N");
	    }
	    
	}
}
