package ma.store.orderservice.mappers;

public interface Mapper <X,Y>{
    X mapTo(Y y);
    Y mapFrom(X x);

}
