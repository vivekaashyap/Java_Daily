
public class _100Practise {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 3, 4, 5, 6};
        int count = 0, candidate = 0;
        for (int i = 0; i < num.length; i++) {
            if (count == 0) {
                candidate = num[i];
            }
            if (num[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(candidate);
    }
}
