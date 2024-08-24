package javaEssential.lesson_03.Task_04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть ключ доступу:");
        String inputKey = sc.next();

        if (inputKey.equals("user")) {
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();
        }
        if (inputKey.equals("pro")) {
            DocumentWorker PROdocumentWorker = new ProDocumentWorker();
            PROdocumentWorker.openDocument();
            PROdocumentWorker.editDocument();
            PROdocumentWorker.saveDocument();
        }
        if (inputKey.equals("exp")) {
            DocumentWorker EXPdocumentWorker = new ExpertDocumentWorker();
            EXPdocumentWorker.openDocument();
            EXPdocumentWorker.editDocument();
            EXPdocumentWorker.saveDocument();
        }
    }
}
