package br.edu.ifpe.recife.model.classes;

import br.edu.ifpe.recife.model.classes.ItemPedido;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-09T17:52:29")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Integer> codigo;
    public static volatile SingularAttribute<Pedido, ItemPedido> item;
    public static volatile SingularAttribute<Pedido, Date> dataEntrega;
    public static volatile SingularAttribute<Pedido, Date> dataCompra;
    public static volatile SingularAttribute<Pedido, String> status;

}