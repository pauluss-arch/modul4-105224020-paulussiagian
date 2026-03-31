public class Main{
    public static void main(String[] args) {
        
        MesinKopi mesinLobby = new MesinKopi();

        mesinLobby.isiUlang(20.0,100.0,150.0);

        boolean tersedia = mesinLobby.cektersediaCappucino();

        System.out.println("cappucino tersedia:" + tersedia);
    }
}