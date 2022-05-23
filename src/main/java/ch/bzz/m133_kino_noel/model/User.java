package ch.bzz.m133_kino_noel.model;

/**
 * @author noel
 * @version 1.0
 */
public class User {

    /**
     * @see User
     */
    private String userUUID;

    /**
     * empty Constructor
     */
    public User() {
    }

    /**
     * Constructor
     *
     * @param userUUID
     */
    public User(String userUUID) {
        this.userUUID = userUUID;
    }

    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }
}
