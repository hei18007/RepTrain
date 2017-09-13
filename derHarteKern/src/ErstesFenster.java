import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ErstesFenster extends JFrame
{
    Button button1;
    Button button3;
    Button button5;
    Button button7;
    private JButton button2, button4, button6, button8;


    public ErstesFenster() {
        initBasics();
        initComponents();
        addComponents();
        setVisible(true);
    }

    private void initBasics() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setTitle("Erstes Fenster");
        setLocationRelativeTo(null);
        //Wo am Monitor soll das Fenster plaziert werden
        setLayout(new GridLayout(4, 2));
    }


    private void initComponents() {
        button1 = (new Button(" Das ist ein JButton "));
        button2 = (new JButton(" Button1 "));
        button3 = (new Button(" ein weiterer JButton "));
        button4 = (new JButton(" Button2 "));
        button5 = (new Button(" und noch ein JButton "));
        button6 = (new JButton(" Button3 "));
        button7 = (new Button("... und das letzte ... "));
        button8 = (new JButton(" Button4 "));
    }

    private void addComponents() {
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        new ErstesFenster();

    }
}


