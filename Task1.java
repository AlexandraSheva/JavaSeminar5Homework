import java.util.ArrayList;
import java.util.List;

/**
 * Task1. Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
их необходимо считать, как одного человека с разными телефонами. 
Вывод должен быть отсортирован по убыванию числа телефонов.

+790000000000 Петров
+791111111111 Иванов
+790000000001 Иванов
+790000020202 Сидоров
+792020202020 Петров
+793474832974 Логвиненко
+793287438757 Симутенко
+793274374387 Петров
 */

public class Task1 {

  public static void main(String[] args) {
    task2();

  }

  static void task1(){
    PhoneBook phoneBook = new PhoneBook();
    phoneBook.add("+790000000000", "Петров");
    phoneBook.add("+791111111111", "Иванов");
    phoneBook.add("+790000000001", "Иванов");
    phoneBook.add("+790000020202", "Сидоров");
    phoneBook.add("+792020202020", "Петров");
    phoneBook.add("+793474832974", "Логвиненко");
    phoneBook.add("+793287438757", "Симутенко");
    phoneBook.add("+793274374387", "Петров");

    System.out.println(phoneBook.getAll());

  }

  static void task2(){
    PhonesBook phoneBook = new PhonesBook();
    phoneBook.add("Петров", List.of ("+790000000000", "+792020202020","+793274374387"));
    phoneBook.add("Иванов", List.of("+791111111111","+790000000001"));
    phoneBook.add("Сидоров", List.of("+790000020202"));
    phoneBook.add("Логвиненко", List.of("+793474832974"));
    phoneBook.add("Симутенко", List.of ("+793287438757"));
    

    System.out.println(phoneBook.getAll());

  }

}