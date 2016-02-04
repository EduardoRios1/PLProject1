package jamil.customer;

public class CustomerDB {


    public static Customer getCustomer(int customerNumber){
        if (customerNumber == 1001) {
            Customer Customer1001 = new Customer();
            Customer1001.setName("Barbara White");
            Customer1001.setAddress("3400 Richmond Parkway #3423");
            Customer1001.setCity("Bristol");
            Customer1001.setState("CT");
            Customer1001.setPostalCode("06010");
            return Customer1001;
        }
        if (customerNumber == 1002) {
            Customer Customer1002 = new Customer();
            Customer1002.setName("Karl Vang");
            Customer1002.setAddress("327 Franklin Street");
            Customer1002.setCity("Edina");
            Customer1002.setState("MN");
            Customer1002.setPostalCode("55435");
            return Customer1002;
            }
        if (customerNumber == 1003) {
            Customer Customer1003 = new Customer();
            Customer1003.setName("Ronda Chavan");
            Customer1003.setAddress("518 Commanche Dr.");
            Customer1003.setCity("Greensboro");
            Customer1003.setState("NC");
            Customer1003.setPostalCode("27410");
            return Customer1003;
        }
        else {
            return null;
        }
    }

}
