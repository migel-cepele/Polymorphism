package chapter10;

public abstract class ThreedShapes implements Shapes{
    private int gjatesia;
    private int gjeresia;
    private int lartesia;

    public ThreedShapes(int gjatesia, int gjeresia, int lartesia) { //per kuboidin
        setGjatesia(gjatesia);
        setGjeresia(gjeresia);
        setLartesia(lartesia);
    }

    public ThreedShapes(int gjatesia) { //per kubin
        setGjatesia(gjatesia);
        setGjeresia(gjatesia);
        setLartesia(gjatesia);
    }

    private void setGjatesia(int gjatesia) {
        if(gjatesia <= 0)
        throw new IllegalArgumentException("Gjatesia duhet me e madhe se 0");

        this.gjatesia = gjatesia;
    }

    private void setGjeresia(int gjeresia) {
        if(gjeresia <= 0)
        throw new IllegalArgumentException("Gjeresia duhet me e madhe se 0");

        this.gjeresia = gjeresia;
    }

    private void setLartesia(int lartesia) {
        if(lartesia <= 0)
        throw new IllegalArgumentException("Lartesia duhet me e madhe se 0");

        this.lartesia = lartesia;
    }

    
    public int getGjatesia() {return gjatesia;}
    public int getGjeresia() {return gjeresia;}
    public int getLartesia() {return lartesia;}

    //metodat abastrakte
    public abstract int siperfaqa();
    public abstract int vellimi();
    
}
