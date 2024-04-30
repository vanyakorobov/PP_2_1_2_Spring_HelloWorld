public class Cat {
    private String name;
    private int age;
    private String color;

    public Cat() {
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Геттеры и сеттеры для поля age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Геттеры и сеттеры для поля color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
