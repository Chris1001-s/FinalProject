import java.util.*;

public class FinalProject {
    public static void main(String args[]) {

        ArrayList<String> items = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();
        ArrayList<String> customerItem = new ArrayList<>();
        ArrayList<Integer> itemAmount = new ArrayList<>();

        items.add("Red-Hot Spicy Doritos");
        items.add("Cool Ranch Doritos");
        items.add("Coke");
        items.add("Pepsi");
        items.add("Diet Coke");
        items.add("5 Hour Energy");
        items.add("Mac Charger");
        items.add("Dell Charger");
        items.add("Sunflower Seeds");
        items.add("Peanuts");

        price.add(2.99);
        price.add(2.99);
        price.add(0.99);
        price.add(0.99);
        price.add(0.99);
        price.add(3.99);
        price.add(120.0);
        price.add(50.0);
        price.add(0.99);
        price.add(0.99);


        Scanner scanner = new Scanner(System.in);

        int index = 0;
        String output = "";
        double total= 0;
        double totalAmount = 0;
        System.out.print("Enter the name of the customer: ");

        String input;
// ask for for customer name;
        while(!(input= scanner.nextLine()).equals("finished")){
            output += input + "\n" ;
            System.out.println("Enter the name of items: [done to exit]");
// start at zero for each customer
            total =0;
//ask for item
            while(!(input = scanner.nextLine()).equals("done")) {
                for(String item:items) {
                    if(item.equalsIgnoreCase(input)) {
                        total += price.get(items.indexOf(item));
                        output += "\n"+ input;
                        if(!customerItem.equals(input)) {
                            customerItem.add(input);
                            itemAmount.add(1);
                        }
                        else {
                            index = 1;
                            index = itemAmount.set(index, index);
                        }

                        break;
                    }
                }
            }
            output += "\n\t"+total +"\n";
            totalAmount += total;
            System.out.print("Enter the name of the next customer [finished to exit]: ");
        }
        System.out.println("receipt: "+output);
        System.out.println("inventory Sold: ");

        for(String customer:customerItem) {

            System.out.println(customer+" ("+itemAmount.get(index)+")");
        }
        System.out.println();
        System.out.println("total amount: "+totalAmount);
    }
}
