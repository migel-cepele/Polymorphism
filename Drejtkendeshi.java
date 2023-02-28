package chapter10;

public class Drejtkendeshi extends TwodShapes {

    public Drejtkendeshi(int gjatesia, int gjeresia) {
        super(gjatesia, gjeresia);
    }

    @Override
    public String lloji() {
        return "Drejtkendesh";
    }
    @Override
    public int siperfaqa() {
        return super.getGjatesia() * super.getGjeresia();

    }

    @Override
    public int perimetri() {
        return super.getGjatesia()*2 + super.getGjeresia() * 2;
    }
    
}

