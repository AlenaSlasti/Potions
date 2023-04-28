package controller;

import model.Recept;
import repository.Recepts;

public class Alchemy {
    private Recepts recepts;
    private String rec = "Рецепта нет";

    public String preparation(String nameRec){
       recepts = new Recepts();


        for (Recept recept : recepts.recepts){ //цикл перебирает коллекцию, по очереди присваивая каждую строчку пульту с именем recept

            if (recept.getName().equals(nameRec)){//имя пульта из цикла
                //equals - проверяет равенство объектов

                rec = recept.getName() + " " + recept.getOpis() + " " + recept.getIngrid1() +
                        " " + recept.getPieces1() + " "  + recept.getIngrid2() + " " + recept.getPieces2();
                return rec;
            }
        }
        return rec;
    }


           // return "bad";// возвращаем значение - это передаем результат второму слову метода
}
