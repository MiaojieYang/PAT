
public class kthLargest {
	public static void main(String[] args){
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println(kthLargestElement(arr,4));
		
	}
	public static int kthLargestElement(int[] num,int n){
		int length = num.length;
		if(n <= 0||n > length)
			return 0;
		else return search(num,0,length-1,n);
		
	}
	public static int partition(int[] array,int left,int right){
		int i = left;
		int j = right;
		int k = array[left];
		while(i<j){
			while(k>array[j]&&i<j){
				j--;
			}
			if(i<j){
				array[i] = array[j];
				i++;
			}
			while(k<array[i]&&i<j){
				i++;
			}
			if(i<j){
				array[j] = array[i];
				j--;
			}
		}
		array[i] = k;
		return i;
	}
	public static int search(int[] num,int l,int r,int k){
		int m = partition(num,l,r);
		if(m == k-1) return num[m];
		else if (m > k-1) return search(num,l,m-1,k);
		else return search(num,m+1,r,k);
	}

}
