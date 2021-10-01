import javax.crypto.IllegalBlockSizeException;
import java.util.ArrayList;
import java.util.List;

public class TwoIPAddresses {
    private String s1,s2;

    public TwoIPAddresses(String s1, String s2) {
        this.s1=s1;
        this.s2=s2;
    }

    public int pule()
    {
        String[] tabS1=getS1().split("\\.");
        String[] tabS2=getS2().split("\\.");
        if(tabS1.length>4 || tabS2.length>4)
        {
            throw new IndexOutOfBoundsException("Too many arguments");
        }
        else
        {
            List<Integer> lastParamTab=new ArrayList<>();
            lastParamTab.add(Integer.parseInt(tabS1[3]));
            lastParamTab.add(Integer.parseInt(tabS2[3]));
     //       System.err.println(lastParamTab.size()+ " "+ lastParamTab.get(0));
            int finalVal=lastParamTab.get(0)-lastParamTab.get(1);
            return finalVal>=0? finalVal: finalVal*(-1);
        }

    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }
}
