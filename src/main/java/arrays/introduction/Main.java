package arrays.introduction;

public class Main {

    public static void main(String[] args) {

        DVD avengers = new DVD("Avengers","Film about heroes", 1995);
        DVD batmen = new DVD("Batmen","One more hero", 2000);
        DVD harryPotter = new DVD("Harry Potter", "guy killing everyone with wooden stick", 2010);

        DVD[] dvds = new DVD[15];
        dvds[0] = avengers;
        dvds[1] = batmen;
        dvds[2] = harryPotter;

        for(int i = 0; i < dvds.length; i++) {
            System.out.println(dvds[i]);
        }

        for(DVD d : dvds) {
            System.out.println(d);
        }
    }
}

class DVD {

    private String name;
    private String description;
    private int year;

    public DVD(String name, String description, int year) {
        this.name = name;
        this.description = description;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                '}';
    }
}
