public class Main {
    public static void main(String[] args) {
        Ninja gaara = new Ninja("Gaara", 18, "Vila Oculta da Areia");
        Ninja naruto = new Ninja("Naruto", 17, "Vila Oculta da Folha");
        Ninja sasuke = new Ninja("Sasuke", 17, "Vila Oculta da Folha");
        Ninja sakura = new Ninja("Sakura", 17, "Vila Oculta da Folha");
        Ninja kakashi = new Ninja("Kakashi", 30, "Vila Oculta da Folha");
        Ninja itachi = new Ninja("Itachi", 21, "Vila Oculta da Folha");
        Ninja shikamaru = new Ninja("Shikamaru", 17, "Vila Oculta da Folha");
        Ninja hinata = new Ninja("Hinata", 17, "Vila Oculta da Folha");
        Ninja rockLee = new Ninja("Rock Lee", 17, "Vila Oculta da Folha");
        Ninja neji = new Ninja("Neji", 18, "Vila Oculta da Folha");
        Ninja temari = new Ninja("Temari", 19, "Vila Oculta da Areia");
        Ninja kankuro = new Ninja("Kankuro", 19, "Vila Oculta da Areia");
        Ninja jiraiya = new Ninja("Jiraiya", 54, "Vila Oculta da Folha");
        Ninja orochimaru = new Ninja("Orochimaru", 50, "Vila Oculta do Som");
        Ninja tsunade = new Ninja("Tsunade", 55, "Vila Oculta da Folha");

        LinkedListNinjas linked = new LinkedListNinjas();
        linked.listNinjas.add(gaara);
        linked.listNinjas.add(naruto);
        linked.listNinjas.add(sasuke);
        linked.listNinjas.add(sakura);
        linked.listNinjas.add(kakashi);
        linked.listNinjas.add(itachi);
        linked.listNinjas.add(shikamaru);
        linked.listNinjas.add(hinata);
        linked.listNinjas.add(rockLee);
        linked.listNinjas.add(neji);
        linked.listNinjas.add(temari);
        linked.listNinjas.add(kankuro);
        linked.listNinjas.add(jiraiya);
        linked.listNinjas.add(orochimaru);
        linked.listNinjas.add(tsunade);

        linked.printAllNinjas();
        linked.orderedListBy(ObjectParam.NAME);
        linked.printAllNinjas();
        linked.getInfoByNinjaName("Naruto");
        linked.getInfoByNinjaName("Pain");
    }
}
