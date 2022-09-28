package permissionmanager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermissionManagerTest {
    @Test
    @DisplayName("Permission Level Test")
    void testSetter(){
        PermissionManager permissionManager = new PermissionManager();
        
        assertEquals("USER", permissionManager.get());
        permissionManager.set(PermissionLevel.ADMIN);
        assertEquals("ADMIN", permissionManager.get());

        permissionManager.set(PermissionLevel.DEVELOPER);
        assertEquals("DEVELOPER", permissionManager.get());

        permissionManager.set(PermissionLevel.USER);
        assertEquals("USER", permissionManager.get());
    }

}
