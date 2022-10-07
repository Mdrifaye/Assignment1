package JavaCloseLabBook;

import java.util.Scanner;

public class FindLocationOfArray {

	public static void main(String[] args) {
        int arr[]={3,4,2,5,6};
        System.out.println("Enter the element to search for");
        Scanner scan=new Scanner(System.in);
        int search=scan.nextInt();
        scan.close();
        boolean check=true;
        for(int i=0;i<5;i++){
            if(search==arr[i]){
                System.out.println("The searched number is located in "+i);
                check=false;
            }
        }
        if(check){
            System.out.println("The searched number is not located in this array");
        }

	}

}
