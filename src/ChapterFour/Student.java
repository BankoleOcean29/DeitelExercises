package ChapterFour;

public class Student {
    private String name;
    private double average;

    public Student(String name, double average){
        this.name = name;

        if (average > 0.0 & average < 100.0)
            this.average = average;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        if (average > 0.0 & average < 100.0)
            this.average = average;
    }

}
