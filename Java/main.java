class main{
    public static void main(String[] args) {

        System.out.println("Hola mundo");

        Car car= new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        car.passegenger= 4;
        car.printDataCar();

        Car2 car2= new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
        car2.passegenger= 3;
        car2.printDataCar();

    }//Fin main
}//Fin clase 