package br.edu.ifpe.recife.model.classes;

import br.edu.ifpe.recife.model.classes.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-13T13:52:22")
@StaticMetamodel(ItemOferta.class)
public class ItemOferta_ { 

    public static volatile SingularAttribute<ItemOferta, Double> preco;
    public static volatile SingularAttribute<ItemOferta, Integer> codigo;
    public static volatile SingularAttribute<ItemOferta, Produto> produto;
    public static volatile SingularAttribute<ItemOferta, String> obsevarcoes;
    public static volatile SingularAttribute<ItemOferta, Integer> quantidade;

}