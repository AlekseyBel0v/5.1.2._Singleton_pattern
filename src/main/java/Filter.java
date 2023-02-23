import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    private int f;

    public Filter(int f) {
        this.f = f;
    }

    List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");
        return list.stream().filter(x -> {
            if (x > f || x.equals(f)) {
                logger.log("Элемент \"" + x + "\" не проходит");
            }
            return x < f ;
        }).collect(Collectors.toList());
    }
}
