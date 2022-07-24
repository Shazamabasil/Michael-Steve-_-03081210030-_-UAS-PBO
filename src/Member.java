public class Member {
    int IDMember;
    String Nama;
    String Alamat;
    String NoHP;

    public Member() {
    }

    public Member(int IDMember, String Nama, String Alamat, String NoHP) {
        this.IDMember = IDMember;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.NoHP = NoHP;
    }

    public int getIDMember() {
        return this.IDMember;
    }

    public void setIDMember(int IDMember) {
        this.IDMember = IDMember;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return this.Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNoHP() {
        return this.NoHP;
    }

    public void setNoHP(String NoHP) {
        this.NoHP = NoHP;
    }

    @Override
    public String toString() {
        return "{" +
            " IDMember='" + getIDMember() + "'" +
            ", Nama='" + getNama() + "'" +
            ", Alamat='" + getAlamat() + "'" +
            ", NoHP='" + getNoHP() + "'" +
            "}";
    }

} 