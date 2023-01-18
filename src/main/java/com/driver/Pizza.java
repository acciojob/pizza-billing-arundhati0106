package com.driver;

public class Pizza {
    //already given
    private int price;
    private Boolean isVeg;
    private String bill;

    //created
    private boolean isCheese = false;   //to see if cheese is ordered by customer, or is deluxe
    private boolean isToppings = false; //to see if toppings are ordered by customer, or is deluxe
    private boolean isPaperbag = false; //add in regular, not in deluxe

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) {
            this.price = 300;  //base price of veg regular pizza
        }
        else {
            this.price = 400;  //base price of regular non veg pizza
        }
        return;
    }

    public int getPrice(){
        this.bill += this.price; //update bill
        return this.price;
    }

    //customer asks for extra cheese
    public void addExtraCheese() {
        //check if its not already added, only then add it to bill
        //if already added once, even after multiple reminders by cutomer, dont add
        //would result in extra charges
        if(!this.isCheese) {
            this.isCheese = true;
            this.price += 80;    //cheese cost
        }
    }

    public void addExtraToppings(){
        //veg and non veg toppings have diff prices, so separate ifs
        if(!this.isToppings) {
            this.isToppings = true;     //customer asked for toppings
            //toppings on a veg pizza
            if(isVeg) {
                this.price += 70;       //veg toppings cost
            }
            //toppings on a non veg pizza
            else {
                this.price += 120;     //non veg toppings cost
            }
        }
        return;
    }

    public void addTakeaway(){
        //add paperbag in regular pizza, always
        if(!this.isPaperbag) {
            this.isPaperbag = true;
            this.price += 20;
        }
        return;
    }

    public String getBill(){
        this.bill = ("Base Price Of The Pizza: (isVeg?300:400)\n" +
                     "\nExtra Cheese Added: 80" +
                     "\nExtra Toppings Added: (isVeg?70?120)\n" +
                     (isPaperbag?"\nPaperbag Added: 20":"") +
                     "\nTotal Price: "+ this.price + "\n"
                    );
        return this.bill;
    }
}
