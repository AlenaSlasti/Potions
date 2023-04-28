import controller.Alchemy;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame { //extends = наследовать. JFrame = системный класс рабочего окна

    private Alchemy alchemy;
    private JLabel label1; //создаем ссылку (пульт - имя пульта) нередактируемого текстового поля
    private JTextField textField1;//создаем ссылку (пульт - имя пульта) редактируемого текстового поля
    private JButton button1; //создаем ссылку (пульт - имя пульта) кнопки


    public MyFrame( ){
        super ("Зелье"); //super обращение к родительскому классу JFrame
        this.setBounds(100,100,500,500); //Размер границ окна для объекта MyFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //при закрытие окна MyFrame завершается работа программы

    }
    public void run (){

        label1 = new JLabel("Введите название зелья"); //инициализируем объект (имя пульта - телевизор). В конструктор передаем текст
        textField1 = new JTextField();//инициализируем объект (имя пульта - телевизор). Поле для ввода текста
        button1 = new JButton("OK");//инициализируем объект (имя пульта - телевизор). В конструктор передаем название кнопки

        setLayout(new GridLayout(3,1));//устанавливаем размещение объектов на окне MyFrame. В конструкторе создаем объект конкретного шаблона расположения
        add(label1);//добавляем текстовое поле на окно
        add(textField1);//добавляем текстовое поле на окно
        add(button1);//добавляем кнопку на окно

        button1.addActionListener(e ->{ //у объекта кнопки вызываем метод слушателя событий нажатия кнопки
            alchemy = new Alchemy();
            String rec = alchemy.preparation(textField1.getText());//получаем результат из объекта textField1 и его системного метода getText(), передаем текстовой переменной rec
            label1.setText(rec);//записываем в объект label1 с помощью системного метода setText() текстовую переменную rec
        });

        this.setVisible(true); //делаем видимым окно MyFrame

    }

}
