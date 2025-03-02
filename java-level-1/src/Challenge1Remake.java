import java.util.ArrayList;
import java.util.Scanner;

public class Challenge1Remake {
    public static void main(String[] args) {
        ArrayList<Ninja> listNinjas = new ArrayList<>();
        Scanner getnumberNinjas = new Scanner(System.in);
        System.out.println("Bem vindo ao lar dos arquivos da Aldeia da Folha\nQuantos ninjas deseja cadastrar as informações?");
        int numberofNinjas = getnumberNinjas.nextInt();
        createNinja(numberofNinjas, listNinjas);
    }
    static void createNinja(int numberofninjas, ArrayList<Ninja> listNinjas){
        Scanner getData = new Scanner(System.in);

        for (int i = 0; i < numberofninjas; i++) {
            System.out.println("NOME DO NINJA: ");
            String name = getData.nextLine();

            System.out.println("IDADE DO NINJA: ");
            int age = getData.nextInt();
            getData.nextLine();

            System.out.println("MISSÃO DO NINJA: ");
            String missionName = getData.nextLine();

            System.out.println("DIFICULDADE DA MISSÃO (apenas uma letra) (S, A, B, C, D): ");
            String missionLevel = getData.nextLine().toUpperCase();
            if (missionLevel.length() > 1) {
                    System.out.println("Você digitou mais de uma letra");
                    missionLevel = null;
                }
                missionDifficulty level = null;
                try {
                    level = missionDifficulty.valueOf(missionLevel);
                } catch (IllegalArgumentException vacilao) {
                    System.out.println("Você digitou uma dificuldade inexistente");
                }

            byte missionProgress;
                System.out.println("CONCLUSÃO (valor de 0-100): ");
                missionProgress = getData.nextByte();
                getData.nextLine();

            Ninja ninja = new Ninja(name, age, missionName, level, missionProgress);
            listNinjas.add(ninja);
            printDetails(ninja);
        }
        getData.close();
    }
    static void printDetails(Ninja ninja){
        System.out.println(
            "\n"+ "NINJA: " + ninja.getName()
            + "\nIDADE: " + ninja.getAge()
            + "\nMISSÃO: " + ninja.getMissionName()
            + "\nDIFICULDADE: " + ninja.getMissionDifficulty()
            + "\nCONCLUSÃO: " + ninja.getMissionProgress() + "%"
        );
        checkMission(ninja);

    }
    static void checkMission(Ninja ninja) {
        if ((ninja.getAge() < 15) &&
                ((ninja.getMissionDifficulty() != missionDifficulty.C) &&
                        (ninja.getMissionDifficulty() != missionDifficulty.D))) {
            System.out.println(
                    "O ninja " + ninja.getName() + " com a idade de " + ninja.getAge() + " anos "
                            + "não poderia executar uma missão nível " + ninja.getMissionDifficulty()
            );
        }
            String missionPercentageLog = switch (ninja.getMissionProgress()) {
                case 100 -> "Missão concluída";
                case byte progress when (progress >= 85 && progress < 100) -> "Missão quase concluída";
                case byte progress when (progress >= 50 && progress < 85) -> "Missão em andamento";
                default -> "Missão apenas começando";
            };
            System.out.println(missionPercentageLog);
    }
}

class Ninja{
//    Data of Nijas
    private String name;
    private int age;

//    Mission
    private String missionName;
    private missionDifficulty missionDifficulty;
    private byte missionProgress;

//    Getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMissionName() {
        return missionName;
    }

    public missionDifficulty getMissionDifficulty() {
        return missionDifficulty;
    }

    public byte getMissionProgress() {
        return missionProgress;
    }

//    Constructor

    public Ninja(String name, int age, String missionName, missionDifficulty missionDifficulty, byte missionProgress) {
        this.name = name;
        this.age = age;
        this.missionName = missionName;
        this.missionDifficulty = missionDifficulty;
        this.missionProgress = missionProgress;
    }
}
enum missionDifficulty{
    S, A, B, C, D
}
