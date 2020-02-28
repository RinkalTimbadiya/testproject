package proje;

import java.util.HashMap;
import java.util.Map;

public class rundd{ 
	Map<Integer,Integer> tweets =  new HashMap<>();
    void eat(int a , int b){
    	tweets.put(a,b);
    	tweets.put(10,11);
    	System.out.println(tweets);
    }
   
    public static void main(String args[]){  
		int j = 5;
		rundd d=new rundd(); 
		 for(int i=1;i<10;i++) {
				d.eat(i, j); 
				j++;
		 }
    	}
    
}
