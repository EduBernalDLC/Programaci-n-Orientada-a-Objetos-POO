<?php

    class Car{
        public $id;
        public $license;
        public $driver;
        public $passenger;

        public function __constructor($license, $driver){
            $this->license= $license;
            $this->driver= $driver;
        }//Fin función constructor

        public function printDataCar(){
            echo 'License: ' .$this->license . ' Name Driver: ' . $this->driver->name;
        }//Fin función printDataCar
    }//Fin clase car

?>