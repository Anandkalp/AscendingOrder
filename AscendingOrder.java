public class AscendingOrder
{
	public static void Ascending(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		}
		public static void main(String args[])
		{
		int[] arr={8, 11, 25, 15, 23, 14, 13, 22, 19};
		Ascending(arr);
	}
}
