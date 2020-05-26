import java.io.IOException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        VectorDefault vd = new VectorDefault();
        VectorSpares vs = new VectorSpares();

        vd.setElementAT(0, 10);
        vd.setElementAT(1, 10);
        vd.setElementAT(2, 0);
        vd.setElementAT(3, 10);

        vs.setElementAT(0, 10);
        vs.setElementAT(1, 10);
        vs.setElementAT(2, 0);
        vs.setElementAT(3, 10);

        System.out.println(" Current default vector number of elements: " + vd.getVektorSize());
        System.out.println(" Current spare vector number of elements: " + vs.getVektorSize());







    }
}
