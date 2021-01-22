class UberPool extends Car{
    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model){//Esto es un constructor
        super(license, driver);

        this.brand= brand;
        this.model= model;
    }//Fin public UberPool
}//Fin herencia