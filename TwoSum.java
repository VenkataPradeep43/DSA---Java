// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class TwoSum {
    static boolean twosum(int[] a,int t){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                  if(a[i]+a[j]==t){
                      return true;
                  }
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        int[] a={1,2,4,3,5,6};
        int t=9;
        System.out.println(twosum(a,t));
    }
}


// Output:
// true