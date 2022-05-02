public class Main {
    public static void main(String[] args) {

        // переменные стоимости билета и количества рублей для одной бонусной милли
        int ticket = 10000;
        int every = 20;
        // Рассчет количество бонусных милль
        int miles = ticket / every;
        System.out.println(miles);
    }
}