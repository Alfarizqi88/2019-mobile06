package id.ac.polinema.idealbodyweight.Util;

public class BmiIndex {
    private float cek;
    private float massa;
    private float height;

    public BmiIndex(float massa, float height) {
        this.massa = massa;
        this.height = height;
        this.calculate();
    }

    private float calculate() {
        return this.cek = this.massa / (this.height * this.height);
    }
    public String bmiideal() {
        String s = "";
        if (this.cek < 18.50) {
            s = "Underweight";
        } else if (this.cek >= 18.50 && this.cek <= 24.99) {
            s = "Healty Weight";
        } else if (this.cek >=25 && this.cek <= 29.99) {
            s = "Pre-obese";
        }else if (this.cek >= 30 && this.cek <=34.99){
            s = "obese class 1";
        }else if (this.cek >= 40 && this.cek <=39.99){
            s = "obese class 2";
        }else if (this.cek >= 40){
            s = "obese class 3";
        }
        return s;
    }
}
