class ItemNode {
    
    String name,ID;
    int price,quantity,storeNumber;
     ItemNode next;

    public ItemNode(String name, String ID, int price, int quantity, int storeNumber, ItemNode next) {
        this.name = name;
        this.ID = ID;
        this.price = price;
        this.quantity = quantity;
        this.storeNumber = storeNumber;
        this.next = next;
    }

    public ItemNode(String name, String ID, int price, int quantity, int storeNumber) {
        this.name = name;
        this.ID = ID;
        this.price = price;
        this.quantity = quantity;
        this.storeNumber = storeNumber;
    }
    

   

    public ItemNode() {
        
    }

    
    
    
    
    
}
