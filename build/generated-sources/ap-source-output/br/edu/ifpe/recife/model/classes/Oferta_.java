package br.edu.ifpe.recife.model.classes;

import br.edu.ifpe.recife.model.classes.ItemOferta;
import br.edu.ifpe.recife.model.classes.Pedido;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-13T13:52:22")
@StaticMetamodel(Oferta.class)
public class Oferta_ { 

    public static volatile SingularAttribute<Oferta, Integer> codigo;
    public static volatile SingularAttribute<Oferta, ItemOferta> item;
    public static volatile SingularAttribute<Oferta, Date> data;
    public static volatile ListAttribute<Oferta, Pedido> realizados;
    public static volatile SingularAttribute<Oferta, Date> validade;

}