package yangliu;

/**
 * Created with IntelliJ IDEA.
 * User: hwen
 * Date: 2/27/13
 * Time: 1:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyWork {
    public String getOutput(int i) {
        if(i%15 == 0)  return "FuzzBuzz";
        else if( i%3 == 0 )return "Fuzz";
        else if(i%5 == 0)return "Buzz";
        return ""+i;
    }

    public void getAllOutput(){
        for(int i=1; i<100; i++){
            String ret = getOutput(i);
            System.out.println(ret);
        }
    }


}
