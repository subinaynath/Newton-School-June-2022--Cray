// your class code goes here
class VipCustomer{
    String name= "XYZ";
    double creditLimit=  10;
    String email = "xyz@abc.com";

    VipCustomer(){
      
    }

    VipCustomer(String name, double creditLimit){
       this.name = name;
        this.creditLimit = creditLimit;
    }

    VipCustomer(String name, double creditLimit, String email){
       this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public double getCreditLimit(){
        return this.creditLimit;
    }

    public String getEmail(){
        return this.email;
    }

    public String getName(){
        return this.name;
    }
}
