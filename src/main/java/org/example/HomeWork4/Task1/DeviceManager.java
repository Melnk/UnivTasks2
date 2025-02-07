package org.example.HomeWork4.Task1;

// Главный класс с методом main
public class DeviceManager {
    public static void main(String[] args) {
        // Создание массива устройств с восходящим преобразованием
        Device[] devices = {
                new Computer("Gaming PC", DeviceStatus.OFF, "Windows 11"),
                new Smartphone("Samsung Galaxy", DeviceStatus.OFF, "Verizon")
        };

        // Демонстрация работы полиморфизма
        for (Device device : devices) {
            device.turnOn(); // Вызывает переопределенные методы в дочерних классах
            device.performFunction(); // Выполняет уникальную логику каждого устройства
            System.out.println();
        }
    }
}
