import java.awt.*;

public class Disque extends Forme2D{
    private int rayon;
    public Disque(Color color, int rayon) {
        super(color);
        this.rayon = rayon;
    }
    public double getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    public double diametre() {
        return rayon*2;
    }

    @Override
    public double surface() {
        return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(couleur);
        g2d.fillOval(30, 50, rayon, rayon);
    }
}
