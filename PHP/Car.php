<?php
require_once('account.php')

    class Car{
        public $id;
        public $license;
        public $driver;
        public $passenger;

        public function __construct($license, $driver){
            $this->license= $license;
            $this->driver= $driver;
        }//Fin función constructor

        public function printDataCar(){
            echo "Licencia: $this->license Driver: " . $this->driver->name;
        }//Fin función printDataCar
    }//Fin clase car

?>