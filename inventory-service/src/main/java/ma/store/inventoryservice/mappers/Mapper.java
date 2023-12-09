package ma.store.inventoryservice.mappers;

public interface Mapper <X,Y>{
    X mapTo(Y y);
    Y mapFrom(X y);

}
