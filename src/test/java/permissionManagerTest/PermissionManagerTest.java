import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import permissionmanager.PermissionManager;
import permissionlevel.PermissionLevel;

public class PermissionManagerTest {
    
    @Test
    void testSetter(){
        PermissionManager permissionManager = new PermissionManager();
        PermissionLevel testLevel = PermissionLevel.ADMIN;

        //act
        permissionManager.set(testLevel);

        assertEquals(testLevel, permissionManager.get());

        
        String level = permissionManager.getPermissionLevel();
        assertEquals("ADMIN", level);
    } 

}
