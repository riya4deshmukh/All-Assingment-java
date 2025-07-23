import java.util.Scanner;

public class SimpleDMartBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Gender (male/female): ");
        String gender = sc.nextLine();

        System.out.print("Enter name of item 1: ");
        String item1 = sc.nextLine();
        System.out.print("Enter quantity of " + item1 + ": ");
        int qty1 = sc.nextInt();
        double price1 = 10;
        double total1 = qty1 * price1;
        double discount1 = 0;
        if (qty1 > 4) {
            discount1 = total1 * 0.05;
        }
        double totalamount1 = total1 - discount1;

        sc.nextLine();
        System.out.print("Enter name of item 2: ");
        String item2 = sc.nextLine();
        System.out.print("Enter quantity of " + item2 + ": ");
        int qty2 = sc.nextInt();
        double price2 = 20;
        double total2 = qty2 * price2;
        double totalamount2 = total2;

        sc.nextLine();
        System.out.print("Enter name of item 3: ");
        String item3 = sc.nextLine();
        System.out.print("Enter quantity of " + item3 + ": ");
        int qty3 = sc.nextInt();
        double price3 = 30;
        double total3 = qty3 * price3;
        double totalamount3 = total3;

        sc.nextLine();
        System.out.print("Enter name of item 4: ");
        String item4 = sc.nextLine();
        System.out.print("Enter quantity of " + item4 + ": ");
        int qty4 = sc.nextInt();
        double price4 = 40;
        double total4 = qty4 * price4;
        double totalamount4 = total4;

        sc.nextLine();
        System.out.print("Enter name of item 5: ");
        String item5 = sc.nextLine();
        System.out.print("Enter quantity of " + item5 + ": ");
        int qty5 = sc.nextInt();
        double price5 = 50;
        double total5 = qty5 * price5;
        double discount5 = total5 * 0.10;
        double totalamount5 = total5 - discount5;

        sc.nextLine();
        System.out.print("Enter name of item 6: ");
        String item6 = sc.nextLine();
        System.out.print("Enter quantity of " + item6 + ": ");
        int qty6 = sc.nextInt();
        double price6 = 60;
        double total6 = qty6 * price6;
        double totalamount6 = total6;

        sc.nextLine();
        System.out.print("Enter name of item 7: ");
        String item7 = sc.nextLine();
        System.out.print("Enter quantity of " + item7 + ": ");
        int qty7 = sc.nextInt();
        double price7 = 70;
        double total7 = qty7 * price7;
        double totalamount7 = total7;

        sc.nextLine();
        System.out.print("Enter name of item 8: ");
        String item8 = sc.nextLine();
        System.out.print("Enter quantity of " + item8 + ": ");
        int qty8 = sc.nextInt();
        double price8 = 80;
        double total8 = qty8 * price8;
        double totalamount8 = total8;

        sc.nextLine();
        System.out.print("Enter name of item 9: ");
        String item9 = sc.nextLine();
        System.out.print("Enter quantity of " + item9 + ": ");
        int qty9 = sc.nextInt();
        double price9 = 90;
        double total9 = qty9 * price9;
        double totalamount9 = total9;

        sc.nextLine();
        System.out.print("Enter name of item 10: ");
        String item10 = sc.nextLine();
        System.out.print("Enter quantity of " + item10 + ": ");
        int qty10 = sc.nextInt();
        double price10 = 100;
        double total10 = qty10 * price10;
        double discount10 = total10 * 0.15;
        double totalamount10 = total10 - discount10;

        double actualTotal = total1 + total2 + total3 + total4 + total5 + total6 + total7 + total8 + total9 + total10;
        double discountedTotal = totalamount1 + totalamount2 + totalamount3 + totalamount4 + totalamount5 +
                totalamount6 + totalamount7 + totalamount8 + totalamount9 + totalamount10;

        double overallDiscount = 0;
        if (discountedTotal > 10000) {
            overallDiscount = discountedTotal * 0.15;
        } else if (discountedTotal >= 5000) {
            overallDiscount = discountedTotal * 0.10;
        }
        discountedTotal -= overallDiscount;

        double gst = discountedTotal * 0.10;

        sc.nextLine();
        System.out.print("Do you want a carry bag? (yes/no): ");
        String carryBag = sc.nextLine();
        int carryCharge = carryBag.equalsIgnoreCase("yes") ? 10 : 0;

        double finalBill = discountedTotal + gst + carryCharge;

        String gift = gender.equalsIgnoreCase("female") ? "Cadeberry" : "Ladger Wallet";

        System.out.println("\n\n\t\t\tD-Mart");
        System.out.println("Name: " + name + "\t\tDate: " + java.time.LocalDate.now());
        System.out.println("------------------------------------------------------------");
        System.out.println("Item\tQty\tPrice\tTotal\tTotalAmount");
        System.out.println(item1 + "\t" + qty1 + "\t" + price1 + "\t" + total1 + "\t" + totalamount1);
        System.out.println(item2 + "\t" + qty2 + "\t" + price2 + "\t" + total2 + "\t" + totalamount2);
        System.out.println(item3 + "\t" + qty3 + "\t" + price3 + "\t" + total3 + "\t" + totalamount3);
        System.out.println(item4 + "\t" + qty4 + "\t" + price4 + "\t" + total4 + "\t" + totalamount4);
        System.out.println(item5 + "\t" + qty5 + "\t" + price5 + "\t" + total5 + "\t" + totalamount5);
        System.out.println(item6 + "\t" + qty6 + "\t" + price6 + "\t" + total6 + "\t" + totalamount6);
        System.out.println(item7 + "\t" + qty7 + "\t" + price7 + "\t" + total7 + "\t" + totalamount7);
        System.out.println(item8 + "\t" + qty8 + "\t" + price8 + "\t" + total8 + "\t" + totalamount8);
        System.out.println(item9 + "\t" + qty9 + "\t" + price9 + "\t" + total9 + "\t" + totalamount9);
        System.out.println(item10 + "\t" + qty10 + "\t" + price10 + "\t" + total10 + "\t" + totalamount10);
        System.out.println("------------------------------------------------------------");
        System.out.println("Actual Total: " + actualTotal);
        System.out.println("Discounted Total: " + discountedTotal);
        System.out.println("GST (10%): " + gst);
        System.out.println("Carry Bag Charge: " + carryCharge);
        System.out.println("Gift: " + gift);
        System.out.println("------------------------------------------------------------");
        System.out.println("Final Bill Amount: " + finalBill + " Rs");
        System.out.println("\n\t\tThank You For Shopping at D-Mart!");
    }
}
