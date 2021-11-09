package br.edu.ifpe.recife.model.classes;

import br.edu.ifpe.recife.model.classes.Oferta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-09T18:09:22")
@StaticMetamodel(ItemPedido.class)
public class ItemPedido_ { 

    public static volatile SingularAttribute<ItemPedido, Double> preco;
    public static volatile SingularAttribute<ItemPedido, Integer> codigo;
    public static volatile SingularAttribute<ItemPedido, Oferta> oferta;
    public static volatile SingularAttribute<ItemPedido, Integer> quantidade;

}