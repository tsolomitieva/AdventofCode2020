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
	     System.out.print(answer);
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
	    	 
}
     
      

	

