/**
 * Created by alina on 11.06.17.
 */
public class IteratorApp {
    public static void main(String[] args) {
        ConcreteAggregate c = new ConcreteAggregate();
        Iterator it = c.getIterator();

        while (it.hasNext()){
            System.out.println((String)it.next());
        }
    }
}

class ConcreteAggregate implements Aggregate{ //самое первое с чего надо начать. Дя этого класса вся суматоха Tasks
    String[] tasks = {"прийти", "увидеть", "победить"};

    @Override
    public Iterator getIterator() {
        return null;
    }

    private class TaskIterator implements Iterator{
        int index = 0;

        @Override
        public boolean hasNext() {
            if (index<tasks.length){
                return true;
            }
            else{
                return false;
            }
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
interface Iterator{
    boolean hasNext();
    Object next();
}

interface Aggregate{ //container
    Iterator getIterator();
}




