package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        int result1 = p.product(3, 5);
        System.out.println(result1);

        int result2 = p.product(2, 4, 6);
        System.out.println(result2);

        int result3 = p.product(2, 4, 6,8);
        System.out.println(result3);
    }
static class Product{
    public int product(int x, int y) {
        return x * y;
    }
    public int product(int x, int y, int z) {
        return x * y * z;
    }
    public int product(int x, int y, int z, int f) {
        return x * y * z * f;
        }
     }
}