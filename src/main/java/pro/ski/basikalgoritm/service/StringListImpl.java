package pro.ski.basikalgoritm.service;

import pro.ski.basikalgoritm.exception.ExceptionInvalidIndex;
import pro.ski.basikalgoritm.exception.ExceptionNotFound;
import pro.ski.basikalgoritm.exception.ExceptionSize;
import pro.ski.basikalgoritm.exception.ExceptionNull;

import java.util.Arrays;

public class StringListImpl implements StringList {
    private String[] storage;
    private int size;

    public StringListImpl() {
        storage = new String[10];
    }

    public StringListImpl(int initSize) {
        storage = new String[initSize];
    }

    private void validItem(String item) {
        if (item == null) {
            throw new ExceptionNull();
        }
    }

    private void validSize() {
        if (size == storage.length) {
            throw new ExceptionSize();
        }
    }

    private void validIndex(int index) {
        if (index < 0 || index > size) {
            throw new ExceptionInvalidIndex();
        }
    }

    @Override
    public String add(String item) {
        validSize();
        validItem(item);
        storage[size++]=item;
        return item;
    }

    @Override
    public String add(int index, String item) {
        validSize();
        validItem(item);
        validIndex(index);
        if(index == size){
            storage[size++]=item;
            return item;
        }
        System.arraycopy(storage, index, storage, index + 1, size - index);
        storage[index] = item;
        size++;
        return item;
    }

    @Override
    public String set(int index, String item) {
        validIndex(index);
        validItem(item);
        storage[index] = item;
        return item;
    }

    @Override
    public String remove(String item) {
        validItem(item);
        int index = indexOf(item);
        if(index == -1){
            throw new ExceptionNotFound();
        }
        if (index != size) {
            System.arraycopy(storage, index + 1, storage, index, size - index);
        }
        size--;
        return item;
    }

    @Override
    public String remove(int index) {
        validIndex(index);
        String item = storage[index];
        if (index != size) {
            System.arraycopy(storage, index + 1, storage, index, size - index);
        }
        size--;
        return item;
    }

    @Override
    public boolean contains(String item) {
        return indexOf(item) > -1;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            if (storage[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = size - 1; i >= 0; i--) {
            if (storage[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        validIndex(index);
        return storage[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        return Arrays.equals(toArray(), otherList.toArray());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public String[] toArray() {
        return Arrays.copyOf(storage, size);
    }
}
