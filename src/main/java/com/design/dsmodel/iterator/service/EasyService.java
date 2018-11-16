/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.design.dsmodel.iterator.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author gang
 */
public class EasyService {

    //迭代模式和我们集合中的迭代是一样的,这里我们将集合的迭代模拟以下以展示迭代模式的逻辑
    public void iteratorTest() {
        List<String> list = Arrays.asList("小华", "小明", "小张", "小李");
        CollectionModel cm = new CollectionModel();

        Iterator iterator = cm.getIterator(list);
        for (; iterator.hasNext();) {
            System.out.println(iterator.next().toString());
        }
    }
}

//准备基础的
interface Iterator {

    public boolean hasNext();

    public Object next();
}

//模拟将集合转化为迭代器
class CollectionModel {

    Object[] collectionArray;

    public Iterator getIterator(Collection collection) {
        int i = 0;
        for (Object obj : collection) {
            collectionArray[i++] = obj;
        }
        return new IteratorImpl();
    }

    class IteratorImpl implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < collectionArray.length) {
                return true;
            }
            return false;

        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return collectionArray[index++];
            }
            return null;
        }
    }
}
