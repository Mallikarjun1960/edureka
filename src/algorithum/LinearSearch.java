package algorithum;

public class LinearSearch {

	
	
	public static void main(String args[]) {
		int[]arr= {10,20,30,40};
		int lnth=arr.length;
		int key=20;
		int return1=search(arr,lnth,key);
		if(return1==-1) {
			System.out.println("not found");
		}else {
			System.out.println("key"+key+"at index   "
					+ "" +return1);
		}
		
		
		
	}
	public static int search(int arr[],int lnth,int key) {
		for(int i=0;i<lnth;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
		
	}

	}


