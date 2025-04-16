package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab243_AL {
    public static void main(String[] args) {

//By default, initial capacity of Arraylist is 10 ArrayList(10)
        List list = new ArrayList();

        list.add("1");//0
        list.add("2");//1
        list.add("3");//2
        list.add("3");//3
        list.add(4);//4
        list.add(true);//5

        System.out.println(list.size());//6
        System.out.println(list.isEmpty());//false
        System.out.println(list.contains("2"));//true
        System.out.println(list.contains(1));//false
//indesxOf-> Return the index of first occurrence of elemen tin the field
        System.out.println(list.indexOf("3"));//2
        System.out.println(list.lastIndexOf("3"));//3

        System.out.println(list);//[1, 2, 3, 3, 4, true]

        System.out.println("------");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
         list.clear();
        System.out.println(list);//[]
    }

}
//javap java.util.ArrayList->all the function which is present in Java Array List Class
//public class java.util.ArrayList<E> extends java.util.AbstractList<E> implements java.util.List<E>, java.util.RandomAccess, java.lang.Cloneable, java.io.Serializable {
//  transient java.lang.Object[] elementData;
//  public java.util.ArrayList(int);
//  public java.util.ArrayList();
//  public java.util.ArrayList(java.util.Collection<? extends E>);
//  public void trimToSize();
//  public void ensureCapacity(int);
//  public int size();
//  public boolean isEmpty();
//  public boolean contains(java.lang.Object);
//  public int indexOf(java.lang.Object);
//  int indexOfRange(java.lang.Object, int, int);
//  public int lastIndexOf(java.lang.Object);
//  int lastIndexOfRange(java.lang.Object, int, int);
//  public java.lang.Object clone();
//  public java.lang.Object[] toArray();
//  public <T> T[] toArray(T[]);
//  E elementData(int);
//  static <E> E elementAt(java.lang.Object[], int);
//  public E get(int);
//  public E getFirst();
//  public E getLast();
//  public E set(int, E);
//  public boolean add(E);
//  public void add(int, E);
//  public void addFirst(E);
//  public void addLast(E);
//  public E remove(int);
//  public E removeFirst();
//  public E removeLast();
//  public boolean equals(java.lang.Object);
//  boolean equalsRange(java.util.List<?>, int, int);
//  public int hashCode();
//  int hashCodeRange(int, int);
//  public boolean remove(java.lang.Object);
//  public void clear();
//  public boolean addAll(java.util.Collection<? extends E>);
//  public boolean addAll(int, java.util.Collection<? extends E>);
//  protected void removeRange(int, int);
//  public boolean removeAll(java.util.Collection<?>);
//  public boolean retainAll(java.util.Collection<?>);
//  boolean batchRemove(java.util.Collection<?>, boolean, int, int);
//  public java.util.ListIterator<E> listIterator(int);
//  public java.util.ListIterator<E> listIterator();
//  public java.util.Iterator<E> iterator();
//  public java.util.List<E> subList(int, int);
//  public void forEach(java.util.function.Consumer<? super E>);
//  public java.util.Spliterator<E> spliterator();
//  public boolean removeIf(java.util.function.Predicate<? super E>);
//  boolean removeIf(java.util.function.Predicate<? super E>, int, int);
//  public void replaceAll(java.util.function.UnaryOperator<E>);
//  public void sort(java.util.Comparator<? super E>);
//  void checkInvariants();
//  static {};