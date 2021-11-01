
public class People {
    private int age;
    private String name;
    private PeopleMark peopleMark;

    public People(int age, String name, PeopleMark peopleMark) {
        this.age = age;
        this.name = name;
        this.peopleMark = peopleMark;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nИмя: " + name + "\nВозраст: " + age + "\nОценка: " +
                "\nОценка учителя: " + peopleMark;
    }

    public PeopleMark getPeopleMark() {
        return peopleMark;
    }

    public void setPeopleMark(PeopleMark peopleMark) {
        this.peopleMark = peopleMark;
    }
}