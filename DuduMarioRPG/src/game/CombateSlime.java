package game;

public class CombateSlime extends Combate{
    
    public CombateSlime(){
        Slime slimeAzul=new Slime("Azul");
        Slime slimeBranco=new Slime("Branco");
    
        this.inimigos.add(slimeAzul);this.inimigos.add(slimeBranco);
    }
}
