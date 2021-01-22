class UberVan extends Car{
    Map<String, ArrayList<String, Integer>> typeCarAccepted;
    ArrayList<String> seatMaterial;

    String model;

    public UberVan(String license, Account driver,
    Map<String, ArrayList<String, Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){//Esto es un constructor

        super(license, driver);

        this.typeCarAccepted= typeCarAccepted;
        this.seatsMaterial= seatsMaterial;
        
    }//Fin public UberVan
}//Fin herencia