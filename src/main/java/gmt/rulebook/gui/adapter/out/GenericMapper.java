package gmt.rulebook.gui.adapter.out;

public interface GenericMapper<P, E> {
    P mapFromEntityToModel(E entity);
    E mapFromModelToEntity(P model);
}
