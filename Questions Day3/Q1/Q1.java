import java.io.*; 
import java.util.*; 
  
class FloatList { 
    public static void main(String[] args) 
    { 
        int n = 5; 
  
        List<Float> arrli 
            = new ArrayList<Integer>(n); 
        
        float val=0.5;

        for (int i = 1; i <= n; i++) {
            
            val+=i;

            arrli.add(val);         
        }

        ListIterator<String> litr = null;

        System.out.println("sum of list is: ");
        float sum=0;
    while(litr.hasNext()){

       sum+=(float)litr.next();
    }

    System.out.println(sum);

    }   
}