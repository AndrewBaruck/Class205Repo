package Qork;

public class Qork {    public static void main(String[] args) {
    int[] x = {4,6,7,7,3};
    int n = x.length;

    for (int j = n-1; j > 0; j--)
    x[ j ] = x[ j-1 ];

    for (int j = n-1; j > 1; j--)
    System.out.print(x[ j ]);
}

}
