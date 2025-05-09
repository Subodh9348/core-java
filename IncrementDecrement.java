class IncrementDecrement  
{
	public static void main(String[] args) 
	{
		int[] a={5,10,15};
		int i=0,num;
		num=a[++i]+ ++i + (++i);
		System.out.println("i:"+i);
		System.out.println("num:"+num);
		
		i=num=0;
		num=a[i++]+ i++ + (i++);
		System.out.println("i:"+i);
		System.out.println("num:"+num);
		
		int p=001,q=010,r=100;
		int s=--p + q++ - r-- - --r + ++q - --p + q-- - --p;
		System.out.println("p:"+p);
		System.out.println("q:"+q);
		System.out.println("r:"+r);
		System.out.println("s:"+s);
		
		char ch="123".charAt(1);
		System.out.println(ch++ + ++ch);
	}
}
