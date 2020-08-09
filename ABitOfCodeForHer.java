import java.util.Scanner;

public class ABitOfCodeForHer 
{
	
	public static void main(String[] args) 
	{
		Intro();
		Forgotten();
		RedeemableQualities();
		Bye();

	}
	
	public static void Intro()
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n" + 
				"                       _         __                      _   _     _                _____     __                    _   _                 _                    \n" + 
				"  /\\  /\\___ _ __ ___  (_)___    /__\\_   _____ _ __ _   _| |_| |__ (_)_ __   __ _    \\_   \\   / /  _____   _____    /_\\ | |__   ___  _   _| |_  /\\_/\\___  _   _ \n" + 
				" / /_/ / _ \\ '__/ _ \\ | / __|  /_\\ \\ \\ / / _ \\ '__| | | | __| '_ \\| | '_ \\ / _` |    / /\\/  / /  / _ \\ \\ / / _ \\  //_\\\\| '_ \\ / _ \\| | | | __| \\_ _/ _ \\| | | |\n" + 
				"/ __  /  __/ | |  __/ | \\__ \\ //__  \\ V /  __/ |  | |_| | |_| | | | | | | | (_| | /\\/ /_   / /__| (_) \\ V /  __/ /  _  \\ |_) | (_) | |_| | |_   / \\ (_) | |_| |\n" + 
				"\\/ /_/ \\___|_|  \\___| |_|___/ \\__/   \\_/ \\___|_|   \\__, |\\__|_| |_|_|_| |_|\\__, | \\____/   \\____/\\___/ \\_/ \\___| \\_/ \\_/_.__/ \\___/ \\__,_|\\__|  \\_/\\___/ \\__,_|\n" + 
				"                                                   |___/                   |___/                                                                               \n" + 
				"");
		
		System.out.println("Press 'y' to continue...");
		
		while (!scan.hasNext("[y]")) 
		{
		    System.out.println("You gotta press 'y' to continue ;)");
		    scan.next();
		}
		
		System.out.println("Excellent, let's continue!");
		
	}
	
	public static void Forgotten()
	{
		System.out.println("\n" + 
				" __    __     _                          \n" + 
				"/ / /\\ \\ \\___| | ___ ___  _ __ ___   ___ \n" + 
				"\\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\\n" + 
				" \\  /\\  /  __/ | (_| (_) | | | | | |  __/\n" + 
				"  \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|\n" + 
				"                                         \n" + 
				"");
		
		try
		{
		    Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
		System.out.println("...");
		
		try
		{
		    Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
		System.out.println("...");
		
		try
		{
		    Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
		System.out.println("...");
		
		System.out.println("Well this is embarassing, you're so utterly forgetable I've forgotten your name.");
		System.out.println("Would you please enter your name for me? ;) ");
		
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		
		System.out.println(name + " is it? How quaint.");
	}
	
	public static void RedeemableQualities()
	{
		System.out.println("I would apologize for that, but well, it's you so I won't bother.");
		
		try
		{
		    Thread.sleep(3000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
		System.out.println("Let's move on to your");
		
		System.out.println("\n" + 
				" _ _  __          _                           _     _          ____             _ _ _   _           _ _ \n" + 
				"( | )/__\\ ___  __| | ___  ___ _ __ ___   __ _| |__ | | ___    /___ \\_   _  __ _| (_) |_(_) ___  ___( | )\n" + 
				" V V/ \\/// _ \\/ _` |/ _ \\/ _ \\ '_ ` _ \\ / _` | '_ \\| |/ _ \\  //  / / | | |/ _` | | | __| |/ _ \\/ __|V V \n" + 
				"   / _  \\  __/ (_| |  __/  __/ | | | | | (_| | |_) | |  __/ / \\_/ /| |_| | (_| | | | |_| |  __/\\__ \\    \n" + 
				"   \\/ \\_/\\___|\\__,_|\\___|\\___|_| |_| |_|\\__,_|_.__/|_|\\___| \\___,_\\ \\__,_|\\__,_|_|_|\\__|_|\\___||___/    \n" + 
				"                                                                                                        \n" + 
				"");
		
		try
		{
		    Thread.sleep(3000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
		System.out.println("Some day you'll go far and I hope you'll stay there!");
		
		System.out.println("Far away from me in case you didn't get it.");
		
		try
		{
		    Thread.sleep(3000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
		System.out.println("Ah well, don't worry, You're not a complete idiot...Some parts are obviously missing.");
		
		try
		{
		    Thread.sleep(3000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
		System.out.println("And well you're tall, so more of you I can despise!");
		
		try
		{
		    Thread.sleep(3000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
	}
	
	public static void Bye()
	{
		System.out.println("Come to think of it, why the hell am I still talking to you??");
		
		try
		{
		    Thread.sleep(3000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
		System.out.println("\n" + 
				" ______  __   __ _______              _____  _______ _______  ______\n" + 
				" |_____]   \\_/   |______      |      |     | |______ |______ |_____/\n" + 
				" |_____]    |    |______      |_____ |_____| ______| |______ |    \\_\n" + 
				"                                                                    \n" + 
				"");
	}

}

