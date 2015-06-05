import java.util.Random;

// Segdewick's Algorithms (4th Edition)
public class KnuthShuffle {

    // Randomly shuffle an array of doubles
    public static void shuffle(double[] a) {

        Random random = new Random(System.currentTimeMillis());  // psuedo-random number generator
        int N = a.length;

        for (int i = 0; i < N; ++i) {

            // Swap a[i] with a uniformly distributed random element in a[i...N-1]
            int r = i + random.nextInt(N-i);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

    public static void main(String[] args) {

        int N = 52;
        double[] a = new double[N];

        for (int i = 0; i < N; ++i) {
            a[i] = i;
        }

        shuffle(a);

        for ( int i = 0; i < N; ++i){
            System.out.println(a[i]);
        }
    }
}
