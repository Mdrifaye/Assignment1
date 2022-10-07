package JavaCloseLabBook;

public class AscendingOrDescendingOrder {

	public static void main(String[] args) {
        int arrtoascending[]={7,9,2,5,4};
        int arrtodescending[]={7,9,2,0,8};
        int temp=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(arrtoascending[i]<arrtoascending[j]){
                    temp=arrtoascending[i];
                    arrtoascending[i]=arrtoascending[j];
                    arrtoascending[j]=temp;
                }
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(arrtodescending[i]>arrtodescending[j]){
                    temp=arrtodescending[i];
                    arrtodescending[i]=arrtodescending[j];
                    arrtodescending[j]=temp;
                }
            }
        }
        System.out.println("The ascending sorted array is ");
        for(int i=0;i<arrtoascending.length;i++){
            System.out.print(arrtoascending[i]+" ");
        }
        System.out.println("\nThe descending sorted array is ");
        for(int i=0;i<arrtodescending.length;i++){
            System.out.print(arrtodescending[i]+" ");
        }

	}

}
