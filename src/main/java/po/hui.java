package po;

import java.io.Serializable;

public class hui implements Serializable {
    private String uname;
    private String passwd;

    public hui() {
    }
    public hui(String uname, String passwd) {
        this.uname = uname;
        this.passwd = passwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
