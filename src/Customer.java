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
public class Customer {
    private int id;
    private String firstName;
    private String name;
    private String secondName;
    private String address;
    private int numberOfCard;

    public Customer(int id, String firstName, String name, String secondName, String address, int numberOfCard) {
        this.id = id;
        this.firstName = firstName;
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        this.numberOfCard = numberOfCard;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", address='" + address + '\'' +
                ", numberOfCard=" + numberOfCard +
                '}';
    }

    public String getName() {
        return firstName + name + secondName;
    }

    public int getNumberOfCard() {
        return numberOfCard;
    }
}
