public class _07Seacrch{
    public static void main(String[] args){
        int arr[][]= {{1,2,3},{4,5,6}};
        int row = 0, col = arr[0].length-1;
        int tar = 38;
        boolean b = false;
        while(row<arr.length && col >=0){
            if(arr[row][col] == tar) {b = true;break;}
            else if (arr[row][col]>tar) col--;
            else row++;
        }
        System.out.println(b);
    }
}