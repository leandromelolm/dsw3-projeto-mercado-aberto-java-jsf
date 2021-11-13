package br.edu.ifpe.recife.model.classes;

import br.edu.ifpe.recife.model.classes.Avaliacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-13T13:52:22")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, String> marca;
    public static volatile SingularAttribute<Produto, Integer> codigo;
    public static volatile ListAttribute<Produto, Avaliacao> avaliacoes;
    public static volatile SingularAttribute<Produto, String> categoria;
    public static volatile SingularAttribute<Produto, String> nome;
    public static volatile SingularAttribute<Produto, String> descricao;

}