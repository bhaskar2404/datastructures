package org.desingpattern.dynamicarray;

import javax.swing.text.html.parser.Entity;
import java.util.LinkedList;

public class CustomHashMap <K,V>{

    private static final int DEFAULT_CAPACITY = 16;

    private  static final double LOAD_FACTOR=0.75;

    private LinkedList<Entry<K,V>>[] buckets;
    private int size=0;

    public CustomHashMap(){
        this(DEFAULT_CAPACITY);
    }
    public CustomHashMap(int initialCapacity){
        this.buckets=new LinkedList[initialCapacity];
        this.size=0;
    }

    public void put(K key,V value){
        if(key==null){
            throw new IllegalArgumentException("Key cannot be null");
        }
        int index=getIndex(key);
        if(buckets[index]==null){
            buckets[index]=new LinkedList<>();

        }

        for(Entry<K,V> entry:buckets[index]){
            if(entry.getKey()==key){
                entry.setValue(value);
                return;
            }
        }
        buckets[index].add(new Entry<>(key,value));
        size++;

        if((double)size/ buckets.length>LOAD_FACTOR){
            resize();
        }
    }

    public V get(K key){
        int index=getIndex(key);

        LinkedList<Entry<K,V>> bucket=buckets[index];
        if(bucket!=null){
            for(Entry<K,V> entry:bucket){
                if(entry.getKey()==key){
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(LinkedList<Entry<K,V>> bucket:buckets){
            if(bucket!=null){

                for(Entry<K,V> entry:bucket){
                    sb.append(entry.getKey()+" -> "+entry.getValue()+",");
                }


            }
        }
        if(sb.length()>1){
            sb.deleteCharAt(sb.length() - 1);
        }

        sb.append("]");
        return sb.toString();
    }
    private void resize(){
        int newCapacity=buckets.length*2;
        LinkedList<Entry<K,V>>[] newBuckets=new LinkedList[newCapacity];

        for(LinkedList<Entry<K, V>> bucket:buckets){
            if(bucket!=null){
               for(Entry<K,V> entry:bucket){
                    int index=entry.getKey().hashCode() %newCapacity;
                    if(newBuckets[index]==null){
                        newBuckets[index]=new LinkedList<>();
                    }
                    newBuckets[index].add(entry);
               }

            }

        }
        buckets=newBuckets;

    }
    private int getIndex(K key){
        return key.hashCode() % buckets.length;
    }


    private int size(){
        return size;
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }



}
