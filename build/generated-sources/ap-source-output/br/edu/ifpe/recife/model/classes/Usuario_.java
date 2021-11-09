package br.edu.ifpe.recife.model.classes;

import br.edu.ifpe.recife.model.classes.Avaliacao;
import br.edu.ifpe.recife.model.classes.Oferta;
import br.edu.ifpe.recife.model.classes.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-09T18:09:22")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> senha;
    public static volatile SingularAttribute<Usuario, Integer> codigo;
    public static volatile SingularAttribute<Usuario, String> telefone;
    public static volatile ListAttribute<Usuario, Avaliacao> recebidas;
    public static volatile SingularAttribute<Usuario, String> endereco;
    public static volatile ListAttribute<Usuario, Oferta> ofertas;
    public static volatile SingularAttribute<Usuario, String> cpf;
    public static volatile SingularAttribute<Usuario, String> nome;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile ListAttribute<Usuario, Pedido> realizados;
    public static volatile SingularAttribute<Usuario, String> cep;

}