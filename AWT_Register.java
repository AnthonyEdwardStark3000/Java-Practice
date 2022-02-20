import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AWT_Register extends Frame
{
    //Constructor
    AWT_Register(){

        setLayout(null);
        Color bg = new Color(46, 2, 25);
        setBackground(bg);

        setForeground(bg.WHITE);
//        GUI
        Label l1= new Label("Registeration Form");
        add(l1);
        l1.setBounds(400, 50, 100, 50);

        Label l2= new Label("First Name");
        add(l2);
        l2.setBounds(250, 100, 100, 10);

        TextField t1 = new TextField(15);
        add(t1);
        t1.setBounds(400, 100, 100, 50);

        Label l3= new Label("Last Name");
        add(l3);
        l3.setBounds(250, 200, 100, 50);


        TextField t2 = new TextField(15);
        add(t2);
        t2.setBounds(400, 200, 100, 30);


        Label l4= new Label("Address");
        add(l4);
        l4.setBounds(250, 300, 100, 50);

        TextArea a = new TextArea(10, 10);
        add(a);
        a.setBounds(400, 300, 100, 50);



        Label l5= new Label("Hobbies");
        add(l5);
        Checkbox c1 = new Checkbox("Cricket");
        add(c1);

        Checkbox c2 = new Checkbox("Football");
        add(c2);

        Label l7 = new Label("Languages");
        add(l7);
        List l = new List(4);
        l.add("c");
        l.add("c++");
        l.add("Java");
        l.add("Python");
        add(l);

        Label l8 = new Label("Cities");
        add(l8);
        Choice c = new Choice();
        c.add("c");
        c.add("c++");
        c.add("Java");
        c.add("Python");
        add(c);

        Button b1 = new Button("Send Data");
        add(b1);
        b1.setBounds(500, 300, 100, 50);

        //closing the frame
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    setVisible(true); //Make Frame visible
    setSize(800, 800); //Set size of the frame
    setTitle("Registration Form");
    setResizable(false);
    }
    public static void main(String args[])
    {
        AWT_Register r = new AWT_Register();
    }
}
