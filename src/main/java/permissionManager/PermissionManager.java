package permissionmanager;

 enum PermissionLevel {
    ADMIN, DEVELOPER, USER;
}

public class PermissionManager {
    private  PermissionLevel mCurrentLevel = PermissionLevel.USER;
  
    public void set(PermissionLevel level){
        this.mCurrentLevel = level;
    } 

    public String get(){
        return this.mCurrentLevel.name();
    }
}
