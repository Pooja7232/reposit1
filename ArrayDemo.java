/*class ArrayDemo
{
	public static void main(String[] args)
	{
		int a[]={1,9,4,3,8,6};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
		//Arrays.sort(a);
		System.out.println(a[i]);
		}
	}
}*/
import java.util.Arrays;

class ArrayDemo {
    public static void main(String[] args) {
        int a[] = {1, 9, 4, 3, 8, 6};
        Arrays.sort(a);  // Sort the array once
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);  // Print each element
        }
    }
}
