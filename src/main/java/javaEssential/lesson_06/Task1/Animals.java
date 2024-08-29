package javaEssential.lesson_06.Task1;

public enum Animals {
    LION(12), PANTHER(7), GEPARD(9), ELEPHANT(23), JIRAFFE(18), RACOON(1), ZEBRA(3), RINO(21), BEAR(27), CAPYBARA(4);
    int age;

    Animals(int age) {
        this.age = age;
    }



    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Тварикнка із зоопарку:" +
                " вік тварини: " + age + " років / рік ," + " з іменем " + name().toUpperCase();
    }


}
