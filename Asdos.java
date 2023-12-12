class Asdos extends Mahasiswa {

private int jamSibuk;

public Asdos(String nama, int SKS, int jamSibuk) {
        super(nama, SKS);
        this.jamSibuk = jamSibuk;
    }

public String toString() {
        return getNama() + "Seorang asdos dengan jam sībuk" + getJamSibuk();
    } 
    
public int getJamSibuk() {
        return super.getJamSibuk() + jamSibuk;
    }
}