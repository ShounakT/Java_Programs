public class SelectionSort {
    public static void main(String[] args)
    {
        int[] a = {-3,5,1,7,2};
        int n = a.length;
        for(int i=0; i< n-1;i++)
        {
            int minIndex = i;
            for(int j=i;j<n;j++)
            {
                if(a[j] < a[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        for(int i : a)
        {
            System.out.print(i+" ");
        }
    }
}
