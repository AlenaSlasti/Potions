package repository;

import model.Recept;
import repository.Ingridients;

import java.util.ArrayList;

public class Recepts {

    public ArrayList<Recept> recepts = new ArrayList<>();
    public Ingridients ingridients = new Ingridients();

    public Recepts(){

        recepts.add(new Recept("Felix Felici", ingridients.ingridients.get(0).getName(), 1, ingridients.ingridients.get(2).getName(), 3, "Смешать"));
        recepts.add(new Recept("Живая смерть", ingridients.ingridients.get(1).getName(), 2 ,ingridients.ingridients.get(2).getName(), 4, "Смешать"));

    }
}
