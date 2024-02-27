class Array3{
	boolean isSorted(int arr[]){
		int n=arr.length;
		for(int i=1;i<n;i++){
			if(arr[i]>=arr[i-1]){}
			else return false;
		}
		return true;
	}
}
class Run{
	public static void main(String[] args){
		Array3 a=new Array3();
		int arr[]={9,5,47,8,2,3,99,49};
		int arr1[]={9,15,47,80,200,300,990,4009};
		System.out.println(a.isSorted(arr));
		System.out.println(a.isSorted(arr1));
	}
}