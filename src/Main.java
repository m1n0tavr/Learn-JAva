

public class Main {


    public static void main(String[] args) {
        Person[] person = new Person[10];
        person[0] = new Person (25, "Олег");
        person[1] = new Person (12, "Настя");
        person[2] = new Person (21, "Сергей");
        person[3] = new Person (10, "Валя");
        person[4] = new Person (45, "Саня");
        person[5] = new Person (15, "Алекс");
        person[6] = new Person (50, "Никита");
        person[7] = new Person (2, "Ольга");
        person[8] = new Person (99, "Кир");
        person[9] = new Person (12, "Наташа");
//        person[8].setPerson(99, "Кир");
//        person[9].setPerson(12, "Наташа");

//        System.out.println("Сортируем по возрасту:");
//        Person.SortAge(person);
//        Person.PrintPerson(person);
        System.out.println("-------------------------------------------------");
        System.out.println("Сортируем по имени:");
        Person.SortName(person);
        Person.PrintPerson(person);


    }
}
