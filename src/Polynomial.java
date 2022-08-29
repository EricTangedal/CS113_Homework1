import java.util.ArrayList;
public class Polynomial {
    //DEFAULT VARIABLES
    public static final Term DEFAULT_TERM = new Term();
    //INSTANCE VARIABLES
    private ArrayList<Term> termArrayList = new ArrayList<Term>();
    //CONSTRUCTORS
    public Polynomial(){
        termArrayList.add(DEFAULT_TERM);
    }
    public Polynomial(ArrayList<Term> _arrayList){
        termArrayList.addAll(_arrayList);
    }
    //SETTERS

    //GETTERS
    public Term getTerm(int _index){
        return termArrayList.get(_index);
    }
    //OTHER METHODS
    public void addTerm(Term _term){
        termArrayList.add(_term);
    }

    //toString

    @Override
    public String toString() {
        String out = "";
        int i;
        for (i = 0; i < termArrayList.size(); i++){
            if(i> termArrayList.size()){
                break;
            }
            if(i!=termArrayList.size()-1){
                out = out + getTerm(i).toString() + " + ";
            }
            else{
                out = out + getTerm(i).toString();
            }
        }
        //out = out + getTerm(i).toString();
        return out;
    }
}
