
    import java.util.Vector;

    public class SpareMatrix extends SomeMatrix{


        Integer [][] spm ;

        @Override
        public void setVectorToMatrix(int line, Vektor obj) {
            int vsz = obj.getVectorSize();
            for(int i =0; i<vsz; ++i ) {
                spm[line][i] = obj.elementAT(i);
            }
        }

        @Override
        public Vektor getVectorFromMatrix(int index) {
            VectorSpares vs = new VectorSpares();
            int i;
            for( i = 0; i<=spm.length; i++) {
                vs.setElementAT(i, spm[index][i]);
            }
            return vs;
        }

        @Override
        public int getCountOfLine() {
            int lineCount =0;
            for( int j =0; j<spm.length;j++){
                for(int i=0; i<spm[j].length; i++ ){
                    lineCount++;
                }
            }
            return lineCount;
        }

        @Override
        public int getCountOfColumn() {

            return spm.length;
        }
    }

