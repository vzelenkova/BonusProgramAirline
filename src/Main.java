public class Main {
    public static void main(String[] args) {
        // Задаем стоимость билета
        int ticketPrice = 13676; // Можно изменить на любое значение

        // Количество рублей для одной бонусной мили
        int milesPerRuble = 20;

        // Рассчитываем количество бонусных миль
        int bonusMiles = ticketPrice / milesPerRuble;

        // Выводим результат
        System.out.println("Начисленные мили: " + bonusMiles);
    }
}