package Ad_Hoc;

class Sum {
    public void Add() {
        System.out.println(1 + 2);
    }

    public void Add(int a, int b) {
        System.out.println(a + b);
    }

    public void Add(float a, float b) {
        System.out.println(a + b);
    }

    public void Add(int... arr) {
        int sum = 0;
        for (int a :
                arr) {
            sum += a;
        }
        System.out.println(sum);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Sum S = new Sum();
        S.Add();
        S.Add(12, 20);
        S.Add(45.2f, 42.12f);
        S.Add(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
