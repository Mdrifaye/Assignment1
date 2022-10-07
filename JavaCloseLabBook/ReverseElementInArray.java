package JavaCloseLabBook;

public class ReverseElementInArray {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
        int[] rever=new int[5];
        int sum=0;
        for(int i=arr.length-1;i>=0;i--){
            rever[i]=arr[sum];
            sum++;
        }
        System.out.println("The reversed array is ");
        for(int i=0;i<rever.length;i++){
            System.out.print(rever[i]+" ");
        }

	}

}
