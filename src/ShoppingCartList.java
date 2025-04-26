
import java.util.Scanner;


class ShoppingCartList {
      int size=0;
      ItemNode head,tail;
      
      

    public ShoppingCartList(ItemNode head, ItemNode tail) {
        this.head = head;
        this.tail = tail;
    }

    public ShoppingCartList() {
    }
    
   public void addItem(ItemNode item)
   {   item.next=null;
       if(head==null)
       {
           head=tail=item;
           size++;
       }
       else
       {
           
           tail.next=item;
           tail=tail.next;
           size++;
       }
                      
          
   }
   public void Return (String itemname,int quantity) throws Exception
       {
           
           ItemNode curr=head;
           ItemNode pre=null;
           if(curr==null)
           {
               throw new Exception ("there is no items to return");
           }
           else{
           while(curr!=null)
           {
               if(curr.name.equals(itemname))
               {
                   if(curr.quantity>quantity)
                   {
                       curr.quantity=curr.quantity-quantity;return;
                   }
                   
               
               else if(quantity>curr.quantity)
               {
                   System.out.println("This quantity is greater than you have ,please enter a valid quantity");
                   Return(itemname,new Scanner(System.in).nextInt());
               }
               else 
               {
                   if(pre==null)
                   {
                       head=head.next;
                   }
                   else
                   {
                       pre.next=curr.next;
                   }
                   
               }
               }
               pre=curr;
               curr=curr.next;
               
           }}
           System.out.println("this item does not exist in your shopping list");
           
           
           
       }
  public void printshop()
   {
       ItemNode curr1=head;
       while(curr1!=null)
       {
           System.out.print(curr1.name+" ");
           curr1=curr1.next;
       }
       System.out.println("");
       
   }
   
    
    
}
