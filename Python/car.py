from account import Account #Importante importar la clase para poder usarla

class Car:
    id= int
    license= str
    driver= Account("", "")
    passengenger= int

    def __init__(self, license, driver):
        self.license= license
        self.driver= driver
