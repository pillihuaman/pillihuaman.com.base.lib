package pillihuaman.com.lib.commons;

public interface GenericMapper<D, E> {

    public D toDto(E e);

    public E toEntity(D d);

}