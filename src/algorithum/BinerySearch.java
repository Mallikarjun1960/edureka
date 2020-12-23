package algorithum;

public class BinerySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,30,40,50};
		int lnth=arr.length;
		int key=30;
		int index=1;
		int return1=binearySearch(arr,lnth,key,index);
		System.out.println(return1);

	}
	static int binearySearch(int arr[],int lenth,int key,int index){
		int mid=(lenth+index)/2;
		while(lenth>index) {
			if(arr[mid]==key) {
				return mid;
				
			}else if(arr[mid]<key) {
				lenth=mid+1;
				
			}else {
				index=mid-1;
				
			}if(index>lenth) {
				System.out.println("not found");
				return -1;
			}
			
		}
		return -1;
	}
}
