/**
 * Christian Atwood
 */

public class CardList
{
  // Inner class
  // Only used by containing class
   private class CardNode
   {
      Card data;
      CardNode next;
   
      public CardNode(Card newCard)
      {
         data = newCard;
         next = null;
      }
   }

   // Fields
   CardNode head;
   
   // Constructors
   public CardList()
   {
      head = null;
   }

   // Methods
   public void printAllCards ()
   {
        // Start at first of list and print out each card in the list
      System.out.println("All Cards:");
      if(head != null)
      {
         CardNode current = head;
         while(current != null)
         {
            System.out.println(current.data);
            current = current.next;
         }
      }
   }

   public void addCardToEnd(Card c)
   {
      if(head == null)
      {
         head = new CardNode(c);
      }
      else
      {
         CardNode temp = new CardNode(c);
         CardNode current = head;
         
         if(current != null)
         {
            while(current.next != null)
            {
               current = current.next;
            }
            current.next = temp;
         }
      }
   }
 
   public void addCardToFront (Card c)
   {   
      if(head == null)
      {
         head = new CardNode(c);
      }
      else
      {
         CardNode newHead = new CardNode(c);
         newHead.next = head;
         head = newHead;
      }
      
   }
   
   public void removeFirstCard()
   {
      if(head == null)
      {
         System.out.println("Nothing to remove");
      }
      else
      {
         CardNode oldHead = head;
         head = head.next;
         oldHead = null;
      }
      
   }
   
   public void removeLastCard()
   {
      if(head == null)
      {
         System.out.println("Nothing to remove");
      }
      else
      {
         System.out.println("Head =");
         System.out.println(head.data);
      
         if(head != null)
         {
            CardNode current = head;
            if(head.next == null)
            {
               head = null;
            }
            else
            {
               while(current.next.next != null)
               {
                  current = current.next;
               }
               current.next = null;
            }
         }
      }
   }
}
