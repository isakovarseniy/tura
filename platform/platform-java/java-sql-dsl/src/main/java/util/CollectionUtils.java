package util;

import java.util.Collection;
import java.util.Iterator;


public class CollectionUtils {

    public static boolean isEmpty(Collection<?> coll) {
        return (coll == null || coll.isEmpty());
    }
    
    public static boolean exists(Collection<?> collection, Predicate predicate) {
        if (collection != null && predicate != null) {
            for (Iterator<?> it = collection.iterator(); it.hasNext();) {
                if (predicate.evaluate(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }   
}
