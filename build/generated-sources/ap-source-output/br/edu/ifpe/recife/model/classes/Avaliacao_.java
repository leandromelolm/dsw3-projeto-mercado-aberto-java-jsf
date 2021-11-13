package br.edu.ifpe.recife.model.classes;

import br.edu.ifpe.recife.model.classes.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-13T13:52:22")
@StaticMetamodel(Avaliacao.class)
public class Avaliacao_ { 

    public static volatile SingularAttribute<Avaliacao, Integer> pontuacao;
    public static volatile SingularAttribute<Avaliacao, Integer> codigo;
    public static volatile SingularAttribute<Avaliacao, Date> dataAvaliacao;
    public static volatile SingularAttribute<Avaliacao, String> titulo;
    public static volatile SingularAttribute<Avaliacao, String> comentario;
    public static volatile SingularAttribute<Avaliacao, Usuario> autor;

}