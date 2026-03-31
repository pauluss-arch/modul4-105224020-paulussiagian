class Mahasiswa {
    String nama;
    int umur;
    String jurusan;

    
    public Mahasiswa(String nama, int umur, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    public void belajar(){
        System.out.println(nama + "sedang belajar");
    }

    public void gantiprodi(String jurusan){
        this.jurusan = jurusan;
    };

    public void tampilkan(){
        System.out.println(nama + nama);
        System.out.println(umur + umur);
        System.out.println(jurusan + jurusan);
    }

}   