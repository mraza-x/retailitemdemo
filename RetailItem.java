/**
Mohammed Raza
CSC 162 - Lab2 # 1 (class)
*/

public class RetailItem
{
   private String description;
   private int unitsOnHand;
   private double price;

   /**
      Constructor
      @param des is the description of the item
      @param units is the number of items in stock
      @param pr is the price
   */

   public void RetailItem(String des, int units, int pr)
   {
      description = des;
      unitsOnHand = units;
      price = pr;
   }

   /**
      The setDescription method stores a string
      of the item description
      @param des is the description string
   */

   public void setDescription(String des)
   {
      description = des;
   }

   /**
      The setUnitsOnHand method stores the number of
      items in stock
      @param units is the number of items in stock
   */

   public void setUnitsOnHand(int units)
   {
      unitsOnHand = units;
   }

   /**
      The setPrice method stores the price of the item
      @param p is the price of the item
   */

   public void setPrice(double pr)
   {
      price = pr;
   }

   /**
      The getDescription method returns the description
      of the item.
      @return is the value of the description string.
   */

   public String getDescription()
   {
      return description;
   }

   /**
      The getUnitsOnHand method returns the number of
      items in stock.
      @return is the value of the items in stock
   */

   public int getUnitsOnHand()
   {
      return unitsOnHand;
   }

   /**
      The getPrice method returns the price of the item.
      @return is the value of the price of the item.
   */

   public double getPrice()
   {
      return price;
   }

}
