package repository;

import model.Ingridient;

import java.util.ArrayList;

public class Ingridients {


    public ArrayList<Ingridient> ingridients = new ArrayList<>();//коллекция №1 заполнение коллекции №1


    public Ingridients(){


        ingridients.add(new Ingridient( "Bezoar", 1));
        ingridients.add(new Ingridient( "Mandragora", 1));
        ingridients.add(new Ingridient( "Zlatoglaski", 1));
    }
}
