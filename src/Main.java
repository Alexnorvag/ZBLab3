import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by norvag on 25.05.2016.
 * Customer: id, Фамилия, Имя, Отчество,
 * Адрес, Номер кредитной карточки,
 * Номер банковского счета.
 * Создать массив объектов. Вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей,
 * у которых номер кредитной карточки находится в заданном интервале.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstName;
        String name;
        String secondName;
        String address;
        int numberOfCard;

        System.out.print("Количество покупателей: ");
        int numOfCustomers = Integer.parseInt(reader.readLine());
        Customer[] customers = new Customer[numOfCustomers];

        for (int i = 0; i < customers.length; i++) {
            System.out.print("Фамилия: ");
            firstName = reader.readLine();
            System.out.print("Имя: ");
            name = reader.readLine();
            System.out.print("Отчество: ");
            secondName = reader.readLine();
            System.out.print("Адрес: ");
            address = reader.readLine();
            System.out.print("Номер банковского счёта: ");
            numberOfCard = Integer.parseInt(reader.readLine());
            System.out.println();
            customers[i] = new Customer(i + 1, firstName, name, secondName, address, numberOfCard);
        }


        for (int i = 0; i < customers.length - 1; i++) {
            for (int j = 0; j < customers.length - i - 1; j++) {
                if (customers[j].getName().compareTo(customers[j + 1].getName()) > 1) {
                    Customer tmp = customers[j];
                    customers[j] = customers[j + 1];
                    customers[j + 1] = tmp;
                }
            }
        }

        System.out.println("a) список покупателей в алфавитном порядке:");
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i].toString());
        }

        System.out.println("Задайте интервал, для поиска банковского счёта:\nОт: ");
        int left = Integer.parseInt(reader.readLine());
        System.out.print("До: ");
        int right = Integer.parseInt(reader.readLine());
        System.out.println("b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.");
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getNumberOfCard() >= left && customers[i].getNumberOfCard() <= right){
                System.out.println(customers[i].toString());
            }
        }
    }
}
