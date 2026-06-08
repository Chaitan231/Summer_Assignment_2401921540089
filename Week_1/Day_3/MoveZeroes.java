package Week_1.Day 3;

public class MoveZeroes {

    public void moveZeroes(int[] arr) {
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k++;
            }
        }
    }
}

