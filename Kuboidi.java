package chapter10;

public class Kuboidi extends ThreedShapes {

    public Kuboidi(int gjatesia, int gjeresia, int lartesia) {
        super(gjatesia, gjeresia, lartesia);
    }

    @Override
    public String lloji() {
        return "Kuboid";
    }

    @Override
    public int siperfaqa() {
        return super.getGjatesia() * super.getGjeresia() * 2 +
         super.getGjatesia() * super.getLartesia() * 2 +
         super.getGjeresia() * super.getLartesia() * 2;
    }

    @Override
    public int vellimi() {
        return super.getGjatesia() * super.getGjeresia() * super.getLartesia();
    }
    
}

