package task1;

public class Worker {
    String name;
    String position;
    int year;

    public Worker(String name, String position, int year) {
        this.name = name;
        this.position = position;
        this.year = year;
    }

    public Worker() {
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
