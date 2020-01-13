package javanizdrugi;

import java.util.Scanner;

public class JavaNizDrugi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student[] s = new Student[5];
        for (int i = 0; i < s.length; i++) {
            System.out.println("Unesite studenta");
            s[i] = new Student(input.nextLine());
            // s[i] = input.next();
        }
        /*for(int brojac:a)
            System.out.println(brojac);
        System.out.println(" ");
         */
        Student[] s2 = s;
        for (Student brojac : s2) {
            System.out.println(brojac + " ");
        }

        for (Student brojac : s) {
            System.out.println(brojac + " ");

        }
        s = new Student[10];
        for (int i = 0; i < s2.length; i++) {
            s[i] = s2[i];
            System.out.println();
        }
        // ispis niza s
        for (Student brojac : s) {
            System.out.println(brojac + " ");
        }
        System.out.println();
        for (int i = 0; i < s.length; i++) {
            if (s[1] == null) {
                System.out.println("Unesite studenta");
            }
            s[i] = new Student(input.nextLine());
        }
        // sortiranje
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {

                if (s[i].getIme().compareTo(s[j].getIme()) > 0) {

                    Student pom = s[i];
                    s[i] = s[j];
                    s[j] = pom;

                }
            }
            // ispis niza
            System.out.println();
            for (Student brojac : s) {
                System.out.println(brojac + " ");

            }

        }
    }

}

class Student {

    private String ime;

    public Student() {
    }

    public Student(String ime) {
        this.ime = ime;
    }

    public String toString() {
        return ime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

}
