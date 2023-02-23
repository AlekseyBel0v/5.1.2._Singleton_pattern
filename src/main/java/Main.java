import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Integer N = null, M = null, f = null;
        logger.log("Запускаем программу.");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите два числа: размер списка N и верхнюю границу значений элементов в списке M");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());
            M = Integer.parseInt(br.readLine());
            logger.log("Просим пользователя ввести входные данные для фильтрации");
            System.out.println("Введите число f для фильтрации списка");
            f = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>(N);
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            list.add(random.nextInt(M+1));
        }
        System.out.println("Вот случайный список: " + list);
        Filter filter = new Filter(f);
        List<Integer> result = filter.filterOut(list);
        logger.log("Прошло фильтр " + result.size() +" элемента из " + list.size());
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");
    }
}