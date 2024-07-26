package list.OperacoesBasicas.Tarefas;

public class Tarefa {
    //atributo
    private String descricao;

    //adicionar metodo construtor (alt + insert)
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //criar metodo get para saber o valor da descricao private.
    public String getDescricao() {
        return descricao;
    }
}
