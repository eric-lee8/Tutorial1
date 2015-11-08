
// File: TicketMachine
// Name: Eric Joseph Lee
// Student ID: 100249491

/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 * hello
 * @author David J. Barnes and Michael Kolling
 * @version 2011.07.31
 */
public class TicketMachine
{
	
	private int price;  // The price of a ticket from this machine.
	private int balance; // The amount of money entered by a customer so far.
	private int total; // The total amount of money collected by this machine.

	/**
 	* Create a machine that issues tickets of the given price.
 	* Note that the price must be greater than zero, and there
 	* are no checks to ensure this.
 	*/
	public TicketMachine(int cost)
	{
		price = cost;
		balance = 0;
		total = 0;
	}

	/**
 	* Return the price of a ticket.
 	*/
	public int getPrice()
	{
		return price;
	}

	/**
 	* Return the amount of money left for the next ticket.
 	*/
	public int getBalance()
	{
		return balance;
	}

	/**
 	* Receive an amount of money from a customer.
 	*/
	public void insertMoney(int amount)
	{
		balance = balance + amount;
	}

	/**
 	* Print a ticket.
 	* Update the total collected and
 	* reduce the balance to zero.
 	*/
	public void printTicket()
	{
		if(balance < price)
			System.out.println("Not enough balance ! Please insent more money.");
		else{
			// Simulate the printing of a ticket.
			System.out.println("##################");
			System.out.println("# The BlueJ Line");
			System.out.println("# Ticket");
			System.out.println("# " + price + " cents.");
			System.out.println("##################");
			System.out.println();
			
	
			// Update the total collected with the balance.
			total = total + price;
			
			balance = balance - price;
		}
	}
	
	public String toString()
	{
		return "[ Price: " + price + ", Balance: " + balance + ", Total: " + total + "]";
	}
    
    /**
            Question 4: emptyMachine
        */
	
	public int emptyMachine()
	{
		int TOTAL = total;
		total = 0;
		balance = 0;
		return TOTAL;
	}
}