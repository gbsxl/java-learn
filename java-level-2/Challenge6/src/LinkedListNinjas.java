import java.util.*;

public class LinkedListNinjas {
    LinkedList<Ninja> listNinjas = new LinkedList<>();

    public void setListNinjas(LinkedList<Ninja> listNinjas) {
        this.listNinjas = listNinjas;
    }

    void printAllNinjas() {
        if (listNinjas.size() == 1) {
            System.out.println("----------------------------NINJA----------------------------");
        } else {
            System.out.println("----------------------------NINJAS----------------------------");
        }
        for (Ninja iterador : listNinjas) {
            System.out.println("Indíce " + listNinjas.indexOf(iterador) + ": " +
                    "\nNAME= " + iterador.getName() +
                    "\nAGE= " + iterador.getAge() +
                    "\nVILLAGE= " + iterador.getVillage() + "\n");
        }
    }

    void orderedListBy(ObjectParam objectParam) {
        switch (objectParam) {
            case NAME -> listNinjas.sort(Comparator.comparing(Ninja::getName));
            case AGE -> listNinjas.sort(Comparator.comparing(Ninja::getAge));
            case VILLAGE -> listNinjas.sort(Comparator.comparing(Ninja::getVillage));
        }
        System.out.println("//Lista ordenada por " + objectParam.toString().toLowerCase(Locale.ROOT) +
                ", use printAllNinjas(); para visualizar\n");
    }

    void getInfoByNinjaName(String name) {
        int index = 0;
        boolean encontrado = false;
        for (Ninja iterador : listNinjas) {
            if (Objects.equals(iterador.getName(), name)) {
                encontrado = true;
                System.out.println("Ninja " + name + " encontrado! informações:");
                index = listNinjas.indexOf(iterador);
                LinkedList<Ninja> listNinjaByIndex = listNinjas;
                listNinjas = new LinkedList<>();
                listNinjas.add(listNinjaByIndex.get(index));
                printAllNinjas();
                listNinjas = listNinjaByIndex;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Ninja " + name + " não encontrado!");
        }
    }
}