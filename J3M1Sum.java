public class J3M1Sum {
public static void main(String[] args) {
    int n = 10;
    int sum = 0;

    //Find sum of first N naturnal numbers
    for (int i=1; i<=n; i++)
        sum += i;
        // sum = sum + i;
        System.out.println(sum);
}
}

// i=1  → sum = 0 + 1  = 1
// i=2  → sum = 1 + 2  = 3
// i=3  → sum = 3 + 3  = 6
// i=4  → sum = 6 + 4  = 10
// i=5  → sum = 10 + 5 = 15
// ...
// i=10 → sum = 45 + 10 = 55