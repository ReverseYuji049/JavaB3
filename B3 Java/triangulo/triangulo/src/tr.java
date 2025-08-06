public class tr {
    public double A;
    public double B;
    public double C;
    //return value
    public double calcularArea(){
        double p = (A + B + C) / 2;
        double area = Math.sqrt(p * (p - A) * (p - B) * (p - C));
        return area;
    }
    public void verifyType(){
        if (A == B && A == C){
            System.out.print(" equilátero!");
        } else if((A == B && A != C) || (A == C && A != B) || (B == C && B != A)){
            System.out.print(" isósceles.");

        } else {
            System.out.print(" escaleno!");
        }
    }

}
