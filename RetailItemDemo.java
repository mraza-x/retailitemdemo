import java.util.*;

/**
  Mohammed Raza
  CSC 162 - Lab2 #1 (main)
*/

public class RetailItemDemo
{
   public static void main(String[] args)
   {


      RetailItem jackets = new RetailItem();

      				jackets.setDescription("Jackets");
      				jackets.setUnitsOnHand(12);
      				jackets.setPrice(59.95);

      RetailItem jeans = new RetailItem();

      				jeans.setDescription("Jeans");
					jeans.setUnitsOnHand(40);
      				jeans.setPrice(34.95);

      RetailItem shirts = new RetailItem();

      				shirts.setDescription("Shirts");
      				shirts.setUnitsOnHand(20);
      				shirts.setPrice(24.95);


      // Output for Jackets:

      System.out.println("The item: " +
                         jackets.getDescription());

	  System.out.println("Number of Units of hand: " +
                         jackets.getUnitsOnHand());

	  System.out.println("The price: " +
                         jackets.getPrice());

      System.out.println(" ");
      System.out.println(" ");



      // Output for Jeans:

      System.out.println("The item: " +
                         jeans.getDescription());

	  System.out.println("Number of Units of hand: " +
                         jeans.getUnitsOnHand());

	  System.out.println("The price: " +
                         jeans.getPrice());

      System.out.println(" ");
      System.out.println(" ");



      // Output for Shirts:

	  System.out.println("The item: " +
	                           shirts.getDescription());

	  System.out.println("Number of Units of hand: " +
	                           shirts.getUnitsOnHand());

	  System.out.println("The price: " +
	                           shirts.getPrice());

   }
}
