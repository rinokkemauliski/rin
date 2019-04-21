package data;

public class Data {
    private String id;
    private String nama;
    private String divisi;
    private String alamat;
    private int gaji;

    public Data(String id, String nama, String divisi, String alamat, int gaji) {
        this.id = id;
        this.nama = nama;
        this.divisi = divisi;
        this.alamat = alamat;
        this.gaji = gaji;
    }

    @Override
    public boolean equals(Object o) {
        Data dt = (Data) o;
        return id.equals(dt.getId());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
}
