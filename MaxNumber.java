
import java.util.*;
class MaxNumber {
    static int maxnumber(int[] a){
        int n=a.length;
        int res=a[0];
        for(int i=0;i<n;i++){
            res=Math.max(res,a[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a={9,3,2,5,56,8};
        System.out.print(maxnumber(a));
        
    }
}

// Output:
// 56
