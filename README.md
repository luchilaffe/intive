#Exercise
```
## Context
A company rents bikes under following options:

1. Rental by hour, charging $5 per hour
2. Rental by day, charging $20 a day
3. Rental by week, changing $60 a week
4. Family Rental, is a promotion that can include from 3 to 5 Rentals (of any type) with a discount of 30% of the total price

## Assigment:
1. Implement a set of classes to model this domain and logic
2. Add automated tests to ensure a coverage over 85%
3. Use GitHub to store and version your code
4. Apply all the recommended practices you would use in a real project
5. Add a README.md file to the root of your repository to explain: your design, the development practices you applied and how run the tests.

Note: we don't expect any kind of application, just a set of classes with its automated tests.

## Deliverables:
The link to your repository 
```

# Explanation
## Design
By reading the statement does not speak of customers but it is assumed that to have a bike rental there must be a customer. So, we have bikes, customers and bikeRental.

Customers and Bicycles were modeled because they are necessary to rent bikes.

There are 3 packages, which contain:
1. the tests,
2. the data models (Customers and Bicycles), and
3. bike rental.


## Customer Class
 1. Attributes
    * name
    * address
 2. Methods
    * Customer (aName)
    * Customer (aName, anAddress)
    * addAddress (anAddress)
    * getName (): String
    * getAddress (): String
    
Customer must have at least one name, and may have an address.

## Bike Class
1. Attributes
    * rented
2. Methods
    * Bike ()
    * rent (): boolean
    * returnRented ()
    * isFree (): boolean

The bike only has one state, rented or free.

## BikeRental Class
1. Attributes
    * customer
    * rentedBikes
    * numberOfPeriods
    * period
    * discount
    * subTotalCost
2. Methods
    * BikeRental (aCustomer, aPeriod, aNumberOfPeriod, bikes)
    * getTotalCost: float
    * calculateCost: float
    * calculateDiscount: float


To rent bikes, you need to specify a customer, a period of time (hour, day or week), the number of periods of time to be rented, and the bikes that you wish to rent.

The BikeRental class calculate the total cost that the client must pay, and also the discount that could correspond.

It was developed in Eclipse.

##Test
Tests were performed with JUnit5, yielding all positive results.










#Explicación
##Diseño
Por la lectura del enunciado no habla de clientes, pero se asume que para haber un alquiler de bicicletas debe existir un cliente. 

Hay 3 paquetes, que contienen: 
1. los test, 
2. los modelos de datos (Clientes y Bicicletas), y 
3. el alquiler de bicicletas.

Se modelaron dos objetos, Clientes y Bicicletas, que son los necesarios para poder realizar un alquiler.


## Clase Customer
1. Atributos
    * name
    * address
2. Métodos
    * Customer (aName)
    * Customer (aName, anAddress)
    * addAddress (anAddress)
    * getName(): String
    * getAddress(): String
 
El cliente debe tener al menos un nombre, y puede tener una dirección.

## Clase Bike
1. Atributos
    * rented 
2. Métodos
    * Bike()
    * rent(): boolean
    * returnRented()
    * isFree(): boolean

La bicicleta sólo tiene un estado, alquilado o libre.

## Clase BikeRental
1. Atributos
    * customer
    * rentedBikes
    * numberOfPeriods
    * period
    * discount
    * subTotalCost
2. Métodos
    * BikeRental(aCustomer, aPeriod, aNumberOfPeriod, bikes)
    * getTotalCost: float
    * calculateCost: float
    * calculateDiscount: float 
 
Para tener un nuevo alquiler, se necesita especificar un cliente, un período de tiempo (hora, dia o semana), la cantidad de periodos de tiempo que se alquila, y la bicicletas que se desean alquilar.

La clase BikeRental se encarga de calcular el costo total que debe pagar el cliente, y también el descuento que le podría corresponder. 

Se desarrolló en Eclipse. 

##Test 
Los Test se realizaron con JUnit5 arrojando todos resultados positivo.