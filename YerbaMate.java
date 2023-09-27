public class YerbaMate extends Tea {

  //instance variable
  protected int numPasses;

  //accessor
 public int  getNumPasses(){
   return this.numPasses;
 }
  //mutator that increments numPasses
  public void passMate(){
    numPasses++;
    System.out.println(" Mate was passed along with the current count");
  }

  //fullconstructor
  public YerbaMate(String name, int ounces,double price, int brewTemp, int numPasses){
    super(name, ounces, price, brewTemp);
    this.numPasses = numPasses;
  }

  //refill method
  public void refill(int addedOunces){
   setOunces(getOunces() + addedOunces) ;
    
  }

  @Override //equals
  public boolean equals (Object obj){
     if (obj == this){
       return true;
     }
    if (obj.getClass() != YerbaMate.class){
      return false;
    }
    YerbaMate other = (YerbaMate)obj;
    return getName().equals(other.getName()) &&
      getOunces() == other.getOunces() &&
      getPrice() == other.getPrice() &&
      //getBrewTemp() == other.getBrewTemp() &&
      numPasses == other.numPasses ;
      
  }
  

@Override //tostring
  public String toString(){
  return String.format("Yerba Mate: %s, %d ounces , brewed %d C, $%.2f, %d passes so far ", getName(), getOunces(), getPrice(), numPasses);
  }




  
} 