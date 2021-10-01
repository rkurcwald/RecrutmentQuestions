import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionCounterTest extends TestCase {

    public void testCollectionCounter() {
        Collection<Object> objects= new ArrayList<>();

        objects.add(new FirstClass());
        objects.add(new SecondClass());
        objects.add(new SecondClass("Hello"));

        CollectionCounter cc=new CollectionCounter(objects);
        Assert.assertEquals(3,cc.countObjects());
    }
    public void testCollectionCounter1() {
        Collection<Object> objects= new ArrayList<>();
        Collection<Object> objects2= new ArrayList<>();
        objects.add(new FirstClass());
        objects.add(new SecondClass());
        objects.add(new SecondClass("Hello2"));

        objects2.add(objects);
        objects2.addAll(objects);


        CollectionCounter cc=new CollectionCounter(objects,objects2);

        Assert.assertEquals(4,cc.countObjects());
    }
}