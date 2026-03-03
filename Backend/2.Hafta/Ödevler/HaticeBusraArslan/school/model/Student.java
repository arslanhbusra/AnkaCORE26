package school.model;

public class Student
{

    private String name;
    private String number;
    private double note1;
    private double note2;
    private double note3;

    public Student(String name, String number, double note1, double note2, double note3)
    {
        this.name = name;
        this.number = number;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
    }

    public double calculateAverage()
    {
        return (note1 + note2 + note3) / 3;
    }

    public double calculateAverage(double extraPoint)
    {
        return ((note1 + note2 + note3) / 3) + extraPoint;
    }

    public String getStatus()
    {
        if (calculateAverage() >= 50) {
            return "Geçti";
        } else {
            return "Kaldı";
        }
    }

    public String getName()
    {
        return name;
    }

    public String getNumber()
    {
        return number;
    }

    public double getNote1()
    {
        return note1;
    }

    public double getNote2()
    {
        return note2;
    }

    public double getNote3()
    {
        return note3;
    }
}
