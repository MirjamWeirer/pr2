package einheit3;

public class CustomerAdressDemo {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1,"Mirjam","Weirer");
        Customer customer2 = new Customer(2,"Petra","Weirer");

        //customer1.firstName = "Mirjam";
        //customer1.lastName = "Weirer";
        //customer2.firstName = "Petra";
        //customer2.lastName = "Weirer";
        customer1.addAddress(new Address("Papiermühlgasse 28","8020","Graz","Österreich"));
        customer1.addAddress(new Address("Ausserstraße 45a","8940","Liezen","Österreich"));
        customer2.addAddress(new Address("Ausserstraße 45a","8940","Liezen","Österreich"));
        System.out.println(customer1);
        System.out.println(customer2);
        customer1.doSomething();
    }
}
