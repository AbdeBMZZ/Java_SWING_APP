import java.awt.*;

public class Rectangle extends Forme2D {
    private int longueur;
    private int largeur;

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public Rectangle(Color color, int longueur, int largeur) {
        super(color);
        this.longueur = longueur;
        this.largeur = largeur;
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(couleur);
        g2d.fillRect(30, 50, longueur, largeur);
    }

    @Override
    public double surface() {
        return longueur * largeur;
    }

    @Override
    public double perimetre() {
        return 2*largeur + 2*largeur;
    }


}
