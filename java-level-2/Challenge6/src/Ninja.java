public class Ninja {
    public static void main(String[] args) {
        Ninja naruto = new Ninja("Naruto", 19, "Vila Oculta da Folha");
        System.out.println(naruto);
    }
    private String name;
    private int age;
    private String village;

    public Ninja(String name, int age, String village) {
        this.name = name;
        this.age = age;
        this.village = village;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }
}