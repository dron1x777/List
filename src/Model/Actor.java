package Model;

public class Actor {
    private String actorFullName;
    private String role;

    public Actor(String actorFullName, String role) {
        this.actorFullName = actorFullName;
        this.role = role;
    }

    public void  setActorFullName(String actorFullName) {
        this.actorFullName = actorFullName;
    }
    public String getActorFullName() {
        return actorFullName;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorFullName='" + actorFullName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
