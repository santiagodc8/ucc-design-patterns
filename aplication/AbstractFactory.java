// Interfaz AbstractFactory para Vehículos y Sensores
interface AbstractFactory {
    Vehiculo crearVehiculo(String id);
    Sensor crearSensor(String id, String type);
}