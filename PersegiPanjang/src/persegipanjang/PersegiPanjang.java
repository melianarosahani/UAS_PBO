/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persegipanjang;

public class PersegiPanjang {
    // Atribut
    private float panjang;
    private float lebar;

    // Konstruktor
    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Getter dan Setter untuk setiap atribut
    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    // Metode untuk menghitung luas persegi panjang
    public float hitungLuas() {
        return panjang * lebar;
    }

    // Contoh penggunaan
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(6.0f, 8.0f);
        System.out.println("Panjang: " + pp.getPanjang());
        System.out.println("Lebar: " + pp.getLebar());
        System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
    }
}