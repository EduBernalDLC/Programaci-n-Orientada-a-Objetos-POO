from car import Car #Importamos el elemento
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")

    car=Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))
    
    
    
