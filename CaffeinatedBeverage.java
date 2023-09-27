public class CaffeinatedBeverage
{
    private String name;
    private int ounces;
    private double price;
   
  //full constructor
    public CaffeinatedBeverage(String name, int ounces, double price) {
        this.name = name;
        this.ounces = ounces;
        this.price = price;
    }

  //getter
    public String getName() {
        return this.name;
    }

  //setter
    public void setName(String name) {
        this.name = name;
    }

  //getter
    public int getOunces() {
        return this.ounces;
    }

  //setter
   // public void setOunces(int ounces) {
   //     this.ounces = ounces;
   // }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        CaffeinatedBeverage that = (CaffeinatedBeverage) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 &&
               this.name.equals(that.name);
    }
// Error check
public void setOunces(int ounces){
if (ounces >= 0 ){
   this.ounces = ounces;
  }
 
else {
  throw new IllegalArgumentException("Ounces mustnot be less than 0");
}
}
public void setPrice (int price) {
if (price >= 0 ){
this.price = price;

}
else{
throw new IllegalArgumentException("Price mustnot be less than 0");
}
}

//methods
  
  public boolean sip(int amount){
  if( ounces <= amount) { 
    ounces -= amount;
    return true;
  } else {
    ounces = 0;
      return false;
  } 
  }

}
