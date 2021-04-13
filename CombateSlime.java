package Alpha02;

import java.util.ArrayList;


public class combateSlime extends combate {
    
    public combateSlime(){
        slime slimeAzul=new slime("Azul");
        slime slimeBranco=new slime("Branco");
    
        this.inimigos.add(slimeAzul);this.inimigos.add(slimeBranco);
    }
}

