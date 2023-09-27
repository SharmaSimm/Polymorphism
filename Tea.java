public class Tea extends CaffeinatedBeverage {
  

//instance variables

private int brewTemp;
// private String name;
//setter //error check
public void setBrewTemp(int brewTemp){
  
  if (brewTemp >= 0 ) {
     this.brewTemp = brewTemp;
  } else {
    throw new IllegalArgumentException(" Temperature must be greater than 0");
  }
 
}
  //full constructor
  public Tea (String name, int ounces, double price, int brewTemp){
    super(name,ounces,price);
    this.brewTemp = brewTemp;
  }

//copy constructor
  public Tea( Tea other){
    super(other.getName(),other.getOunces(), other.getPrice() );
    // this.name = other.name;
    // this.ounces = other.ounces;
    // this.price = other.price;
    this.brewTemp = other.brewTemp;  
  }

  @Override
  public boolean equals (Object obj){
    if (obj == this){
      return true;
    }
    if (obj != this){
      return false;
    }

    Tea other =(Tea)obj;
    return getName().equals(other.getName()) &&
      getOunces() == other.getOunces() &&
      getPrice() == other.getPrice() &&
      brewTemp == other.brewTemp;
  }

  @Override //toString
  public String toString(){
    return String.format("YerbaMate: ",getName(), brewTemp ,getPrice());
  }
}