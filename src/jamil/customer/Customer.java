package jamil.customer;

public class Customer {

    private String name;
    private String address;
    private String city;
    private String state;
    private String postalCode;

    public void setName(String newValue){
        name=newValue;
    }

    public void setAddress(String newValue){
        address=newValue;
    }

    public void setCity(String newValue){
        city=newValue;
    }

    public void setState(String newValue){
        state=newValue;
    }

    public void setPostalCode(String newValue){
        postalCode=newValue;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

    public String getPostalCode(){
        return postalCode;
    }

    public String getNameAndAddress() {
        return name + "\n" + address + "\n" + city + ", " +
                state + " " + postalCode;
    }
}
