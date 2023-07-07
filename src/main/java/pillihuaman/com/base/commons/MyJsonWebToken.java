package pillihuaman.com.base.commons;


import org.bson.types.ObjectId;
import org.jboss.resteasy.jwt.JsonWebToken;

import java.io.Serializable;

public class MyJsonWebToken extends JsonWebToken implements Serializable {

    private static long serialVersionUID = 1L;


    private User user;
    private Aplication aplication;


    public MyJsonWebToken() {
        super();
        user = new MyJsonWebToken.User();
        aplication = new Aplication();


    }


    public static class User {

        public ObjectId getIdUser() {
            return idUser;
        }

        public void setIdUser(ObjectId idUser) {
            this.idUser = idUser;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getChangePassword() {
            return changePassword;
        }

        public void setChangePassword(String changePassword) {
            this.changePassword = changePassword;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        private ObjectId idUser;
        private String user;
        private String changePassword;
        private String mail;

    }


    public static class Aplication {

        public ObjectId getAplicationID() {
            return aplicationID;
        }

        public void setAplicationID(ObjectId aplicationID) {
            this.aplicationID = aplicationID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMultiSession() {
            return multiSession;
        }

        public void setMultiSession(String multiSession) {
            this.multiSession = multiSession;
        }

        private ObjectId aplicationID;
        private String name;
        private String multiSession;

    }


    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }


    /**
     * @param serialversionuid the serialversionuid to set
     */
    public static void setSerialversionuid(long serialversionuid) {
        serialVersionUID = serialversionuid;
    }


    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(ObjectId idUser) {
        this.user.idUser = idUser;
    }


    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user.user = user;
    }


    /**
     * @param changePassword the changePassword to set
     */
    public void setChangePassword(String changePassword) {
        this.user.changePassword = changePassword;
    }


    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.user.mail = mail;
    }


    /**
     * @param aplicationID the aplicationID to set
     */
    public void setAplicationID(ObjectId aplicationID) {
        this.aplication.aplicationID = aplicationID;
    }


    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.aplication.name = name;
    }


    /**
     * @param multiSession the multiSession to set
     */
    public void setMultiSession(String multiSession) {
        this.aplication.multiSession = multiSession;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAplication(Aplication aplication) {
        this.aplication = aplication;
    }

    public Aplication getAplication() {
        return aplication;
    }
}
