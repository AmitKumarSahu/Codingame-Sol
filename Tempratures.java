import java.util.*;
import java.math.*;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        if (in.hasNextLine()) {
            in.nextLine();
        }
        
        String temps = in.nextLine(); 
        if(temps.length()==0){
            System.out.print(0);
            return;
            }
            
        String p[]=temps.split("\\s");
        String s = "false";
        int m = Integer.parseInt(p[0]);// the n temperatures expressed as integers ranging from -273 to 5526
        for(int i=0;i<p.length;i++){
                int X = Integer.parseInt(p[i]);
                int Y = Math.abs(X);
                if(Y<=Math.abs(m)){
                        m=Y;
                    }
                    if(X<0){
                        s="true";    
                        }
                        else{s="false";}
                
                
            }
            
if(s=="true")System.out.print("-"+m);
else System.out.print(m);
    }
    
}
