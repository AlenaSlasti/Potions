import java.util.ArrayList;

public class Recept {
    String name;
    String ingrid1;
    int pieces1;
    String ingrid2;
    int pieces2;
    //int ingrid3;

    String opis;
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

}

