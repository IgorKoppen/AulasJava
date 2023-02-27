package aula2;

import java.util.Random;

public class RandomInteger {

	public static void main(String[] args) {
		
		Random randomNumber = new Random();
        int face;
        
        for(int i = 1; i <= 20; i++){
        	
        	face = 1 + randomNumber.nextInt(6);
        	System.out.printf("%d ", face);
        	
        	if(i % 5 ==0)
        		System.out.println();
        	
        	
        }
		
	}

}
