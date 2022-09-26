package permissionmanager;
import permissionlevel.PermissionLevel;
public class PermissionManager {
    private  PermissionLevel mCurrentLevel = PermissionLevel.USER;

    public PermissionLevel get() {
        return mCurrentLevel;
      }
    public void set(PermissionLevel level){
        this.mCurrentLevel = level;
    }

    public String getPermissionLevel() {
         String level = "USER";
        switch(mCurrentLevel){
            case ADMIN:
            level = "ADMIN";
            break;
            case DEVELOPER:
            level = "DEVELOPER";
            break;
            case USER:
            level = "USER";
            break;
            default:
            level = "USER";
            break;
        }
        return level;
        
    }
}