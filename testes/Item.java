package Alpha02.testes;

/*ToDo: Como saber qual objeto passar de parametro para o Item?
 */
public abstract class Item {
    
    private int quantidade=1;
    private int valor;
    private String nome;
    
    public abstract int usar(Object alvo);//faz o efeito do Item e retorna quantos itens restam
    
    public abstract boolean ehBebivel();//para diferenciar alvo inimigo e personagem (se um Item eh bebivel ele recebe um heroi como alvo, se nao, recebe os inimigos)
    
    public void setQuantidade(){
        this.quantidade++;
    }
    
    public void setQuantidade(int q){
        this.quantidade=q;
    }
    
    public int getQuantidade() {return quantidade;}
    public int getValor() {return valor;}
    public void setValor(int valor) {this.valor = valor;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
}
