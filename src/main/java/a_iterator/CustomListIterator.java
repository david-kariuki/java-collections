/**
 * @note If you have a special, custom-made type of collection, you can implement the Java Iterator
 *     interface yourself to create an Iterator that can iterate through the elements of your custom
 *     collection.
 * @note In the code below, the iterator is implemented on a standard Java List . It won't be a
 *     fully perfect implementation as it will not be able to detect changes to the contents of the
 *     List during iteration, but it is enough to give you an idea about how an Iterator
 *     implementation could look.
 * @author David Kariuki
 * @since 11/01/2023
 */
package a_iterator;

import java.util.Iterator;
import java.util.List;

public class CustomListIterator<T> implements Iterator<T> {

    private final List<T> source;
    private int index = 0;

    public CustomListIterator(List<T> source) {
        this.source = source;
    }


    @Override
    public boolean hasNext() {
        return this.index < this.source.size();
    }

    @Override
    public T next() {
        return this.source.get(this.index++);
    }
}
