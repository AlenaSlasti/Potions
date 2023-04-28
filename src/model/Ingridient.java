package model;

public class Ingridient {
//инкапсуляция - защита переменных от прямого воздействия пользователей
    private String name;//скрываем переменную от прямого воздействия
    private int porci;

    public Ingridient(String name, int porci) { //констурктор. Нет возвращаемого значения. позволяет создать объект с заполнными значениями

        this.name = name;
        this.porci = porci;
    }

    public void setName (String name){//set - метод для записи значения в скрытую переменную из аргумента
        this.name = name;//записываем в скрытую переменную name полученное значение из аргумента name
    }
    public String getName (){//get - метод для получения значения из скрытой переменной name
        return name;
    }
    public void setPorci (int porci){
        this.porci = porci;
    }
    public int getPorci(){
        return porci;
    }
}
