package MyPackage;

import java.util.*;


class test {
    
   private static  Scanner sc = new Scanner(System.in);
   private static LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
   public static void main(String args[] ) throws Exception {
     int T= Integer.parseInt(sc.nextLine());
        for(int i=0;i<T;i++)
        {
            travelBetweenCities();
        }
     }
    public static void travelBetweenCities()
    {
        String[] NKQ=sc.nextLine().split(" ");
        int N=Integer.parseInt(NKQ[0]);
        int K=Integer.parseInt(NKQ[1]);
        int Q=Integer.parseInt(NKQ[2]);
        String[] C=sc.nextLine().split(" ");
        FetchResultsFromQuery(N,K,Q,C);
    }
    public static void FetchResultsFromQuery(int N,int K,int Q,String[] C)
    {
        for(int j=0;j<Q;j++)
        {            
            String[] LRX=sc.nextLine().split(" ");
            int L=Integer.parseInt(LRX[0]);
            int R=Integer.parseInt(LRX[1]);
            int X=Integer.parseInt(LRX[2]);
             calculateResults(L,R,X,C,K);
        }
    }
    
    public static void calculateResults(int L,int R,int X,String[] C,int K)
       {
            
            int CurrentCity=Integer.parseInt(C[X-1]);
            for(int p=L-1;p<R;p++ )
            {
                
                hm.put(Integer.parseInt(C[p]),"NotVisited");
            }
            int lcount=0;
          finalResults(CurrentCity,K);
          for(Map.Entry<Integer,String> m1:hm.entrySet())
          {
          if(m1.getValue()=="visited")
          {
        	  lcount=lcount+1;
          }
          }
          System.out.println(lcount);
       }
       public static void finalResults(int CurrentCity,int K)
       {
           
           for(Map.Entry<Integer,String> m:hm.entrySet())
           {
            if((Math.abs(CurrentCity-m.getKey())<=K) && m.getValue()=="NotVisited")
            {
                m.setValue("visited");
                finalResults(m.getKey(),K);
            }
           
           }
           
       }
           
     
            

/*1
5 2 2
4 3 1 9 6
1 3 5 
1 5 2*/
     
    
}
