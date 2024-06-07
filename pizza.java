public class pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsAdded = 150;
    private int backPack = 30;
    private int basePizza;
    private boolean isExtraCheeseAdded =false;
    private boolean isExtraToppingsAdded =false;
    private boolean isOptedForTakeAway =false;


    public pizza(boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        basePizza = this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;

    }
 public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += extraToppingsAdded;

 }
  public void takeAway(){
        isOptedForTakeAway = true;
        this.price += backPack;

  }
  public void getBill(){
        String bill ="";
        System.out.println("Pizza: " + basePizza);
        if(isExtraCheeseAdded){
            bill += "Extra cheese added: "+extraCheesePrice+"\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra toppings added: "+extraToppingsAdded+"\n";
        }
        if(isOptedForTakeAway){
            bill += "take-away: "+backPack+"\n";
        }
      bill += "bill: "+this.price+"\n";
        System.out.println(bill);

  }
}
