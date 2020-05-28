import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Vector;

public class DefaultMatrix extends SomeMatrix{


    Integer [][] dfm ;



    @Override
    public void setVectorToMatrix(int line, Vektor obj) {
        int vsz = obj.getVectorSize();
        for(int i =0; i<vsz; ++i ) {
            dfm[line][i] = obj.elementAT(i);
        }
    }

    @Override
    public Vektor getVectorFromMatrix(int index) {
        VectorDefault vd = new VectorDefault();
        int i;
        for( i = 0; i<=dfm.length; i++) {

            vd.setElementAT(i, dfm[index][i]);
        }
        return vd;
    }

    @Override
    public int getCountOfLine() {
        int lineCount =0;
        for( int j =0; j<dfm.length;j++){
            for(int i=0; i<dfm[j].length; i++ ){
            lineCount++;
                    }
    }
        return lineCount;
    }

    @Override
    public int getCountOfColumn() {

        return dfm.length;
    }
}
