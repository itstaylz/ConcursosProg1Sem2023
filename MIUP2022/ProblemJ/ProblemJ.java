import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProblemJ {

    static class InputReader {

        private final BufferedReader reader;
        private StringTokenizer tokenizer;
        
        public InputReader(InputStream inStream) {
            this.reader = new BufferedReader(new InputStreamReader(inStream));
            this.tokenizer = new StringTokenizer("");
        }

        public String next() throws IOException {
            while (!this.tokenizer.hasMoreTokens()) {
                this.tokenizer = new StringTokenizer(this.reader.readLine());
            }
            return tokenizer.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) throws IOException {
        InputReader reader = new InputReader(System.in);
        int numDays = reader.nextInt();
        int[] temps = new int[numDays];
        for (int i = 0; i < numDays; i++) {
            temps[i] = reader.nextInt();
        }
        int numOps = reader.nextInt();
        for (int i = 0; i < numOps; i++) {
            int op = reader.nextInt();
            if (op == 1) {
                int a = reader.nextInt() - 1;
                int b = reader.nextInt() - 1;
                int temp = reader.nextInt();
                int count = 0;
                for (int j = a; j <= b; j++) {
                    if (temps[j] > temp)
                        count++;
                }
                System.out.println(count);
            } else {
                int d = reader.nextInt();
                int temp = reader.nextInt();
                temps[d - 1] = temp;
            }
        }
    }
}