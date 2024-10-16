# PruebaTecnicaEBC
Prueba tecnica para crear los metodos para una secuencia Collatz y Fizzbuzz

Para utilizar los metodos es necesario levantar los servicios en SpringBoot o uno similar.
1- EL primer servicio en levantarse es el de DiscoveryServer
2- Se levanta Collatz
3- Se levanta FizzBuzz
4- Se levanta APIGateway

Se utilizo Postman para las pruebas, pero se puede utilizar el navegador.
5- En el navegador se ingresa las siguientes rutas dependiendo que metodo deseas usar:
  Collatz: 
    Secundario: htpp://localhost:8020/secuence/collatz/n  -> n: es el entero que desea usar con el metodo
    Principal: http://localhost:8021/api/n -> n: es el numero entero que desea usar con el metodo
  FizzBuzz: 
    Principal: htpp://localhost:2021/api/fizzbuzz/n  -> n: es el numero que deseas usar con el metodo
