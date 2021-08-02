package sesion02_mul_a;

public class Cartesiana {
    private float x;
    private float y;

    public Cartesiana(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public Cartesiana() {
    }

    public Cartesiana polar_cartesiano(float radio, float angulo) {
        float x = radio * (float)Math.cos(angulo);
        float y = radio * (float)Math.sin(angulo);
        return new Cartesiana(x, y);
    }
    
    public Cartesiana polar_cartesiano(Polar p) {
        return new Cartesiana();   // Implementar la fórmula correcta
    }
    
    public Polar cartesiano_polar(float x, float y) {
        float radio = sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        float angulo = (float)Math.atan(y/x);
        return new Polar(radio, angulo);
    }
    
    public Polar cartesiano_polar(Cartesiana c) {
        return new Polar();   // Implementar la fórmula correcta
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

}
