package org.example.generics.example2.creator;

public interface Creator<T,U,V>{
    T apply (U id, V name);
}
