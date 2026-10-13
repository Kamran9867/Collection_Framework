import com.sun.jdi.ArrayReference;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        // list or collection -> interface
//
//        //ArrayList -> concrete class
//        ArrayList<Integer> list = new ArrayList<>();
////        //add
//        list.add(10);
//        list.add(20);
//        list.add(30);
//
//        System.out.println(list);
//        list.add(40);
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);
//
//        //adAll
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(101);
//        list2.add(102);
//        list2.add(20);
//        list.addAll(list2);
//        System.out.println(list);
//        list.removeAll(list2);
//        System.out.println(list);
//
//        System.out.println(list.size());
//
//        System.out.println("printing list2: "+ list2);
//        list2.clear();
//        System.out.println(list2.size());
//        // I want to traverse list using iterator
//        Iterator<Integer> itr = list.iterator();
//
//        while (itr.hasNext()){
//            System.out.println("Elements: "+itr.next());
//        }
//
//        List<Integer> list3 = new ArrayList<>();
//        list3.add(11);
//        list3.add(12);
//        list3.add(13);
//        System.out.println(list3.get(2));
//        System.out.println("before set: "+list3);
//        list3.set(0,100);
//        System.out.println("after set: "+list3);




//        Collection<Integer> coll= new ArrayList<>();
//        toArray
//           Object[] arr =list3.toArray();
//           for(Object obj : arr){
//               System.out.println(obj);
//           }
//
//           // contains method
////          list3.contains(100);
//        System.out.println(list3.contains(100));
//
//           list.add(12);
//           list.add(6);
//        System.out.println(list);
//
//        // sort  an arrayList
//        Collections.sort(list);
//        System.out.println("print entire list "+list);
//
//        // clone
//        ArrayList<Integer> newList= (ArrayList<Integer>)list.clone();
//        System.out.println(newList);
//
//        // ensureCapacity
//        ArrayList<Integer> marks = new ArrayList<>();
//        marks.ensureCapacity(100);
//
//        // isEmpty() --> check
//        System.out.println(marks.isEmpty());
//
//        //indexOf()
//        System.out.println(newList.indexOf(40));

        // java Linked list
        List<Integer> list = new LinkedList<>();
        //add
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        list.add(40);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        //adAll
        List<Integer> list2 = new LinkedList<>();
        list2.add(101);
        list2.add(102);
        list2.add(20);
        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("printing list2: "+ list2);
        list2.clear();
        System.out.println(list2.size());
        // I want to traverse list using iterator
        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()){
            System.out.println("Elements: "+itr.next());
        }

        List<Integer> list3 = new LinkedList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);
        System.out.println(list3.get(2));
        System.out.println("before set: "+list3);
        list3.set(0,100);
        System.out.println("after set: "+list3);




//        Collection<Integer> coll= new ArrayList<>();
//        toArray
        Object[] arr =list3.toArray();
        for(Object obj : arr){
            System.out.println(obj);
        }

        // contains method
//          list3.contains(100);
        System.out.println(list3.contains(100));

        list.add(12);
        list.add(6);
        System.out.println(list);

        // sort  an arrayList
        Collections.sort(list);
        System.out.println("print entire list "+list);

        // clone
//        LinkedList<Integer> newList= (LinkedList<Integer>)list.clone();
//        System.out.println(newList);

        // ensureCapacity
        LinkedList<Integer> marks = new LinkedList<>();
//        marks.ensureCapacity(100);

        // isEmpty() --> check
        System.out.println(marks.isEmpty());
        list.add(30);
        list.add(24);
        list.add(30);
        System.out.println("Printing original list: "+list);
        System.out.println(list.lastIndexOf(30));
//        System.out.println(list.indexOf(40));


//        addFirst and addLast
        list.remove(3);
        list.remove(3);
        list.remove(3);
        list.remove(3);
        System.out.println("print original list :"+list);
//        list.addFirst(101);
//        System.out.println(list);


        LinkedList<Integer> lk = new LinkedList<>();
        lk.add(10);
        lk.addFirst(1);
        System.out.println(lk);
        lk.addLast(101);
        System.out.println(lk);
//        lk.removeFirst();
//        System.out.println(lk);
//        lk.removeLast();
//        System.out.println(lk);
        System.out.println(lk.getFirst());
        System.out.println(lk.getLast());

        // peek()--> give head or first element of LinkedList
        System.out.println(lk.peek());
        //pole()
        System.out.println("Before : "+ lk);
        System.out.println("polling: " +lk.poll());
        System.out.println("After : "+lk);
        System.out.println(lk.offer(100));
//
// vector implementation
        List<Integer> v= new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        System.out.println(v);
        v.remove(0);
        System.out.println(v);
        v.clear();
        System.out.println(v);
        //indexOf()
//        System.out.println(newList.indexOf(40));

        // javaStack --> Implementation
//        Stack<Integer> st = new Stack<>();
////        //add
//       st.add(10);
//       st.add(20);
//        st.add(30);
//
//        System.out.println(st);
//        st.add(40);
//        System.out.println(st);
//        st.remove(0);
//        System.out.println(st);
////
////        //adAll
//        List<Integer> st2 = new Stack<>();
//        st2.add(101);
//        st2.add(102);
//        st2.add(20);
//        st.addAll(st2);
//        System.out.println(st);
//        st.removeAll(st2);
//        System.out.println(st);
//
//        System.out.println(st.size());
//
//        System.out.println("printing st2: "+ st2);
//        st2.clear();
//        System.out.println(st2.size());
//        // I want to traverse list using iterator
//        Iterator<Integer> iter = st.iterator();
//
//        while (iter.hasNext()){
//            System.out.println("Elements: "+iter.next());
//        }
//
//        List<Integer> st3 = new Stack<>();
//        st3.add(11);
//        st3.add(12);
//        st3.add(13);
//        System.out.println(st3.get(2));
//        System.out.println("before set: "+st3);
//        st3.set(0,100);
//        System.out.println("after set: "+st3);
//
        //push()

        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st);

        st.push(11);
        System.out.println(st);

        st.push(12);
        System.out.println(st);

        st.pop();
        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st.search(11));








    }
}