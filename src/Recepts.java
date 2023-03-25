import java.util.ArrayList;

public class Recepts {

    ArrayList<Recept> recepts = new ArrayList<>();
    Ingridients ingridients = new Ingridients();

    public Recepts(){

        recepts.add(new Recept("Felix Felici", ingridients.ingridients.get(0).name, 1, ingridients.ingridients.get(2).name, 3, "Смешать"));
        recepts.add(new Recept("Живая смерть", ingridients.ingridients.get(1).name, 2 ,ingridients.ingridients.get(2).name, 4, "Смешать"));

    }
}
