package org.example;

public class Main {
    public static void main(String[] args) {
        Person murat = new Person("Murat", "Okcu", "Turkey", "FullStack Developer", 40000, 18);
        Person barbora = new Person("Barbora", "Brycyakova", "Slovakia", "Sculpture Student", 21400, 22);
        Person emre = new Person("Emre", "Ozdemir", "Turkey", "AI Masters Student", 0, 25);
        Person aneta = new Person("Aneta", "Rzonca", "Poland", "Hair Stylist", 30000, 30);

        Person[] arrPeople = {murat, barbora, emre, aneta};

        for (Person arrPerson : arrPeople) {
            System.out.println(arrPerson.getFirstName()+" | "+arrPerson.getLastName()+" | "+arrPerson.getAge()+" | çocuk mu? -> "+arrPerson.isTeen());
            System.out.println("---------------------------------------");
        }


        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());




    }
}
