package by.behlard.j18.lessons.lesson6.inherit;

public class EqualityExample {
    public static void main(String[] args) {

        Person person1 = new Person("Ivan", 20, 100);
        Person person2 = new Person("Ivan", 20, 70);
        Person person3 = person1;

        System.out.println(person1 == person2);
        System.out.println(person1 == person3);

        System.out.println("equals: " + person1.equals(person2));

    }
}
