packge com.senai.backend.gerente.models; 

@Entity
@table(name= "Usuario")
public class Usuario{

@Id
@GeneratedValue(Strategy=GenerationType.INDENTITY)
@Column(name="id")
private Integer usuarioId;

@Column(name="nome")
private String nome;

@Column(name="email")
private String email;

@Column(name="cpf")
private String cpf;

@Column(name="cpf")
private String cpf;

@Column(name="data_nascimento")
private String data_nascimento;

@ManyToMany
@JoinTable(
name ="usuario_tarefas,JoinColumns =@JoinColumn(name= "id_usuario", referencedColumnName ="usuarioId")                                              
inverseJoinColumn = @JoinColumn(name ="id usuario_tarefa,referencedColumnName =tarefaId)                                                                                   
 

@Column






}
