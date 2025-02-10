public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService(); // Создаем объект сервиса
        int price = 10_000; // Стоимость билета
        int miles = service.calculate(price); // Вызываем метод calculate
        System.out.println(miles); // Вывод результата
    }
}