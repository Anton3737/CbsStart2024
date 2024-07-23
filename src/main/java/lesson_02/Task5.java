package lesson_02;

public class Task5 {
    public static void main(String[] args) {

//        byte numbByte = 99999;
//
//        System.out.println(numbByte);

        System.err.println("java: incompatible types: possible lossy conversion from int to byte");
        System.out.println(" Вище вказана помилка при вказання значення 99999 для типу даних byte означає що тип даних byte не може містити в собі значення що перевищує його байтовий вміст \n " +
                "що має діапазон від -128 до + 127 ");

        System.out.println("-".repeat(100));

        byte numbByteCast = (byte) 99999;
        System.out.println("Якщо виконати явний кастинг до типу данних byte то поведінка зміниться , а саме так що число 99999 пройде по діапазону byte (-128 до + 127) стільки разів скільки вказано \n" +
                " скіль ми вказали в його значенні тобто в результаті ми отримаємо число що вміщується в діапазоні типу byte");

        System.out.println(numbByteCast);

    }
}
