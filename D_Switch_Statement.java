package ControlFlow;

import java.awt.image.Kernel;

public class D_Switch_Statement {

    // I am writing this code by looking the codeAcademy.
    /*
    boolean isFilled;
        double billAmount;
        String shipping;

        public D_Switch_Statement(boolean filled, double cost,String shippingMethod) {
            if(cost > 24.00) {
                System.out.println("High value item!");
            }
            isFilled = filled;
            billAmount = cost;
            shipping = shippingMethod;
        }

        public void ship() {
            if (isFilled) {
                System.out.println("Shipping");
                System.out.println("Shipping cost: " + calculateShipping());
            }   else {
                System.out.println("Order not ready");
            }
        }

        public double calculateShipping() {
            double shippingCost;
            //declare switch statement here
            switch (shipping) {
                case "Regular":
                    shippingCost = 0;
                    break;
                case "Express":
                    shippingCost = 1.75;
                    break;
                default:
                    shippingCost = .50;
            }
            return shippingCost;
        }


        public static void main(String[] args) {
            D_Switch_Statement iphone = new D_Switch_Statement(true,60000,"Express");
            D_Switch_Statement pencil = new D_Switch_Statement(false,10,"Regular");
            iphone.ship();
            pencil.ship();
        }
     */


    // I have tried this code by myself.

    double itemPrice;
    String offerSeason;
    boolean affordable;

    public D_Switch_Statement(double cost,String offerName, boolean afford) {
        if(cost > 1100) {
            System.out.println("Selected higher value item!\n");
        }
        itemPrice = cost;
        offerSeason = offerName;
        affordable = afford;
    }

    public void sellablePrice() {
        if(itemPrice < 1100) {
            System.out.println("Delivery charges: " + discount());
        }
        else if(itemPrice < 500) {
            System.out.println("Delivery charges: " + discount());
        }
        else {
            System.out.println("Yo you may received a reward + you got a free delivery: " + discount());
        }
    }

    public double discount() {
    double deliveryDiscount;

    switch (offerSeason) {
        case "End of season sale": {
            deliveryDiscount = 40.43;
            break;
        }
        case "Big billion days": {
            deliveryDiscount = 60.56;
            break;
        }
        default:
            deliveryDiscount = 0;
    }
        return deliveryDiscount;
    }

    public static void main(String[] args) {
        D_Switch_Statement ToyCar = new D_Switch_Statement(1200,"End of season sale",true);
        D_Switch_Statement JeansPants = new D_Switch_Statement(750,"Big billion days",true);
        D_Switch_Statement satellite = new D_Switch_Statement(12000,"",false);

        ToyCar.sellablePrice();
        JeansPants.sellablePrice();
        satellite.sellablePrice();
        System.out.println(ToyCar.offerSeason);

        //Kernel.class.arrayType(); <-- what is this?.

    }
}

