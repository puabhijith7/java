package sort;

public class linearint {

	public static void main(String[] args) {
		int a[]= {2,3,1,7,4};
		int b=1,c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				System.out.println("Index pos - "+i);
				c++;
				break;
			}
		}
		if(c==0)
		{
			System.out.println("Not found");
		}
	}

}
