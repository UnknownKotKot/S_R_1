import java.util.Vector;

public class VectorDefault implements Vektor {

    Integer[] v;

    public VectorDefault(int size) {
        v = new Integer[size];
    }

    public int getVectorSize() {
        return v.length;
    }


    public int elementAT(int index) {
        return v[index];
    }


    public void setElementAT(int index,
                             int obj) {
        v[index] = obj;

    }


}
