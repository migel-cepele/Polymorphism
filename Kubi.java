package chapter10;

public class Kubi extends ThreedShapes{

    public Kubi(int brinja) {
        super(brinja);
    }

    @Override
    public String lloji() {
        return "Kubi";
    }

    @Override
    public int siperfaqa(){
        return 6 * super.getGjatesia() * super.getGjeresia();
    }

    @Override
    public int vellimi() {
        return super.getGjatesia() * super.getGjeresia() * super.getLartesia();
    }
    
}

