
import java.util.ArrayList;
import java.util.List;
class ThreeSum {
    static ArrayList<ArrayList<Integer>> Findnums(int[] a){
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int n=a.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;j<n;j++){
                    if(a[i]+a[j]+a[k]==0){
                        ArrayList<Integer> num=new ArrayList<>(); 
                        num.add(a[i]);
                        num.add(a[j]);
                        num.add(a[k]);
                        res.add(num);
                    }
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a={1,26,-1,-2,3};
        ArrayList<ArrayList<Integer>> res=Findnums(a);
        for(List<Integer> num:res){
            System.out.println(num.get(0)+" "+num.get(1)+" "+num.get(2));
        }
        
    }
}

// Output:
// -1 -2 3