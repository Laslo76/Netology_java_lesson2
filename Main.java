import java.util.Scanner;
import ru.netology.services.CustomServices;

class Main {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();

        int result = CustomServices.feeCalc(price, weight);
        System.out.print("Размер пошлины (в руб.) составит: " + result);
    }
}