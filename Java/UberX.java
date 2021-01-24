class UberX extends Car{
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){//Esto es un constructor
        super(license, driver);

        this.brand= brand;
        this.model= model;
    }//Fin public UberX

    void printDataCar(){
        super.printDataCar();

        if(passegenger != null){
            System.out.println("License: " + license);
            System.out.println("name Driver: " + driver.name);
            System.out.println("Model: " + model);
            System.out.println("Brand: " + brand);
        }//Fin if
    }//Fin void

}//Fin herencia