
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class SpareMatrix extends SomeMatrix {


    Map<Integer, VectorSpares> map = new HashMap<>();

    int y;
    int x;

    SpareMatrix(int x, int y) {
        this.y = y;
        this.x = x;

    }

    @Override
    public void setElToMatrix(int x, int y, int obj) {
        VectorSpares vs = map.get(y);
        if (vs != null) {
            vs.setElementAT(x, obj);
        } else {
            vs = new VectorSpares(x);
            vs.setElementAT(x, obj);
            map.put(y, vs);

        }


    }


    @Override
    public int getElFromMatrix(int x, int y) {
        if (y > this.y || y < 0) {
            throw new ArrayIndexOutOfBoundsException(y + " - is out of bounds (" + this.y + ")");
        }
        if (x > this.x || x < 0) {
            throw new ArrayIndexOutOfBoundsException(x + " - is out of bounds (" + this.x + ")");
        }
        VectorSpares vs = map.get(y);
        if (vs == null) {
            return 0;
        } else {
            return vs.elementAT(x);
        }

    }

    @Override
    public int getCountOfLine() {

        return this.y;
    }

    @Override
    public int getCountOfColumn() {
        return this.x;

    }
}

