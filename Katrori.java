package chapter10;

public class Katrori extends TwodShapes {
    
    public Katrori(int brinja) {
        super(brinja);
    }

    @Override
    public String lloji() {
        return "Katror";
    }

    @Override
    public int siperfaqa(){
        return super.getGjatesia() * super.getGjatesia();
    }

    @Override
    public int perimetri() {
        return super.getGjeresia() * 2 + super.getGjatesia() * 2;
    }
    
}

