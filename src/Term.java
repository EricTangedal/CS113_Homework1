public class Term {
    //DEFAULT VARIABLES
    public static final int DEFAULT_COEFFICIENT=3;
    public static final int DEFAULT_EXPONENT=2;
    //INSTANCE VARIABLES
    private int coefficient;
    private int exponent;
    private String term;

    //DEFAULT CONSTRUCTOR
    public Term(){
        coefficient=DEFAULT_COEFFICIENT;
        term=String.valueOf(coefficient);
    }
    //PARTIAL CONSTRUCTOR
    public Term(int _coefficient){
        coefficient=_coefficient;
        term=String.valueOf(coefficient);
    }
    //FULL CONSTRUCTOR
    public Term(int _coefficient, int _exponent){
        coefficient=_coefficient;
        exponent=_exponent;
        if(exponent==1){
            term=coefficient+"x";
        }
        else if(exponent>1){
            term=coefficient+"x^"+exponent;
        }
    }
    //COPY CONSTRUCTOR
    public Term(Term _other){
        coefficient=_other.getCoefficient();
        exponent=_other.getExponent();
        term=coefficient+"x^"+exponent;
    }
    //SET COEFFICIENT
    public void setCoefficient(int _newCoefficient){
        this.coefficient=_newCoefficient;
        term=getCoefficient()+"x^"+getExponent();
    }
    //SET EXPONENT
    public void setExponent(int _newExponent){
        this.exponent=_newExponent;
        term=getCoefficient()+"x^"+getExponent();
    }
    //SET ALL
    public void setAll(int _newCoefficient, int _newExponent){
        this.coefficient=_newCoefficient;
        this.exponent=_newExponent;
        term=getCoefficient()+"x^"+getExponent();
    }
    //GET COEFFICIENT
    public int getCoefficient() {
        return this.coefficient;
    }
    //GET EXPONENT
    public int getExponent(){
        return this.exponent;
    }
    //toString
    @Override
    public String toString(){
        return term;
    }
}
