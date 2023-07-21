/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa1;
public class Mahasiswa1 {
    // Atribut
    private String nama;
    private String nim;
    private String jurusan;
    private float ipk;

    // Konstruktor
    public Mahasiswa1(String nama, String nim, String jurusan, float ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Getter dan Setter untuk setiap atribut
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    // Contoh penggunaan
    public static void main(String[] args) {
        Mahasiswa1 mahasiswa = new Mahasiswa1("MELIANA ", "C2083207010", "Informatika", 3.75f);
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Jurusan: " + mahasiswa.getJurusan());
        System.out.println("IPK: " + mahasiswa.getIpk());
    }
}
