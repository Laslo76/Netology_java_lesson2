import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import ru.netolgy.services.CustomServices;

public class feeCalculation {

    public void main(String[] args) throws java.io.UnsupportedEncodingException {
        PrintStream ps = new PrintStream(System.out, true, StandardCharsets.UTF_8);
        Scanner scanner = new Scanner(System.in);

        ps.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();

        ps.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();

        int result = CustomServices.feeCalc(price, weight);
        ps.print("Размер пошлины (в руб.) составит: " + result);
    }
}
