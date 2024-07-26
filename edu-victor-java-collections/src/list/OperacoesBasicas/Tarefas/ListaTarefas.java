package list.OperacoesBasicas.Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //atributo utilizando generics
    private List<Tarefa> tarefaList;

    //criar construtor da lista tarefa (m2 -> generate)

    //public ListaTarefas(List<Tarefa> tarefaList) {
    //    this.tarefaList = tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        //criar uma lista de tarefas para remover caso tenham descrições repetidas
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        //size retorna int e quantos elementos existem dentro da lista
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }
}
