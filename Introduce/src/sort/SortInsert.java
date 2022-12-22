package sort;

public class SortInsert {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int count = 0;
        for(int i = 1;i< array.length;i++){
            int currentInsert = array[i];
            if(currentInsert<array[i-1]){
                for(int j = 1;j<=i;j++){
                    count++;
                    if(currentInsert<array[i-j]){
                        array[i-j+1] = array[i-j];
                        if(i==j){
                            array[i-j] = currentInsert;
                            break;
                        }
                    }else{
                        array[i-j+1] = currentInsert;
                        break;
                    }
                }
            }
        }
        for(int i = 0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(count);
    }
}
