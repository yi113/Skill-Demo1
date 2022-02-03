import static org.junit.Assert.assertEquals;

import java.lang.annotation.Target;

import org.junit.Test;

public class SkillDemoTest {
    @Test
    public void division(){
        assertEquals(3, SkillDemo.intDivision(6, 2));
    }
}
