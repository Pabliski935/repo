public class Coronavirus{
	private float infeccio; 
	private float mortaldat;
 	
	Coronavirus(float x, float y)  {    
 		infeccio=x;    
 		mortaldat=y;      
 	}

	public Coronavirus(){}

	public Coronavirus(Coronavirus c){
		
		infeccio=c.infeccio;
		mortaldat=c.mortaldat;
	
	}

    public float getInfeccio() {
        return infeccio;
    }

    public void setInfeccio(float infeccio) {
        this.infeccio = infeccio;
    }

    public float getMortaldat() {
        return mortaldat;
    }

    public void setMortaldat(float mortaldat) {
        this.mortaldat = mortaldat;
    }
        
        

    @Override
    public String toString() {
        return "Coronavirus{" + "infeccio=" + infeccio + ", mortaldat=" + mortaldat + '}';
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
        final Coronavirus other = (Coronavirus) obj;
        if (Float.floatToIntBits(this.infeccio) != Float.floatToIntBits(other.infeccio)) {
            return false;
        }
        if (Float.floatToIntBits(this.mortaldat) != Float.floatToIntBits(other.mortaldat)) {
            return false;
        }
        return true;
    }
    
    
    
       
} 