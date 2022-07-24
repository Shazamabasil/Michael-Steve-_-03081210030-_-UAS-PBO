public class Login {
    String KodeLogin;
    String UName;
    String Pass;


    public Login() {
    }

    public Login(String KodeLogin, String UName, String Pass) {
        this.KodeLogin = KodeLogin;
        this.UName = UName;
        this.Pass = Pass;
    }

    public String getKodeLogin() {
        return this.KodeLogin;
    }

    public void setKodeLogin(String KodeLogin) {
        this.KodeLogin = KodeLogin;
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
            " KodeLogin='" + getKodeLogin() + "'" +
            ", UName='" + getUName() + "'" +
            ", Pass='" + getPass() + "'" +
            "}";
    }

    /*public void LupaPass(){
        for (UName uname1 : Uname) {
            
        }
    }
*/
}