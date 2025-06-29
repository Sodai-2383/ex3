import java.util.Random;
import java.util.Scanner;
    
public class dice{

    public static void main(String[] args){
	new dice();
    }

    dice(){
	int a,b;
	Random random = new Random();

	String name;
	
	name = Greeting();
		

	a=b=0;
	
	System.out.println("Rolling dice...");

	while(a==0){
	    a = random.nextInt(7);
	}

	while(b==0){
	    b = random.nextInt(7);
	}

	System.out.println("Die 1: " + a);
	System.out.println("Die 2: " + b);

	System.out.println("Total value: " + (a+b));
	if((a+b)>7) System.out.println(name + " won!");
	else System.out.println(name + " lost!");
	System.out.println();
    }
    
    String Greeting(){
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");

        name = sc.next();

        System.out.println("Hello, " + name + "!");

	
	return name;
	
    }

}
