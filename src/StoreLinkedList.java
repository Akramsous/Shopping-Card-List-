
class StoreLinkedList {
    
    int size=0;
     ItemNode head,tail;
     int StoreNumber;
     
    
    public StoreLinkedList(ItemNode head, ItemNode tail,int b) {
        this.head = head;
        this.tail = tail;
        this.StoreNumber=b;
    }
    

    public StoreLinkedList(int b) {
        this.StoreNumber=b;
    }
   public boolean Add (ItemNode item)
   {   if(head==null)
       {
       head=tail=item;
       size++;
       
       return true;
        }
        
       ItemNode curr=head,pre=null;
       while(curr!=null)
       {
           if((curr.name.equals(item.name)) )
           {
               curr.quantity=curr.quantity+item.quantity;
               return true;
               
           }
           if((item.name.compareTo(curr.name))<=0)
           {
               if(head==curr)
               {
                   item.next=head;
                   head=item;
                   
                   
                   size++;
                   return true;
                   
               }
               else
               {
                   pre.next=item;
                   item.next=curr;
                   size++;
                   return true;
               }
           }
           pre=curr;
           curr=curr.next;
         
       }
       tail.next=item;
       tail=item;
       size++;
      
       return true;
     
   }
   public boolean find (ItemNode item)
   {   if(head==null)
       return false;
       ItemNode curr=head;
       while(curr!=null){
           if(curr.name.equals(item.name)&&curr.ID.equals(item.ID))
               return true;
           curr=curr.next;
       }
       return false;
       
   }
   public boolean delete(ItemNode item)
   {
       if(find(item))
       { 
           if(head==item)
           {
               head=head.next;
               
           }
           else{
           ItemNode curr=head;
           
           while(curr.next!=item)
               
           {
              curr=curr.next;
           }
           curr.next=curr.next.next;
           }
           size--;
           return true;
           
       }
       return false;
   }
  public void print()
   {
       ItemNode curr=head;
       while(curr!=null)
       {
           System.out.print(curr.quantity+" ");
           curr=curr.next;
       }
       System.out.println("");
   }
    
    
}
