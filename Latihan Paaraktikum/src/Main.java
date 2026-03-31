public class Main {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhsBaru = new Mahasiswa("Paulus Siagian",19 , "CS");

        mhsBaru.belajar();

        mhsBaru.tampilkan();

        mhsBaru.gantiprodi("HAHA");

        mhsBaru.tampilkan();
    }
}