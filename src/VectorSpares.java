import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class VectorSpares implements Vektor {

    Map<Integer, Integer> map = new HashMap<>();

    int size;

    VectorSpares(int size) {
        this.size = size;
    }

        public int getVectorSize() {
        return size;
    }


    public int elementAT(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index + " - is out of bounds (" + size + ")");
        }
        Integer el = map.get(index);
        if (el == null) {
            return 0;
        } else {
            return el;
        }
    }


    public void setElementAT(int index,
                             int obj) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index + " - is out of bounds (" + size + ")");
        }
        map.put(index, obj);
    }


}
