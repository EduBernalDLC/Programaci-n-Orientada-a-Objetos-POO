<?php

    require_once('car.php');
    require_once('account.php');

    $car= new Car('AWD123', new Account('Andres Herrera', 'AMS123'));
    $car->printDataCar();

?>