package yangliu;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MyWorkTest {

    @Test
    public void shouldInput3PrintFuzz(){
        MyWork work = new MyWork();
        String str = work.getOutput(3);

        assertThat("Fuzz" ,is(str));
    }

    @Test
    public void shouldInput5PringBuzz(){
        MyWork work = new MyWork();
        String str = work.getOutput(5);

        assertThat("Buzz" ,is(str));

    }

    @Test
    public void shouldInput15PrintFuzzBuzz(){
        MyWork work = new MyWork();
        String str = work.getOutput(15);

        assertThat("FuzzBuzz",is(str));
    }

    @Test
    public void shouldInput4Print4(){
        MyWork work = new MyWork();
        String str = work.getOutput(4);
        assertThat("4" , is(str));
    }
    @Test
    public void shouldInput3timesPrintFuzz(){
        MyWork work = new MyWork();
        String str = work.getOutput(9);

        assertThat("Fuzz", is(str));
    }

    @Test
    public void shouldInput5timesPrintBuzz(){
        MyWork work = new MyWork();
        String str = work.getOutput(25);

        assertThat("Buzz", is(str));
    }

    @Test
    public void shouldInput3and5timesPrintFuzzBuzz(){
        MyWork work = new MyWork();
        String str = work.getOutput(30);

        assertThat("FuzzBuzz", is(str));
    }

}
