package javaEssential.lesson_03.task_02;

public class ClassRoom {

    Pupil[] pupils = new Pupil[8];

    public ClassRoom(Pupil p1, Pupil p2, Pupil p3, Pupil p4, Pupil p5, Pupil p6, Pupil p7, Pupil p8) {

        pupils[0] = p1;
        pupils[1] = p2;
        pupils[2] = p3;
        pupils[3] = p4;
        pupils[4] = p5;
        pupils[5] = p6;
        pupils[6] = p7;
        pupils[7] = p8;

    }

    public void show() {
        for (Pupil pups : pupils) {
            System.out.println(pups);
        }
    }

    public static void main(String[] args) {
        Pupil Yurii = new BadPupil("Юрій", "Корсун", 15, "Київ");
        Pupil Eugen = new GoodPupil("Євгеній", "Бойко", 14, "Одеса");
        Pupil Oksana = new ExcelentPupil("Оксана", "Іванова", 12, "Кривий Ріг");
        Pupil Angelina = new Pupil("Ангеліна", "Морозова", 13, "Суми");
        Pupil Dmytro = new ExcelentPupil("Дмитро", "Коваленко", 16, "Львів");
        Pupil Alina = new GoodPupil("Аліна", "Шевченко", 14, "Харків");
        Pupil Serhii = new BadPupil("Сергій", "Петренко", 15, "Дніпро");
        Pupil Maria = new Pupil("Марія", "Захарова", 13, "Запоріжжя");

        ClassRoom classRoom = new ClassRoom(Yurii, Eugen, Oksana, Angelina, Dmytro, Alina, Serhii, Maria);

        System.out.println("ClassRoom :");
        classRoom.show();



    }
}
