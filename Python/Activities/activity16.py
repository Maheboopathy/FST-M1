#creating a class car
class Car:
    'This represents a class car'

    def __init__(self, manufacturer,model,make,transmission,colour):
        self.manufacturer = manufacturer,
        self.model = model,
        self.make = make,
        self.transmission = transmission,
        self.colour = colour
    def accelerate(self):
        print(self.manufacturer, " ",  self.model, " ",  "has started moving")
    def stop(self):
        print(self.manufacturer, " ", self.model, " ",  "has stopped moving")
    
car1 = Car("Toyota", "Corolla", "2015", "Manual", "White")
car2 = Car("Maruti", "800", "2013", "Manual", "Red")
car3 = Car("Suzuki", "Swift", "2017", "Automatic", "Black")

car1.accelerate()
car1.stop()
