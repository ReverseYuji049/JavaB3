import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double p;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lado a: ");
        double l1 = sc.nextDouble();
        System.out.print("Lado b: ");
        double l2 = sc.nextDouble();
        System.out.print("Lado c: ");
        double l3 = sc.nextDouble();

        p = (l1 + l2 + l3) / 2;
        double areaX = Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
        System.out.print("Área do tri x: " + areaX);

        System.out.print("Lado a: ");
        l1 = sc.nextDouble();
        System.out.print("Lado b: ");
        l2 = sc.nextDouble();
        System.out.print("Lado c: ");
        l3 = sc.nextDouble();

        p = (l1 + l2 + l3) / 2;
        double areaY = Math.sqrt(p * (p - l1) * (p - l2) * (p - l3));
        System.out.print("Área do tri x: " + areaY);

        if (areaX > areaY){
            System.out.print("Tri X is bigger!");
        } else {
            System.out.print("Tri Y is bigger!");
        }
    }
}