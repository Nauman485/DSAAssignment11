package geekster;

public class Merge_two_list {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,0,0,0};
		int[] arr2 = {2,4,5};
		int m =3 ,n=3,index=arr1.length-1;
		int p1=m-1, p2=n-1;
		while(p2>=0) {
			if(arr2[p2]>arr1[p1]) {
				arr1[index]=arr2[p2];
				p2--;
				index--;
			}else {
				arr1[index]=arr1[p1];
				index--;
				p1--;
			}
		}
		for(int i=0;i<arr1.length;i++) {
		   System.out.print(arr1[i]+" ");
		}
    }

}
