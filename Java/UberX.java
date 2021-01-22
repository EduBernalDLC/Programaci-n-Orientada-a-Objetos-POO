class UberX extends Car{
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){//Esto es un constructor
        super(license, driver);

        this.brand= brand;
        this.model= model;
    }//Fin public UberX
}//Fin herencia