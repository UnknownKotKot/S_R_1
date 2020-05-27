import java.util.Vector;

public class VectorSpares implements Vektor{

    Vector<Integer> v = new Vector<>()  ;

    //making Vector to be Spare: collapse zeros in vector and return its "spare" size
    public int getVectorSize(){
        Integer vekmass[] = new Integer[v.size()];
        vekmass =v.toArray(vekmass);
        int count =0;
        for(int i = 0; i < vekmass.length; i++)
            if(vekmass [i] != 0)
                count++;

        return count;
    };

    public int elementAT(int index){
        return v.elementAt(index);
    };
    public void setElementAT(int index,
                             int obj){
        v.add(index, obj);

    };


}
