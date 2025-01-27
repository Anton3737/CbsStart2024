package JDBC_Hibernate.HW3;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();


        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal(1, 5, "Лев", true));
        animalList.add(new Animal(2, 3, "Слон", true));
        animalList.add(new Animal(3, 2, "Кролик", false));
        animalList.add(new Animal(4, 8, "Тигр", true));
        animalList.add(new Animal(5, 6, "Панда", false));
        animalList.add(new Animal(6, 4, "Кенгуру", true));
        animalList.add(new Animal(7, 1, "Пінгвін", false));
        animalList.add(new Animal(8, 7, "Гепард", true));
        animalList.add(new Animal(9, 10, "Жираф", true));
        animalList.add(new Animal(10, 12, "Зебра", true));

        session.beginTransaction();
        for (int i = 0; i < animalList.size(); i++) {
            session.persist(animalList.get(i));
            System.out.println("Oб'єкт " + i + " додано");
        }
        session.getTransaction().commit();
        session.close();


    }
}
