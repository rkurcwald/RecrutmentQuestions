import junit.framework.TestCase;
import org.junit.Assert;

public class TwoIPAddressesTest extends TestCase {
    String[] ip={"192.168.1.1","192.168.1.5","192.168.1.10","192.168.1.120","192.168.1.250"};

    public void testIP_Pule1() {
        TwoIPAddresses p=new TwoIPAddresses(ip[0],ip[1]);
        Assert.assertEquals(4,p.pule());
    }
    public void testIP_Pule2() {
        TwoIPAddresses p=new TwoIPAddresses(ip[0],ip[2]);
        Assert.assertEquals(9,p.pule());
    }
    public void testIP_Pule3() {
        TwoIPAddresses p=new TwoIPAddresses(ip[0],ip[3]);
        Assert.assertEquals(119,p.pule());
    }
    public void testIP_Pule4() {
        TwoIPAddresses p=new TwoIPAddresses(ip[0],ip[4]);
        Assert.assertEquals(249,p.pule());
    }
    public void testIP_Pule5() {
        TwoIPAddresses p=new TwoIPAddresses(ip[4],ip[1]);
        Assert.assertEquals(245,p.pule());
    }
}