package org.example.collections.queue.priority;

public class AppPriority {

    void foo() {
        String m = "Hello,";
        System.out.println(m);
        bar(m);
        System.out.println(bar(m));
        System.out.println(m);
    }

    String bar(String m) {
        m += " World";
        return m;
    }

    public static void main(String[] args) {
        Market market = new Market();

        market.addCustomer(new Customer("One"));
        market.addCustomer(new Customer("Second"));
        market.addCustomer(new Customer("first.VIP", Status.VIP));
        market.addCustomer(new Customer("third"));
        market.addCustomer(new Customer("fourth"));
        market.addCustomer(new Customer("second.VIP", Status.VIP));

//        while (market.hasNext()){
//            System.out.println(market.getNextCustomer());
//        }
        for (int i = 1; i <= 3; i++) {
            System.out.println(market.getNextCustomer());
        }
        market.addCustomer(new Customer("New VIP", Status.VIP));
        System.out.println("!!!!!!!!!!!!!!!!");

        while (market.hasNext()) {
            System.out.println(market.getNextCustomer());
        }
        //new AppPriority().foo();
    }
}
