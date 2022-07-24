public class Petugas{
    String IDPetugas;
    String NamaPetugas;
    String Email;
    String AlamatPetugas;
    String UName;
    String Pass;
    

    public Petugas() {
    }

    public Petugas(String IDPetugas, String NamaPetugas, String Email, String AlamatPetugas, String UName, String Pass) {
        this.IDPetugas = IDPetugas;
        this.NamaPetugas = NamaPetugas;
        this.Email = Email;
        this.AlamatPetugas = AlamatPetugas;
        this.UName = UName;
        this.Pass = Pass;
    }

    public String getIDPetugas() {
        return this.IDPetugas;
    }

    public void setIDPetugas(String IDPetugas) {
        this.IDPetugas = IDPetugas;
    }

    public String getNamaPetugas() {
        return this.NamaPetugas;
    }

    public void setNamaPetugas(String NamaPetugas) {
        this.NamaPetugas = NamaPetugas;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAlamatPetugas() {
        return this.AlamatPetugas;
    }

    public void setAlamatPetugas(String AlamatPetugas) {
        this.AlamatPetugas = AlamatPetugas;
    }

    public String getUName() {
        return this.UName;
    }

    public void setUName(String UName) {
        this.UName = UName;
    }

    public String getPass() {
        return this.Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
    @Override
    public String toString() {
        return "{" +
            " IDPetugas='" + getIDPetugas() + "'" +
            ", NamaPetugas='" + getNamaPetugas() + "'" +
            ", Email='" + getEmail() + "'" +
            ", AlamatPetugas='" + getAlamatPetugas() + "'" +
            ", UName='" + getUName() + "'" +
            ", Pass='" + getPass() + "'" +
            "}";
    }

} 