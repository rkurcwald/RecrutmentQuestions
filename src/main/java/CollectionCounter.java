import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CollectionCounter {
    Collection<Object> objects= new ArrayList<>();

    public CollectionCounter(Collection<Object> listOfObjects) {

            objects.addAll(listOfObjects);

    }
    public CollectionCounter(Collection<Object> listOfObjects,Collection<Object> listOfLists ) {
            objects.addAll(listOfObjects);
         //   for(Object a :listOfLists) {
                objects.add(listOfLists);
         //   }
    }


    public int countObjects()
    {
        int counter=0;
        for(Object a: objects)
        {
            if(a instanceof Object)
            {
                counter++;
            }

        }
        return counter;
    }


}
