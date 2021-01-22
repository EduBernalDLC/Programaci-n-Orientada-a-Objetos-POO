<?php

    class Account{//Atributos
        public $id;
        public $name;
        public $document;
        public $email;
        public $password;

        public function __constructor($name, $driver){//Método constructor
            $this->name= $name;
            $this->driver= $driver;  
        }//Fin función constructor
    }//Fin clase Account
?>
