package Pattern_Assignment;

public class Q5NamePattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            // R
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) || j == (n - 1) && i > 0 && i < (n - 1) / 2
                        || i == (n - 1) / 2 && j < (n - 1) || j == (n - 1) && i > (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print("  ");
            // A
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 || j == (n - 1) && i > 0 || i == 0 && j > 0 && j < (n - 1)
                        || i == (n - 1) / 2 && j < (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print("   ");
            // J
            for (int j = 0; j < n; j++) {
                if (j == (n - 1) / 2 && i < (n - 1) || j == 0 && i > (n - 1) / 2 && i < (n - 1)
                        || i == (n - 1) && j > 0 && j < (n - 1) / 2 || i == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print(" ");
            // A
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 || j == (n - 1) && i > 0 || i == 0 && j > 0 && j < (n - 1)
                        || i == (n - 1) / 2 && j < (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print("   ");
            // N
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == j || j == (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < n; i++) {
            // R
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) || j == (n - 1) && i > 0 && i < (n - 1) / 2
                        || i == (n - 1) / 2 && j < (n - 1) || j == (n - 1) && i > (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print("  ");
            // A
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 || j == (n - 1) && i > 0 || i == 0 && j > 0 && j < (n - 1)
                        || i == (n - 1) / 2 && j < (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print("   ");
            // J
            for (int j = 0; j < n; j++) {
                if (j == (n - 1) / 2 && i < (n - 1) || j == 0 && i > (n - 1) / 2 && i < (n - 1)
                        || i == (n - 1) && j > 0 && j < (n - 1) / 2 || i == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print(" ");
            // B
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) || j == (n - 1) && i > 0 && i < (n - 1) / 2
                        || i == (n - 1) / 2 && j < (n - 1) || j == (n - 1) && i > (n - 1) / 2 && i < (n - 1)
                        || i == (n - 1) && j < (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // H
            for(int j = 0; j<n; j++){
                if(j==0 || j==(n-1) || i==(n-1)/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            // A
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 || j == (n - 1) && i > 0 || i == 0 && j > 0 && j < (n - 1)
                        || i == (n - 1) / 2 && j < (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print(" ");
            // R
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j < (n - 1) || j == (n - 1) && i > 0 && i < (n - 1) / 2
                        || i == (n - 1) / 2 && j < (n - 1) || j == (n - 1) && i > (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();

        }
    }

}
