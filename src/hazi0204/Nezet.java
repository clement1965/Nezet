
package hazi0204;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class Nezet extends JFrame implements ActionListener{
  
  private JComboBox cbReszlegLista;
  private JList lDolgozoLista = new JList(new DefaultListModel());
  private JTextField tfDolgozoKeres = new JTextField("Keresendő dolgozó",12);
  private JScrollPane spDolgozoLista = new JScrollPane(lDolgozoLista);

  public Nezet() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("HR lekérdezés HF 1.01");
    setSize(600, 600);
    setLocationRelativeTo(this);
    setIconImage(Toolkit.getDefaultToolkit().getImage("image1.jpg"));
    
    JLabel lbKitolto = new JLabel();
    lbKitolto.setPreferredSize(new Dimension(100, 10));
    cbReszlegLista=reszlegListaBetoltes();
    JPanel pn = new JPanel();
    pn.add(new JLabel("Részlegek Lista: "));
    pn.add(cbReszlegLista);
    pn.add(lbKitolto);
    pn.add(new JLabel("Dolgozó keresés: "));
    pn.add(tfDolgozoKeres);
    add(pn, BorderLayout.PAGE_START);
    add(spDolgozoLista);
    setVisible(true);
    cbReszlegLista.addActionListener(this);
    reszlegListaBetoltes();
    
  }
  
  private JComboBox reszlegListaBetoltes() {
    JComboBox cbReszlegLista = new JComboBox();
    cbReszlegLista.addItem("Részleg1");
    cbReszlegLista.addItem("Részleg2");
    cbReszlegLista.addItem("Részleg3");
    cbReszlegLista.addItem("Részleg5");
    return cbReszlegLista;
  }

  
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println(""+((JComboBox)e.getSource()).getSelectedItem());
  }

  public static void main(String[] args) {
    new Nezet();
  }
}
