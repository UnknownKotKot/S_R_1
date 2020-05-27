public interface Matrix {

    void setVectorToMatrix(int line, Vektor obj);
    Vektor getVectorFromMatrix(int index);
    int getCountOfLine();
    int getCountOfColumn();
}
