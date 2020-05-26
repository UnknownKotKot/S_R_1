import java.util.Vector;

public class VectorDefault implements Vektor{

    Vector<Integer> v = new Vector<>()  ;

    public int getVektorSize(){
           return v.size();
       };

    public int elementAT(int index){
        return v.elementAt(index);
    };
    public void setElementAT(int index,
                      int obj){
        v.add(index, obj);

    };


}
