public class Covid_19 extends Coronavirus{
    
    private int diesDeQuarentena;

    public Covid_19(int diesDeQuarentena, float x, float y) {
        super(x, y);
        this.diesDeQuarentena = diesDeQuarentena;
    }

    public Covid_19(int diesDeQuarentena) {
        this.diesDeQuarentena = diesDeQuarentena;
    }

    public Covid_19(int diesDeQuarentena, Coronavirus c) {
        super(c);
        this.diesDeQuarentena = diesDeQuarentena;
    }

    public int getDiesDeQuarentena() {
        return diesDeQuarentena;
    }

    public void setDiesDeQuarentena(int diesDeQuarentena) {
        this.diesDeQuarentena = diesDeQuarentena;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Covid_19 other = (Covid_19) obj;
        if (this.diesDeQuarentena != other.diesDeQuarentena) {
            return false;
        }
        return true;
    }
    
    
    

    @Override
    public String toString() {
        return "Covid_19{" + "diesDeQuarentena=" + diesDeQuarentena + '}';
    }
    
    
    
}
