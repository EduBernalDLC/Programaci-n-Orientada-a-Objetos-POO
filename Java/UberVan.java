class UberVan extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatMaterial;

    String model;
    private Integer passenger;

    public UberVan(String license, Account driver,
    Map<String, Map<String, Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){//Esto es un constructor

        super(license, driver);

        this.typeCarAccepted= typeCarAccepted;
        this.seatsMaterial= seatsMaterial;
    }//Fin public UberVan

    public UberVan(String license, Account driver){
        public(license, driver);
    }//Fin public UberVan

    public void setPassenger(Integer passegenger){
        super.setPassenger(getPassenger);

        if(getPassenger == 6){
            this.passenger= getPassenger;
        }
        else{
            System.out.Println("Necesitas asignar 6 pasajeros");
        }//Fin if else
    }//Fin setPassenger

}//Fin herencia