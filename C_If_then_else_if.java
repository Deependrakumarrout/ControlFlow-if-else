package ControlFlow;

public class C_If_then_else_if {

    // instance filed:
    // There instance filed are mention in 2nd part of code.

    boolean isFilled;
    double cost;
    String deliveryProcess;

    // 2nd part :
    // constructor method:
    public C_If_then_else_if(boolean filled, double shippingCost, String processOf) {
        if (shippingCost > 24.0) {
            System.out.println("High value item proceed...");
        }

        isFilled = filled;
        cost = shippingCost;
        deliveryProcess = processOf;
    }

    // method:
    public void shippingProcedure() {
        if (isFilled) {
            System.out.println("\nYour item shipped. \n" + "Shipping charges: " + expressCharges() + modeOfProcess());
        }
        else
            System.out.println("Your item not yet in the shipping process");
    }


    public double expressCharges() {
        if(deliveryProcess == "Regular") {
            return 0;
        }
        else if(deliveryProcess == "Express") {
            return 1.78;
        }
        else
            return 0.54;
    }

    // A bit modified by me by using string method.
    public String modeOfProcess() {
        if (deliveryProcess == "Regular") {
            return " (In the bases of Regular mode)";
        }
        else if (deliveryProcess == "Express") {
            return " (Express mode a bit expensive.)";
        }
        else
            return "(error detected.)";
    }



    // main method:
    public static void main(String[] args) {
        C_If_then_else_if order1 = new C_If_then_else_if(true,10.4,"Regular");
        C_If_then_else_if order2 = new C_If_then_else_if(true,29.43,"Express");
        order1.shippingProcedure();
        order2.shippingProcedure();

        System.out.println(order1); // -> pending...

        // 1st part start from here:
     /* // i have just tried this one and the below code is also i am trying to write myself.

        int studentMark = 55;
        if (studentMark > 90) {
            System.out.println("A+");
        } else if (studentMark > 80) {
            System.out.println("A");
        } else if (studentMark > 70) {
            System.out.println("B+");
        } else if (studentMark > 60) {
            System.out.println("B");
        } else if (studentMark > 40) { // This thing i have done for testing, the code will not check below if this condition
            System.out.println("C");   // is true then it will stop and just print the C grade again it will not check the .
        } else if (studentMark > 30) { // the below code but only if statement can check till the condition.
            System.out.println("D");
        } else if (studentMark > 50) {
            System.out.println("E");
        }
        else
            System.out.println("F");

        1st part ends here.
        */


        // 2nd part start here again.







    }

}
