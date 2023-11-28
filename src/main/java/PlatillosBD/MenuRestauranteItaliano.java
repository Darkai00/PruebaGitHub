import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuRestauranteItaliano extends JFrame {
    private JTextArea areaPedido;

    public MenuRestauranteItaliano() {
        setTitle("Restaurante Italiano");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        areaPedido = new JTextArea();
        areaPedido.setEditable(false);

        JButton btnPizza = new JButton("Pizza Margherita");
        JButton btnPasta = new JButton("Pasta Carbonara");
        JButton btnTiramisu = new JButton("Tiramisú");

        btnPizza.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarAlPedido("Pizza Margherita - $10.99");
            }
        });

        btnPasta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarAlPedido("Pasta Carbonara - $12.99");
            }
        });

        btnTiramisu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarAlPedido("Tiramisú - $6.99");
            }
        });

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnPizza);
        panelBotones.add(btnPasta);
        panelBotones.add(btnTiramisu);

        JScrollPane scrollPane = new JScrollPane(areaPedido);

        getContentPane().add(panelBotones, "North");
        getContentPane().add(scrollPane);

        setVisible(true);
    }

    private void agregarAlPedido(String item) {
        areaPedido.append(item + "\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MenuRestauranteItaliano menuRestauranteItaliano = new MenuRestauranteItaliano();
            }
        });
    }
}