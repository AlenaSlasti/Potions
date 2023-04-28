package model;

import java.util.ArrayList;

public class Recept {
    private String name;//скрываем переменную от прямого воздействия

    private String ingrid1;
    private int pieces1;
    private String ingrid2;
    private int pieces2;
    //int ingrid3;

    private String opis;
    public Recept(){}
   public Recept(String name, String ingrid1, int pieces1, String ingrid2, int pieces2, String opis) {
       this.name = name;
       this.ingrid1 = ingrid1;
       this.pieces1 = pieces1;
       this.ingrid2 = ingrid2;
       this.pieces2 = pieces2;
      // this.ingrid3 = ingrid3;
       this.opis = opis;
   }

    public void setName(String name){//set - метод для записи значения в скрытую переменную из аргумента
        this.name = name;//записываем в скрытую переменную name полученное значение из аргумента name
    }
    public String getName(){//get - метод для получения значения из скрытой переменной name
        return name;
    }

    public void setIngrid1(String ingrid1){
        this.ingrid1 = ingrid1;
    }
    public String getIngrid1(){
        return ingrid1;
    }

    public int getPieces1() {
        return pieces1;
    }

    public String getIngrid2() {
        return ingrid2;
    }

    public int getPieces2() {
        return pieces2;
    }

    public String getOpis() {
        return opis;
    }

    public void setPieces1(int pieces1) {
        this.pieces1 = pieces1;
    }

    public void setIngrid2(String ingrid2) {
        this.ingrid2 = ingrid2;
    }

    public void setPieces2(int pieces2) {
        this.pieces2 = pieces2;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}

