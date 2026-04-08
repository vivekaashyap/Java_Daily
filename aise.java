public class aise{
    public static void main(String [] args){
        int arr[] = {4,3,2,1,5,6,7,8};
        int l = 0, r = arr.length-1;
        int t = 7;
        boolean retrun = false;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid] == t) {retrun = true; break;};
            if(arr[l]<arr[mid]){
                if(arr[l]<=t && t<=arr[mid]){
                    r = mid-1;
                }
                else{
                    l = mid + 1;
                }
            }
            else{
                if(arr[mid]<= t && t<=arr[r]){
                    l = mid-1;
                }
                else r = mid -1;
            }
        }
        System.out.println(retrun);
    }
}