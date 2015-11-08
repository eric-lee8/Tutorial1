// File: TicketMachineTester
// Name: Eric Joseph Lee
// Student ID: 100249491
public class TicketMachineTester
{
	public static void main(String[] args){
		
		// Question 1
		
        // Write your test cases for part 1 below after you have fixed the problems and delete the preceding lines of code. 
		
        TicketMachine t1 = new  TicketMachine(20); // Creates a TicketMachine for 75 cents price of each ticket.
    	System.out.println("my balance :"+t1.getBalance());
        t1.printTicket();
        t1.insertMoney(200);
        System.out.println("my balance :"+t1.getBalance());
        t1.printTicket();
        t1.insertMoney(100);
        System.out.println("my balance :"+t1.getBalance());
        t1.printTicket();
        System.out.println("my balance :"+t1.getBalance());
        
        // Question 2 : implement your code below
		TicketMachine t2 = new  TicketMachine(50);
		TicketMachine t3 = new  TicketMachine(80);
		
		System.out.println(t2);
		System.out.println(t3);
		
		t2.insertMoney(100);
		t3.insertMoney(40);
		
		t2.printTicket();
		t3.printTicket();
		
		System.out.println("my balance :"+t2.getBalance());
		System.out.println("my balance :"+t3.getBalance());
        
        // Question 4 : implement test case for your code below
		
		System.out.println(t2);
		System.out.println(t3);
        
		System.out.println("Total sales: " + t2.emptyMachine() + "\nMachine Empty !!");
		System.out.println("Total sales: " + t3.emptyMachine() + "\nMachine Empty !!");
		
        
	} 
}	

/* Answer Question 3:

public TicketMachine( int cost) { 
    int price = cost;             //here price is a local variable which is overloading the instance variable
    balance = 0; 
    total = 0;
}







*/