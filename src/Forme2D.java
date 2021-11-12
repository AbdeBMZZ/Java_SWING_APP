import javax.swing.*;
import java.awt.*;

public class Forme2D extends JFrame {
    protected Color couleur;
    public Forme2D() {
        couleur = Color.black;
    }

    public Forme2D(Color color) {
        couleur = color;

        getContentPane().setBackground(Color.WHITE);
        setSize(480, 200);
        setTitle("abdellah boumaiza");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                setVisible(true);
            }
        });
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public Color getCouleur() {
        return couleur;
    }

    public double surface() {
        return 0;
    }

    public double perimetre() {
        return 0;
    }
}

