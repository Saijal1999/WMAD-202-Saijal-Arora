//Implement the MonteCarlo approach to estimate the PI (=3.14) number.
// The solution exists in the
  //      lecture. Try the MonteCarlo approach for 100 tries, 1000 tries and 10000 tries and print the
    //    estimated value for PI for these numbers of tries

package ca.ciccc.wmad.assignment2.question8;

public class question8 {

        public static void printPi() {
            System.out.printf("Estimated PI is %f (100 tries)\n", estimatePiWithMonteCarloApproach(100));
            System.out.printf("Estimated PI is %f (1000 tries)\n", estimatePiWithMonteCarloApproach(1000));
            System.out.printf("Estimated PI is %f (10000 tries)\n", estimatePiWithMonteCarloApproach(10000));
        }

        private static float estimatePiWithMonteCarloApproach(int tries) {
            float count = 0.0F;

            for (int i = 0; i < tries; i++) {
                double x = Math.random();
                double y = Math.random();
                if (Math.pow(x, 2) + Math.pow(y, 2) < 1) count++;
            }

            return 4 * count / tries;
        }
    }

