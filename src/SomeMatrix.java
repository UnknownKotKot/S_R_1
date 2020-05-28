public abstract class SomeMatrix implements Matrix{
    public abstract void setVectorToMatrix(int line, Vektor obj);
    public abstract Vektor getVectorFromMatrix(int index);
    public abstract int getCountOfLine();
    public abstract int getCountOfColumn();


}
