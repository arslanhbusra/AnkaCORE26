package school.service;

import school.model.Student;

public class StudentService
{

    Student[] students = new Student[100];
    int count = 0;

    public void addStudent(Student s)
    {
        if (count < students.length)
        {
            students[count] = s;
            count++;
            System.out.println("Öğrenci başarıyla eklendi.");
        }
        else
        {
            System.out.println("Kapasite dolu!");
        }
    }

    public void listStudents()
    {
        if (count == 0)
        {
            System.out.println("Henüz öğrenci yok.");
            return;
        }

        for (Student s : students)
        {
            if (s == null) continue;

            System.out.println("--------------------");
            System.out.println("Ad: " + s.getName());
            System.out.println("No: " + s.getNumber());
            System.out.println("Ortalama: " + s.calculateAverage());
            System.out.println("Durum: " + s.getStatus());
        }
    }

    public void findBestStudent()
    {
        if(count == 0)
        {
            System.out.println("Öğrenci yok.");
            return;
        }

        Student best = students[0];

        for (int i = 1; i < count; i++)
        {
            if (students[i].calculateAverage() > best.calculateAverage())
            {
                best = students[i];
            }
        }
        System.out.println("En Başarılı Öğrenci:");
        System.out.println("Ad: " +best.getName());
        System.out.println("Ortalama: " + best.calculateAverage());
    }

    public void showMenu()
    {
        System.out.println("-ÖĞRENCİ NOT SİSTEMİ-");
        System.out.println("1) Öğrenci Ekle");
        System.out.println("2) Öğrencileri Listele");
        System.out.println("3) En Başarılı Öğrenciyi Göster");
        System.out.println("4) Çıkış");
        System.out.print("Seçiminiz: ");
    }
}

