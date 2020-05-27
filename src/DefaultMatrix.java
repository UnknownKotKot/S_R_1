import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Vector;

public class DefaultMatrix extends SomeMatrix{


    Integer [][] df ;



    @Override
    public void setVectorToMatrix(int line, Vektor obj) {
        int vs = obj.getVectorSize();
        for(int i =0; i<vs; ++i ) {
            df[line][i] = obj.elementAT(i);
        }
    }

    @Override
    public Vektor getVectorFromMatrix(int index) {
        VectorDefault vd = new VectorDefault();
        int i;
        for( i = 0; i<=df.length; i++) {

            vd.setElementAT(df[index][i], df[index][i]);
        }
        return vd;
    }



    @Override
    public int getCountOfLine() {
        int lineCount =0;
        for( int j =0; j<df.length;j++){
            for(int i=0; i<df[j].length; i++ ){
            lineCount++;
                    }
    }
        return lineCount;
    }

    @Override
    public int getCountOfColumn() {

        return df.length;
    }
}
