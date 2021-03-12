package adventOfCode;
import java.util.*; 
import java.io.*;

public class DayOne {

	public static void main(String[] args) throws FileNotFoundException {
		
		 Scanner sc = new Scanner(new File("inputs.txt"));
		 List<Integer> inputs = new ArrayList<Integer>();
	    
	     while (sc.hasNextLine()) {
	     inputs.add(sc.nextInt());
	     
          }
	     int answer=findAnswer(inputs);
	     int answer2=findAnswer2(inputs);
	     System.out.println(answer);
	     System.out.println(answer2);
	}
	     static int findAnswer(List<Integer> inputs) {
	    	 int num1=0;
	    	 int num2=0;
	    	 for (int i=0; i<inputs.size(); i++) {
	    		 for (int j=i+1; j<inputs.size(); j++) {
	    			 if (inputs.get(i)+inputs.get(j)==2020) {
	    				 num1=inputs.get(i);
	    				 num2=inputs.get(j);
	    				 
	    				 break;
	    			 }
	    		 }
	    	 }
	    	 return num1*num2;
			
	    		 
	    	 }
	    	 
	     static int findAnswer2(List<Integer> inputs) {
	    	 int num1=0;
	    	 int num2=0;
	    	 int num3=0;
	    	 for (int i=0; i<inputs.size(); i++) {
	    		 for (int j=i+1; j<inputs.size(); j++) {
	    			 for (int k=j+1;k<inputs.size();k++) {
	    			 if (inputs.get(i)+inputs.get(j)+inputs.get(k)==2020) {
	    				 num1=inputs.get(i);
	    				 num2=inputs.get(j);
	    				 num3=inputs.get(k);
	    				 
	    				 break;
	    			 }
	    		 }
	    	  }
	    	 }
	    	 return num1*num2*num3;
			
	    		 
	    	 }
}
