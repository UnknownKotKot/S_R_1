import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Vector;

public class DefaultMatrix extends SomeMatrix {


    VectorDefault[] vd;
    int y;
    int x;

    DefaultMatrix(int x, int y) {
        this.y = y;
        this.x = x;
        vd = new VectorDefault[y];
        int i;
        for (i = 0; i < vd.length; i++) {
            vd[i] = new VectorDefault(x);
        }
    }

    @Override
    public void setElToMatrix(int x, int y, int obj) {
        vd[y].setElementAT(x, obj);

    }


    @Override
    public int getElFromMatrix(int x, int y) {
        return vd[y].elementAT(x);
    }

    @Override
    public int getCountOfLine() {

        return vd.length;
    }

    @Override
    public int getCountOfColumn() {
        if (vd.length > 0)
            return vd[0].getVectorSize();
        else {
            return 0;
        }

    }
}
