package Alpha02;

public class combateSlime extends combate {
    
    public combateSlime(){
        slime slimeAzul=new slime("Azul");
        slime slimeBranco=new slime("Branco");
    
        this.inimigos.add(slimeAzul);this.inimigos.add(slimeBranco);
    }
}

