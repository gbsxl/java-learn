public class Challenge1 {
    public static void main(String[] args) {
//      Data of ninjas
        String nameNinja1, nameNinja2, nameNinja3;
        int ageNinja1, ageNinja2, ageNinja3;

        nameNinja1 = "Rock Lee"; ageNinja1 = 13;
        nameNinja2 = "Itachi"; ageNinja2 = 20;
        nameNinja3 = "Gaara"; ageNinja3 = 14;

//      Data of Missions
        String nameMission1, nameMission2, nameMission3;
        char hardLevel1, hardLevel2, hardLevel3;
        byte statusConclusion1, statusConclusion2, statusConclusion3;

        nameMission1 = "Treinar com pesos mais pesados"; hardLevel1 = 'D'; statusConclusion1 = 85;
        nameMission2 = "Matar seu clã inteiro"; hardLevel2 = 'A'; statusConclusion2 = 100;
        nameMission3 = "Dominar Shukaku"; hardLevel3 = 'B'; statusConclusion3 = 15;

//      Prints
        System.out.println(
                "\n"+ "NINJA: " + nameNinja1
                + "\nIDADE: " + ageNinja1
                + "\nMISSÃO: " + nameMission1
                + "\nDIFICULDADE: " + hardLevel1
                + "\nCONCLUSÃO: " + statusConclusion1 + "%"
        );
        checkMission(nameNinja1, ageNinja1, hardLevel1, statusConclusion1);

        System.out.println(
                "\n"+ "NINJA: " + nameNinja2
                + "\nIDADE: " + ageNinja2
                + "\nMISSÃO: " + nameMission2
                + "\nDIFICULDADE: " + hardLevel2
                + "\nCONCLUSÃO: " + statusConclusion2 + "%"
        );
        checkMission(nameNinja2, ageNinja2, hardLevel2, statusConclusion2);

        System.out.println(
                "\n"+ "NINJA: " + nameNinja3
                + "\nIDADE: " + ageNinja3
                + "\nMISSÃO: " + nameMission3
                + "\nDIFICULDADE: " + hardLevel3
                + "\nCONCLUSÃO: " + statusConclusion3 + "%"
        );
        checkMission(nameNinja3, ageNinja3, hardLevel3, statusConclusion3);
    }
    public static void checkMission(String nameNinja, int ageNinja, char hardLevel, byte statusConclusion){
        if (ageNinja < 15 && (hardLevel != 'C' && hardLevel != 'D')){
            System.out.println(
                "O ninja " + nameNinja + " com a idade de " + ageNinja + " anos "
                + "não poderia executar uma missão nível " + hardLevel
            );
        } else  {
            if (statusConclusion == 100){
                System.out.println("Missão concluída");
            } else if (statusConclusion < 100 && statusConclusion >= 85) {
                System.out.println("Missão quase concluída");
            }
            else{
                System.out.println("Missão em andamento");
            }
        }
    }
}