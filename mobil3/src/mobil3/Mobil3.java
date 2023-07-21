/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobil3;
public class Mobil3 {
    // Atribut
    private String merek;
    private int tahunProduksi;
    private String warna;
    private int kecepatan;

    // Konstruktor
    public Mobil3(String merek, int tahunProduksi, String warna, int kecepatan) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    // Getter dan Setter untuk setiap atribut
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    // Contoh penggunaan
    public static void main(String[] args) {
        Mobil3 mobil = new Mobil3("Avansa", 2020, "putih", 180);
        System.out.println("Merek: " + mobil.getMerek());
        System.out.println("Tahun Produksi: " + mobil.getTahunProduksi());
        System.out.println("Warna: " + mobil.getWarna());
        System.out.println("Kecepatan: " + mobil.getKecepatan() + " km/h");
    }
}
