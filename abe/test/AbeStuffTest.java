import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class AbeStuffTest {
    @Test
    public void shouldHaveCat(){
        assertNotNull(new AbeStuff().cat);
    }

    @Test
    public void shouldHaveCatWhichHasDap(){
        assertNotNull(new AbeStuff().cat.dap);
    }

    @Test
    public void shouldHaveBar(){
        assertNotNull(new AbeStuff().bar);
    }
}
