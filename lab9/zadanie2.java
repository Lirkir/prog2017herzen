package lab9;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by kiril on 21.11.2017.
 */
public class zadanie2 extends Applet {
    public static final long serialVersionUID = 1L;

    public void init()

    {

        Button b1 = new Button("Кнопка 1");

        add(b1);

        b1.addActionListener(new ActionListener(){

            private Graphics e;

            public void actionPerformed(ActionEvent event){

                try{

                    e.drawString("1", 10, 10); e.drawString("2", 20, 10); e.drawString("3", 30, 10);

                    e.drawString("4", 10, 30); e.drawString("5", 20, 30); e.drawString("6", 30, 30);

                    e.drawString("7", 10, 50); e.drawString("8", 20, 50); e.drawString("9", 30, 50);

                }catch(Exception e){

                }

            }

        });

    }}

