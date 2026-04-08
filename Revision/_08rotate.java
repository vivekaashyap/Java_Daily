public class _08rotate{
    public static void main(String[] args){
        int arr[][]= {
        {1,2,3},
        {4,5,6},
        {4,5,6}};
        for(int i =0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0; i<arr.length; i++){
            int left = 0, right = arr.length-1;
            while(left<right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;right--;
            }
        }
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]);
            }System.out.println();
        }

    }
}