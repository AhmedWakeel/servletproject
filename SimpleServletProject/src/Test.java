import java.util.ArrayList;
import java.util.TreeSet;

public class Test {

	public void m1(Integer... integers)
	{
 int length = integers.length;
		System.out.println("int");
	}
	public void m1(Integer s)
	{
		System.out.println("int1");
	}
	public static void m2(int i)
	{
		System.out.println(i);
	}
	public static void main(String...arg)
	{
		for(int k = 1 ; k<=10;k++)
		{
			m2(k);
		}
		
		Test test = new Test();
		test.m1(1);
		test.m1();
		test.m1(2,4,5);
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(3);
		
		
		System.out.println(list);
		
		TreeSet set = new TreeSet();
		set.add(10);
		set.add(10);
		set.add(2);
		set.add(1);
		
		System.out.println(set);
		
//		String s = new Object();
		
//		String s = new StringBuffer("");
		
	}
}
class Employee
{
	
}