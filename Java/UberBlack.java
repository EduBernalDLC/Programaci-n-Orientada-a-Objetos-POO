class UberBlack extends Car{
    Map<String, ArrayList<String, Integer>> typeCarAccepted;
    ArrayList<String> seatMaterial;

    String model;

    public UberBlack(String license, Account driver,
    Map<String, ArrayList<String, Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){//Esto es un constructor

        super(license, driver);

        this.typeCarAccepted= typeCarAccepted;
        this.seatsMaterial= seatsMaterial;
        
    }//Fin public UberBlack
}//Fin herencia