import java.util.*;

public  class GuessNumber{
	public static void main(String args[]){
		int r = (int)(Math.random()*100+1);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive number 1 to 100");
		int n = sc.nextInt();
		int c=1;
		
		while(n!= r){
			c++;
			if(n<r){
				System.out.println(n+" is samller than actual number");
			}
			else{
				System.out.println(n+" is greater than actual number");
			}
			System.out.println("Enter number once again");
			n=sc.nextInt();
		}
		if(c==1){
			System.out.println("******\nCongratulations you guessed in first time!!");
		}
		else if(c==2){
			System.out.println("***\nCongratulations you guessed in second chance");
		}
		else if(c==3){
			System.out.println("*\n Congratulations you guessed in third chance");
		}
		else{
			System.out.println("You win!!");
		}
	}
}