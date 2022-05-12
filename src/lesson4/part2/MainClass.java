package lesson4.part2;

public class MainClass {
    public static void main(String[] args){
        System.out.println("Создаем список контактов");
        Phonebook phonebook = new Phonebook();
        System.out.println("-----------------");

        System.out.println("Добавляем в справочник");
        phonebook.add("Андрей", "8 775 777 88 99");
        phonebook.add("Андрей", "8 701 888 77 99");
        phonebook.add("Станислав", "8 702 555 66 44");
        phonebook.add("Сергей", "8 700 111 33 22");
        phonebook.add("Андрей", "8 705 555 77 44");
        System.out.println("-----------------");

        System.out.println("Получаем номера");
        System.out.println("Андрей");
        System.out.println(phonebook.get("Андрей"));
        System.out.println("Станислав");
        System.out.println(phonebook.get("Станислав"));
        System.out.println("Сергей");
        System.out.println(phonebook.get("Сергей"));
        System.out.println("-----------------");

        System.out.println("Случай отсутствия контакта");
        System.out.println("Александр");
        System.out.println(phonebook.get("Александр"));
        System.out.println("-----------------");

        System.out.println("Пробуем записать существующий номер");
        phonebook.add("Андрей", "8 775 777 88 99");
        System.out.println("Андрей");
        System.out.println(phonebook.get("Андрей"));
    }
}
