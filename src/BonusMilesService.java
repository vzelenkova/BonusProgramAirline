public class BonusMilesService {
    public int calculate(int price) {
        int milesPerRuble = 20; // Количество рублей для одной бонусной мили
        return price / milesPerRuble; // Рассчитываем мили
    }
}