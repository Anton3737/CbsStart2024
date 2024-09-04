package javaEssential.lesson_08.task2_3_4;

public class Main {
    public static void main(String[] args) {

        Device[] devices = new Device[10];

        devices[0] = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        devices[1] = new Monitor("LG", 150, "CD2345678EF", 1920, 1080);
        devices[2] = new Monitor("Dell", 200, "EF3456789GH", 2560, 1440);
        devices[3] = new EthernetAdapter("Intel", 80, "GH4567890IJ", 1000, "00:1A:2B:3C:4D:5E");
        devices[4] = new EthernetAdapter("Broadcom", 90, "IJ5678901KL", 100, "01:2B:3C:4D:5E:6F");
        devices[5] = new Monitor("Acer", 110, "KL6789012MN", 1440, 900);
        devices[6] = new Monitor("Asus", 130, "MN7890123OP", 1600, 1200);
        devices[7] = new EthernetAdapter("Realtek", 70, "OP8901234QR", 1000, "12:34:56:78:9A:BC");
        devices[8] = new EthernetAdapter("Qualcomm", 85, "QR9012345ST", 100, "23:45:67:89:AB:CD");
        devices[9] = new Monitor("HP", 140, "ST0123456UV", 2560, 1080);

        for (Device device : devices) {
            System.out.println(device);
        }
    }
}
