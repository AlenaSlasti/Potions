public class Alchemy {
    Recepts recepts;
    String rec = "Рецепта нет";

    public String preparation(String nameRec){
       recepts = new Recepts();


        for (Recept recept : recepts.recepts){ //цикл перебирает коллекцию, по очереди присваивая каждую строчку пульту с именем recept

            if (recept.name.equals(nameRec)){//имя пульта из цикла
                //equals - проверяет равенство объектов

                rec = recept.name + " " + recept.opis + " " + recept.ingrid1 +
                        " " + recept.pieces1 + " "  + recept.ingrid2 + " " + recept.pieces2;
                return rec;
            }
        }
        return rec;
    }


           // return "bad";// возвращаем значение - это передаем результат второму слову метода
}
