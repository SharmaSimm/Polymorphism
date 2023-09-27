import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
  	{
		CaffeinatedBeverage[] inventory = new CaffeinatedBeverage[10];
		Scanner keyboard = new Scanner(System.in);
		// Prompt user with options in a loop
		int choice, ounces, brewTemp, count = 0;
		String name;
		double price;
		
		do
    	{
			System.out.println("1) Enter new Tea");
			System.out.println("2) Enter new Yerba Mate");
			System.out.println("3) Exit");
			System.out.print(">>");
			choice = keyboard.nextInt();
			
			switch (choice)
			{
			    case 1: // Tea
			        System.out.print("Enter name      : ");
			        name = keyboard.nextLine();
			        System.out.print("Enter ounces    : ");
			        ounces = keyboard.nextInt();
			        System.out.print("Enter price     $ ");
			        price = keyboard.nextDouble();
			        System.out.print("Enter brew temperature (in Celsius): ");
			        brewTemp = keyboard.nextInt();
			
			        // Create a Tea, put into array
			        inventory[count] = new Tea(name, ounces, price, brewTemp);

					System.out.println("Your tea order has been added: " + inventory[count]);
			        count++;
			        break;
			
			
        case 2: // YerbaMate
              System.out.print("Enter name:      :");
              name = keyboard.nextLine();
			        System.out.print("Enter ounces    : ");
			        ounces = keyboard.nextInt();
			        System.out.print("Enter price     $ ");
			        price = keyboard.nextDouble();
			        System.out.print("Enter brew temperature (in Celsius): ");
			        brewTemp = keyboard.nextInt();


        //Create a  YerbamATE , put into array
       inventory[count] = new YerbaMate(name, ounces, price, brewTemp, 0);
        System.out.println("Your tea order has been added: " + inventory[count]);
			        count++;
			        break;
      }
		} while (choice != 3);
//Print all items in inventory
  for(int i = 0; i < count ; i++){
    System.out.println(inventory[i].toString());
  }
      
      //Print highest price and average price
   
      double averagePrice = findAveragePrice(inventory, count);
      System.out.println("The average price of all beverage is : $ " + averagePrice);

      
	YerbaMate highestPriceYerbaMate = findHighestPricedYerbaMate(inventory, count);
      if (highestPriceYerbaMate != null ){
        System.out.println("The highest priced YerbaMate is : " + highestPriceYerbaMate.toString());
      }
   }

  public static double findAveragePrice(CaffeinatedBeverage[] inventory, int count ){
    double sum = 0;
    for(int i = 0; i < count; i++){
      sum += inventory[i].getPrice();
    }
    return sum / count;
  }
  public static YerbaMate findHighestPricedYerbaMate(CaffeinatedBeverage[] inventory, int count){
    YerbaMate highestPriceYerbaMate = null;
    double highestPrice = 0.0;
    for (int i = 0; i < count; i++) {
		if (inventory[i] instanceof YerbaMate) {
			YerbaMate yerbaMate = (YerbaMate) inventory[i];
			if (yerbaMate.getPrice() > highestPrice) {
				highestPrice = yerbaMate.getPrice();
				highestPriceYerbaMate = yerbaMate;
			}
		}
  }
    return highestPriceYerbaMate;
   }
}