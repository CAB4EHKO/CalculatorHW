package pro.sky.skyprocalculatorhw;

public class User {
    private String name;
    private int age;
    private String profession;

    public User(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "<br>Возраст: " + age + "<br>Профессия: " + profession;
    }
}
