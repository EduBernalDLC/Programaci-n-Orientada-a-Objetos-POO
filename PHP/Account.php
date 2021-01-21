<?php

    class Account{
        public $id;
        public $name;
        public $document;
        public $email;
        public $password;

        public function __constructor($name, $driver){
            $this->name= $name;
            $this->driver= $driver;  
        }//Fin función constructor
    }//Fin clase Account
?>

