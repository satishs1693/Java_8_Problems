package Algos;

public class Application_BinrySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 0, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1, 1, 1, 1};
		System.out.println(posOfFirstOne_m2(arr));		
     }
	private static int posOfFirstOne_m2(int[] arr) {
		int l =0;
		int h =1;
		while (arr[h] == 0) {
			l =h;
			h= 3*h;
			if(h>arr.length) {
				h = h/2;
				System.out.println(h);
				return indexOfFirstOne(arr, h, arr.length-1);
			}
		}
		return indexOfFirstOne(arr, l, h);
	} 
	private static int indexOfFirstOne(int[] arr, int l, int h) {
		int mid=0;
		System.out.println(">>>>>>>>>>>>>>>>"+l+">>>>>>>>>>>>"+h);
		while ( l <= h) {
			mid = (l+h)/2;
			if(arr[mid] == 1 && arr[mid]==0 || arr[mid-1]==0) {
				System.out.println(">>>>>>>>>>>>>>>>>>>>"+mid);
				return mid;
			}else if( arr[mid]==0) {
				l=mid+1;
			}else if (arr[mid]==1) {
				h=mid-1;
			}
		}
		return mid;
	}
	private static void posOfFirstOne(int[] arr) {
		// TODO Auto-generated method stub
		int l_index= 0;
		int r_index=arr.length-1;
		int mid =0;
		while( l_index <= r_index) {
			mid = (l_index+r_index)/2;
			if(arr[mid] == 1 && arr[mid-1]==0) {
				System.out.println(">>>>>>>>>>>"+mid);
				break;
			}else if(arr[mid]==0 && arr[mid+1]==1){
				System.out.println("..........."+(mid+1));
				break;
			}else if(arr[mid]==1 ) {
				//System.out.println("********"+mid);
				r_index = mid-1;
			}else if(arr[mid]==0) {
				//System.out.println(">>>>>>>>>>>>>"+mid);
				l_index =mid+1;
			}
	}
	}
}
