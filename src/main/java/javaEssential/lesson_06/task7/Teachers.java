package javaEssential.lesson_06.task7;

import java.util.ArrayList;

public class Teachers {
    public static void main(String[] args) {

        ArrayList<String> teachersArrayList = new ArrayList<>();
        teachersArrayList.add("Тетяна Петрівна - Література");
        teachersArrayList.add("Марія Феодосіївна - Фізика");
        teachersArrayList.add("Андрій Васильович - Історія");
        teachersArrayList.add("Оксана Іванівна - Англійська");
        teachersArrayList.add("Ігор Іванович - Фізкультура");
        teachersArrayList.add("Раїса Василівна - Іноземна Література");
        teachersArrayList.add("Марія Федорівна - Математика");
        teachersArrayList.add("Валентина Василівна - Українська мова");

        System.out.println("Кількість вчителів " + teachersArrayList.size());
        System.out.println(teachersArrayList);

        System.out.println();

        System.out.println("Індекс найкращого вчителя");
        System.out.println(teachersArrayList.indexOf("Валентина Василівна - Українська мова"));

        System.out.println();

        System.out.println("Індекс найгіршого вчителя");
        System.out.println(teachersArrayList.indexOf("Оксана Іванівна - Англійська"));

    }
}
