package lab8;

import java.awt.*; // Классы для работы с графикой, текстом, окнами и GUI
import javax.swing.*; // Библиотека основных графических компонентов в Java;
import java.awt.event.*;
class ButtonListener implements ActionListener {
    private sum parent = null;
    ButtonListener(sum obj) {
        parent = obj;
    }
    public void actionPerformed(ActionEvent e) {
        String actionStr = e.getActionCommand();
        if (actionStr.equals(sum.BUTTON_NAME)) {
            parent.makeSum();
        }
    }
}
class sum extends JFrame {
    final static String BUTTON_NAME = "Расчёт";
    private TextField a, b, c;
    sum(String s) {
        super(s); // // Вызов конструктора суперкласса (JFrame)
        setLayout(null); // // Отказ от менеджера размещения
        setSize(200,150); //Форма размеров
        setVisible(true); //// Установка видимости на экране
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Установка по умолчанию для закрытия окна

        //=========================================================
        Button b2 = new Button(BUTTON_NAME); // Создание кнопки сумма
        b2.setBounds(50, 90, 96, 22); // Координаты размещения кнопки
        b2.addActionListener(new ButtonListener(this));
        add(b2); // Добавление кнопки в программу
        //=========================================================
        a = new TextField(""); // Создание текстового поля
        a.setBounds(2, 17, 50, 20); // Координаты размещения
        add(a); // Добавление текстового поля
        //=========================================================
        b = new TextField(""); // Создание текстового поля (редактируемое)
        b.setBounds(70, 17, 50, 20); // Координаты размещения
        add(b); // Добавление текстового поля
        //=========================================================
        c = new TextField(""); // Создание текстового поля
        c.setEditable(false);
        c.setBounds(138, 17, 50, 20); // Координаты размещения
        add(c); // Добавление текстового поля
        //=========================================================
        Label a1=new Label ("1 число"); // Текстовое поле (постоянное)
        a1.setBounds(1,0,50,20); // Координаты даного текстового поля
        add(a1); // Добавление данного текстового поля
        //=========================================================
        Label b1=new Label ("2 число"); // Текстовое поле (постоянное)
        b1.setBounds(69,0,50,20); // Координаты даного текстового поля
        add(b1); // Добавление данного текстового поля

        //=========================================================
        Label c1=new Label ("Сумма"); // Текстовое поле (постоянное)
        c1.setBounds(137,0,50,20); // Координаты даного текстового поля
        add(c1); // Добавление данного текстового поля
    }
    void makeSum() {
        float valueA = 0;
        float valueB = 0;
        boolean parseOk = false;
        try {
            valueA = Float.parseFloat(a.getText());
            valueB = Float.parseFloat(b.getText());
            parseOk = true;
        } catch(Exception e) {
            c.setText("Err");
        }
        if(parseOk) {
            c.setText("" + (valueA+valueB));
        }
        c.repaint();
    }
    public static void main (String[] args){
        new sum ("Сумматор"); // Имя программы
    }
}