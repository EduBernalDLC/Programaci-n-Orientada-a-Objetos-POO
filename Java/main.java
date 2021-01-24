class main{
    public static void main(String[] args) {

        System.out.println("Hola mundo");

        UberX uberX= new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        uberX.setPassenger(4);
        uberX.printDataCar();

        Car2 car2= new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
        car2.passegenger= 3;
        car2.printDataCar();

    }//Fin main
}//Fin clase 