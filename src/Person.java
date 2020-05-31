import java.util.Arrays;

public class Person implements Comparable<Person> {

    private int age;

    public static void SortName(Person[] person) {
        Arrays.sort(person);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    Person (){};
    Person (int age, String name){
        this.age = age;
        this.name = name;
    };

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setPerson(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public static  void SortAge(Person pers[]){
        int temp = 0;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;

            for (int i = 1; i < pers.length; i++) {
                if (pers[i].getAge() < pers[i - 1].getAge()) {
                    temp = pers[i].getAge();
                    pers[i].setAge(pers[i - 1].getAge());
                    pers[i - 1].setAge(temp);
                    needIteration = true;
                }
            }
        }

    }

    static void PrintPerson(Person pers[]){
        for (int i = 1; i < pers.length ; i++) {
            System.out.println("Возраст: " + pers[i].age + " " + "Имя: " + pers[i].name + ".");
        }
    }




    @Override
    public int compareTo(Person comparePerson) {
        String compareName = ((Person) comparePerson).getName();

        return this.getName().compareTo(comparePerson.getName());
    }
}
