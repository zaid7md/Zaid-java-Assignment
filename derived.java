package market ; 
import java.util.Scanner; 
interface MarketPlace//interface 
{
    //variables and arrays taken in interface so that they are static and final by defualt and cannot be further changed in the program 
    int maxMoney = 10000 ; //public + final + static 

    String roleplay[] = {"GTA","READ DEAD REMPTION","ELDEN RING","SEKIRO SHADOWS DIES TWICE","LAST OF US"}; 
    int roleplayPrice[] = {1900,3000,2000,500,2500} ;

    String racingGame[] = {"FORZA HORIZON","FORZA MOTORSPORTS","NEED FOR SPEED","ASPHALT","MOTOGP"};
    int racingGamePrice[] = {2500,1000,450,120,440};

    String horror[] = {"OUTLAST","PHASMOPHOBIA","RESIDENT EVIL","FIVE NIGHT AT FREDDYS","PACIFY"}; 
    int horrorPrice[] = {1000,500,2000,500,150};


    String fps[] = {"Counter Strike","Call of Duty","Battlefield","Overwatch","Valorant"};
    int fpsPrice[] = {1100,2000,2400,1100,400} ; 

    String sports[] = {"FIFA","CRICKET","NBA","GOLF","RUGBY"};
    int sportsPrice[] = {2500,1000,1200,600,200};

}
interface budget //interface listing the methods that must be overriden in the class which implements it  
{
    void buyRoleplay() ; 
    void buyracing();
    void buyHorror();
    void buyfps(); 
    void buysports();
    void display();
}

public class derived implements budget , MarketPlace //multiple ineheritence where dervied class implements two interfaces at once 
{
    public static int budget = MarketPlace.maxMoney; //static
    public static int total = 0 ; // made static to calculate the total money spent on games
    public static int RemainingBudget ; // static to calculate the reaming money left 
    static String selectedgames[] = new String[100]; //cart whose maxx capacity is 100 and is made static 
    static int count = 0 ; //static to maintain the count of of items in cart 
    Scanner sc = new Scanner(System.in) ; 

    public void buyRoleplay() // buying roleplay games and updating count , total money spent , remaining budget 
    {
        
         for(int i = 0 ; i < 5 ; i++)
        {
            System.out.printf("%d) %s - %d\t",i+1,MarketPlace.roleplay[i],MarketPlace.roleplayPrice[i]);
        }
        int choice = sc.nextInt() ; 
        if(choice >=1 && choice <= 5 && (total + MarketPlace.roleplayPrice[choice -1]) <= 10000)
        {
            total += MarketPlace.roleplayPrice[choice-1];  //updating money spent     
            RemainingBudget = budget - total ; //updating money spent                                                                    
            selectedgames[count] = MarketPlace.roleplay[choice-1]; //updating money spent 
            count++ ; //updating the count value of items in the cart 
        }
        else if(choice > 5 || choice < 1 )
        {
            System.out.println("Enter appropriate choice");
        }
        else 
        {
            System.out.println("You have exceeded the Balance");
        }

    }
    public void buyracing()
    {
        
         for(int i = 0 ; i < 5 ; i++)
        {
            System.out.printf("%d) %s - %d\t",i+1,MarketPlace.racingGame[i],MarketPlace.racingGamePrice[i]);
        }
        int choice = sc.nextInt() ; 
        if(choice >=1 && choice <= 5 && (total + MarketPlace.racingGamePrice[choice -1]) <= 10000)
        {
            total += MarketPlace.racingGamePrice[choice-1];     //updating the total money spent     
            RemainingBudget = budget - total ;  //updating remaining money                                                                                                     
            selectedgames[count] = MarketPlace.racingGame[choice-1]; //updating the cart 
            count++ ; //updating the count value of items in the cart
        }
        else if(choice > 5 || choice < 1 )
        {
            System.out.println("Enter appropriate choice");
        }
        else 
        {
            System.out.println("You have exceeded the Balance");
        }
    }
    public void buyHorror()
    {
        
         for(int i = 0 ; i < 5 ; i++)
        {
            System.out.printf("%d) %s - %d\t",i+1,MarketPlace.horror[i],MarketPlace.horrorPrice[i]);
        }
        int choice = sc.nextInt() ; 
        if(choice >=1 && choice <= 5 && (total + MarketPlace.horrorPrice[choice -1]) <= 10000)
        {
            total += MarketPlace.horrorPrice[choice-1];  //updating the total money spent      
            RemainingBudget = budget - total ;    //updating remaining money                                                                                                   
            selectedgames[count] = MarketPlace.horror[choice-1]; //updating the cart 
            count++ ; //updating the count value of items in the cart
        }
        else if(choice > 5 || choice < 1 )
        {
            System.out.println("Enter appropriate choice");
        }
        else 
        {
            System.out.println("You have exceeded the Balance");
        }
    }
    public void buyfps()
    {
         for(int i = 0 ; i < 5 ; i++)
        {
            System.out.printf("%d) %s - %d\t",i+1,MarketPlace.fps[i],MarketPlace.fpsPrice[i]);
        }
        int choice = sc.nextInt() ; 
        if(choice >=1 && choice <= 5 && (total + MarketPlace.fpsPrice[choice -1]) <= 10000)
        {
            total += MarketPlace.fpsPrice[choice-1];     //updating the total money spent       
            RemainingBudget = budget - total ;  //updating the remaining money                                                                                                    
            selectedgames[count] = MarketPlace.fps[choice-1]; //updating the cart
            count++ ; //updating the count value of items in the cart
        }
        else if(choice > 5 || choice < 1 )
        {
            System.out.println("Enter appropriate choice");
        }
        else 
        {
            System.out.println("You have exceeded the Balance");
        }
    }
    public void buysports()
    {
         for(int i = 0 ; i < 5 ; i++)
        {
            System.out.printf("%d) %s - %d\t",i+1,MarketPlace.sports[i],MarketPlace.sportsPrice[i]);
        }
        int choice = sc.nextInt() ; 
        if(choice >=1 && choice <= 5 && (total + MarketPlace.sportsPrice[choice -1]) <= 10000)
        {
            total += MarketPlace.sportsPrice[choice-1];   //updating the total money spent        
            RemainingBudget = budget - total ;   //updating the remaining money                                                                                            
            selectedgames[count] = MarketPlace.sports[choice-1]; //updating the cart
            count++ ; //updating the count value of items in the cart
        }
        else if(choice > 5 || choice < 1 )
        {
            System.out.println("Enter appropriate choice");
        }
        else 
        {
            System.out.println("You have exceeded the Balance");
        }
    }
    public void display()           
    {
        if(selectedgames[0] != null)
        {
        System.out.print("\nYour shopping cart : ");
        for(int i = 0 ; i < count ; i++)
        {
            System.out.printf("%d. %s\t",i+1,selectedgames[i]);
        }
        System.out.printf("\nRemaming Budget : %d\n",RemainingBudget) ; 
        System.out.printf("Total = %d",total) ; 
        }
        else
        {
            System.out.println("Empty cart!");
        }
    }
    // all methods of the interfaces overridden 
    //interface MarketPlace used for declaring final static variables and arrays 
    // interface budget used for mentioning a list of methods to be overriden in the class 
}
