package modul_5.pengolahan_nilai;

public abstract class Person {
    private String nama, id;

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void nama(String nama);

    public abstract void id(String id);

    public abstract void display();
}
