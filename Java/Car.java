class Car{
    Integer id;
    String license;
    Account driver;
    private Integer passegenger;

    public Car(String license, Account driver){//Dentro del paréntesis parametros obligatorios para crear un objeto del tipo car

        this.license= license;
        this.driver= driver;
    }//Fin car public (Método constructor)

    void printDataCar(){

        if(passegenger != null){
            System.out.println("License: " + license);
            System.out.println("name Driver: " + driver.name);
        }//Fin if
    }//Fin void

    public Integer getPassenger(){
        return passegenger;
    }//Fin getPassenger
    
    public void setPassenger(Integer passegenger){
        if(getPassenger == 4){
            this.passegenger= getPassenger;
        }
        else{
            System.out.Println("Necesitas asignar 4 pasajeros");
        }//Fin if else
        
    }//Fin setPassenger

}//fin clase