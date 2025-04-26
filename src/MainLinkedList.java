public class MainLinkedList {
     
    int size=0;
      StoreNode head,tail;
      ShoppingCartList cart=new ShoppingCartList();

      
    public MainLinkedList(StoreNode head, StoreNode tail, ShoppingCartList cart) {
        this.head = head;
        this.tail = tail;
        this.cart = cart;
    }
    
    public void addstore (StoreLinkedList store)
    {
        
        StoreNode node =new StoreNode (store);
        if(head==null)
        {
            head=tail=node;
            size++;
        }
        else{
            tail.next=node;
            tail=node;
            size++;
            
        }
        
            
            
    
    }
    
    public MainLinkedList() {
        
    }

    
    public boolean searchItem(String name , String id)
    {
        StoreNode curr=head;
        while(curr!=null)
        {
            ItemNode curr1=curr.store.head;
            while(curr1!=null)
            {
                if(curr1.name.equals(name)&&curr1.ID.equals(id))
                {
                    System.out.println(curr1.storeNumber+" "+curr1.quantity);
                    return true;
                }
                curr1=curr1.next;
            }
            curr=curr.next;
        }
        return false;
    }
            
    public void Add (int StoreNumber,ItemNode item)
    { 
        StoreNode curr=head;
        while(curr!=null)
        {   
            if(curr.store.StoreNumber==StoreNumber)
            {
                curr.store.Add(item);break;
                
            }
        curr=curr.next;
        }
    
    }
    public void reduce (ItemNode item)
    {
        StoreNode curr=head;
        while(curr!=null)
        {
            ItemNode curr1=curr.store.head;
            while(curr1 !=null)
            {
                if(curr1.name.equals(item.name))
                {
                    if(item.quantity==curr1.quantity||item.quantity>curr1.quantity)
                    {
                        curr.store.delete(curr1);break;
                    }
                    else if(item.quantity<curr1.quantity)
                    {
                        curr1.quantity=curr1.quantity-item.quantity;break;
                    }
                   
                    
                       
                  
                }
                curr1=curr1.next;
            }
            curr=curr.next;
        }
    }
           
        
    public void addToCart(ItemNode item)
    {if(searchItem(item.name,item.ID)){
       
        cart.addItem(item);
        reduce(item);}
    else System.out.println("does not exist \n"+" we hope it exists next time");
    }
    public void returnfromcart(String name,int quantity) throws Exception
    {
        cart.Return(name, quantity);
        itemreturnedfromcart(name,quantity);
        
        
    }

    private void itemreturnedfromcart(String name, int quantity) {
                StoreNode curr=head;
        while(curr!=null)
        {
            ItemNode curr1=curr.store.head;
            while(curr1!=null)
            {
                if(curr1.name.equals(name))
                {
                    curr1.quantity+=quantity;return;
                }
                curr1=curr1.next;
            }
            curr=curr.next;
            
        }

        
    }
    public double purchase ()
    {   double sum=0;
        ItemNode curr=cart.head;
        while(curr!=null)
        { sum+=curr.price;
        curr=curr.next;
            
        }
        cart.head=cart.tail=null;
        return sum;
        
    }
    public static void main (String[]args) throws Exception
    {
        MainLinkedList main=new MainLinkedList();
        
       
            
        }
        
    }
    
            
    
    
    

