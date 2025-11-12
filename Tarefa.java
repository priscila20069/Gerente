packge com.senai.backend.gerente.models; 

@Entity
@table(name="tarefa")
public class tarefa{
@Id
@GeneratedValue(Strategy=GenerationType.INDENTITY)
@Column(name="id")

private Integer tarefaId;
@Column(name="nome")
private String nome;

@Column(name="descriçao")  
private String descriçao;


}