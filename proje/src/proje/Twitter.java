package proje;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Twitter {
	
	
	Map<Integer,Integer> tweets =  new HashMap<>();
    void eat(int a , int b){
    	tweets.put(a,b);
    	tweets.put(10,11);
    	System.out.println(tweets);
    }
   
    public void postMessage(int userId, int tweetId) {
    	tweets.put(tweetId,userId);
    	System.out.println(tweets);
    }
    public static void main(String args[]){  
    	 MyApp obj = new MyApp();
		 for(int i=0;i<10;i++) {
			 int userId = 0;
			 int tweetId = 0;
			 int followerId = 0;
			 int followeeId = 0;
    	    		 System.out.println(" Enter 1 to posts a new message");
    	    		 System.out.println(" Enter 2 to news feed");
    	    		 System.out.println(" Enter 3 to follows user");
    	    		 System.out.println(" Enter 4 to unfollows user");
    	    		 System.out.println("<-------Select Your Option-------->");
    	    		 Scanner sc = new Scanner(System.in);
    	    		 String  Option = sc.nextLine();
    	    		 
    	    		 if(Option.equals("1")) {
    	    			 System.out.println("<------Post a new massage------>");
    	    			 
    	    			  
    	    			   try {
    	    				   System.out.println("Enter user ID :");
    	    				   userId = sc.nextInt();
    	    				   System.out.println("Enter Post Message Id :");
    	    				   tweetId = sc.nextInt();
    	    				} catch (Exception e) {
    	    					// TODO: handle exception
    	    					System.out.println(e);
    	    				}
    	    				
    	    				obj.postMessage(userId, tweetId);
    	    		 }
    	    		 
    	    		 else if(Option.equals("2")) {
    	    			 System.out.println("<-------News Feed----->");
    	    			 
    	    			 System.out.println("Enter User ID : ");
    	    			   try {
    	    				   userId = sc.nextInt();
    	    				} catch (Exception e) {
    	    					// TODO: handle exception
    	    					System.out.println(e);
    	    				}
    	    			 
    	    			 List<Integer> param_2 = obj.getNewsFeed(userId);
    	    			 System.out.println(param_2);
    	    			 
    	    			 
    	    		 }
    	    		 
    	    		 else if(Option.equals("3") || Option.equals("4")) {
    	    			 
		    			 if(Option.equals("3")) {
		    				 System.out.println("<-------Follow user------> ");
		    			 }else if(Option.equals("4"))
		    			 {
		    				 System.out.println("<-------Unfollow user------>");
		    			 }
		    			 
	    			   try {
	    				   System.out.println("Follower User Id :");
	    				   followerId = sc.nextInt();
	    				   System.out.println("Followee User Id :");
	    				   followeeId = sc.nextInt();
	    				} catch (Exception e) {
	    					// TODO: handle exception
	    					System.out.println(e);
	    				}
		    				
	    				 if(Option.equals("3")) {
	    					 obj.follow(followerId, followeeId);
	    				 }else if(Option.equals("4"))
	    				 {
	    					 obj.unfollow(followerId, followeeId);
	    				 }
		    				  
    	    		 }
    	    		 else
    	    		 {
    	    			System.out.println("Select Right option"); 
    	    		 }
    	    		 i=1;
    	    		 continue;
	
		 }
    	}
}
