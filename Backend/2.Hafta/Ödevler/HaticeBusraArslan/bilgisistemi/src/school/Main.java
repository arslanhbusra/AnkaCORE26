package school;

import school.model.Student;
import school.service.StudentService;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();

        int choice;

        while(true)
        {
            service.showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.print("Ad: ");
                    String name = scanner.nextLine();

                    System.out.print("Numara: ");
                    String number = scanner.nextLine();

                    System.out.print("1. Not: ");
                    double n1 = (double) scanner.nextInt();

                    System.out.print("2. Not: ");
                    double n2 = (double) scanner.nextInt();

                    System.out.println("3. Not: ");
                    double n3 = (double) scanner.nextInt();

                    Student s = new Student(name, number, n1, n2, n3);
                    service.addStudent(s);
                    break;

                case 2:
                    service.listStudents();
                    break;

                case 3:
                    service.findBestStudent();
                    break;

                case 4:
                    System.out.println("Programdan çıkılıyoır..");
                    scanner.close();
                    return;

                default:
                    System.out.println("Geçersiz seçim!");
                    continue;
            }
        }
    }
}
