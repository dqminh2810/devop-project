import static org.junit.Assert.*;

public class UserTest {
    User user;
    @org.junit.Before
    public void setUp() throws Exception {
        user = new User("test name");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        user = null;
    }

    @org.junit.Test
    public void getName() {
        assertEquals("test name", user.getName());
        user.setName("minh");
        assertEquals("minh", user.getName());
    }

    @org.junit.Test
    public void setName() {
        user.setName("minh");
        assertEquals("minh", user.getName());
    }
}