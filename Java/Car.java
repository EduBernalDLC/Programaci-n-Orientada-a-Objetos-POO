class Car{
    Integer id;
    String license;
    Account driver;
    Integer passegenger;

    public Car(String license, Account driver){//Dentro del paréntesis parametros obligatorios para crear un objeto del tipo car

        this.license= license;
        this.driver= driver;
    }//Fin car public (Método constructor)

    void printDataCar(){
        System.out.println("License: " + license);
        System.out.println("name Driver: " + driver.name);
    }//Fin void
}//fin clase