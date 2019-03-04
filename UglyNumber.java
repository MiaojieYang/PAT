public class UglyNumber{
	public static int nthUglyNumber(int n){
		int[] u = new int[n];
		u[0] = 1;
		int u2 = 0;int u3 = 0;int u5 = 0;
		for(int i=1;i<n;i++){
			u[i] = min(min(u[u2]*2,u[u3]*3),u[u5]*5);
			if((u[i]/u[u2]) == 2) u2++;
			if((u[i]/u[u3]) == 3) u3++;
			if((u[i]/u[u5]) == 5) u5++;
		}
		return u[n-1];
		
	}
	public static int min(int a,int b){
		return a>b?b:a;
	}
	public static void main(String[] args){
		System.out.println(nthUglyNumber(9));
	}
	
}



