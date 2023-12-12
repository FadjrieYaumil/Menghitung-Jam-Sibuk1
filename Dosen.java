class Dosen extends Elemen {
private int jumlahHariKerja;

public Dosen(String nama, int jumlahHariKerja) {
        super(nama);
        this.jumlahHariKerja = jumlahHariKerja;
    }

public String toString() {
        return getNama() + "Seorang dosen dengan jam sibuk" + getJamSibuk();
    }

public int getJamSibuk() {
        return jumlahHariKerja * 8;
    }
}
