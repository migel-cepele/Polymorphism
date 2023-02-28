package chapter10;

public abstract class TwodShapes implements Shapes{

    private int gjatesia;
    private int gjeresia;

    public TwodShapes(int gjatesia, int gjeresia) { //konstruktor per drejtkendeshin
        setGjatesia(gjatesia);
        setGjeresia(gjeresia);
    }

    public TwodShapes(int gjatesia) { //konstruktor per katrorin
        setGjatesia(gjatesia);
        setGjeresia(gjatesia);
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

    public int getGjatesia() {return gjatesia;}
    public int getGjeresia() {return gjeresia;}

    //metodat abastrakte
    public abstract int siperfaqa();
    public abstract int perimetri();

    
    



    
}
