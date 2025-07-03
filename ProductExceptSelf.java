
import java.util.Arrays;
class ProductExceptSelf {
    static int[] product(int[] a){
        int n=a.length;
        int[] res=new int[n];
        Arrays.fill(res,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    res[i]*=a[j];
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] a={1,4,3,2,5};
        int[] res=product(a);
        for(int val : res){
            System.out.print(val + " ");
        }
    }
}

// Output:
// 120 30 40 60 24 
