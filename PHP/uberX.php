<?php

    class UberX extends Car{
        public $brand;
        public $model;

        public function __construct($license, $driver, $brand, $model){

            parent::__construct($license, $driver);//Esto equivale al súper de Java

            $this->brand= $brand;
            $this->model= $model;
        }//Fin función constructor

    }//Fin herencia

?>