public class AutoMain {

    public static void main(String[] args) {


        Auto auto = new Auto("BMW", 2020, "black", 3.5, "perfect", "petrol", 1000);
        System.out.println(auto);
        Auto auto1 = new Auto("НONDA", 2015, "White", 1.6, "bad", "petrol", 50000);
        System.out.println(auto1);

        Auto auto2 = new Auto("BMW", 2020, "black", 3.5, "perfect", "petrol", 1000);

        System.out.println("equals auto auto1  "+ auto.equals(auto1));
        System.out.println( "equals auto auto2  "+auto.equals(auto2));


        System.out.println("isSuspicious auto  " + auto.isSuspicious());
        System.out.println("isSuspicious aut1  " +  auto1.isSuspicious());
    }

}
