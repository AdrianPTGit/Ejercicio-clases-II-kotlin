package Enunciadoo2
/*
* Modela un sistema que gestione una colección de vehículos:  Coches y Motos.
 Se deberá guardar la marca ,el modelo y matrícula de los vehículos que se gestionen.

 tendrá un método para calcular el coste de mantenimiento del vehículo , que será
 diferente según el tipo de vehículo que se trate.*/
abstract class Vehiculo(val marca : String, val modelo : String, val matricula : String) {

    //método para calcular el coste de mantenimiento del vehículo

    abstract fun vocosteMantenimientoVehiculo()


}