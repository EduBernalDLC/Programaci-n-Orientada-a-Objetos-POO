<?php

    require_once('Car.php');
    require_once('Account.php');

    $car= new Car('AWD123', new Account('Andres Herrera', 'AMS123'));
    $car->printDataCar();

?>