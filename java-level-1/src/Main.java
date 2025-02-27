public class Main {
    public static void main(String[] args) {
        Car Celta = new Car("Celta", 2007);
        System.out.println(
                Celta.nome + " " +
                        Celta.ano
        );
        Celta.andar();
    }
}