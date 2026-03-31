class MesinKopi {
    Double bijikopi;
    Double air;
    Double susu;

    void isiUlang(Double bijikopi, Double air, Double susu){
        this.bijikopi += bijikopi;
        this.air += air;
        this.susu += susu;

        System.out.println("bahan baku berhasil di isi ulang.");
    }

    boolean cektersediaCappucino(){
        if (bijikopi >= 15.0 && air >= 50.0 && susu >= 100.0){
            return true;
        } else{
            return false;
        }
    }

    MesinKopi(){
        bijikopi = 0.0;
        air = 0.0;
        susu = 0.0;
    }

    
}