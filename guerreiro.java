public class guerreiro extends personagem{
    public guerreiro(){
        super("Dudu Mario",1,20,7,5);
    }

    public int cleave(){  //atk diferente do guerreiro, gastando vida
        int dano;
        dano=randomroll.danoroll(10);
        dano=dano+(atk*2);
        hpA=hpA-(lvl*2);
        return dano;
    }
    public void levelup(){  //mecanica de lvl up, quando acumular X de xp, implementado dps
        lvl=lvl+1;
        hp=hp+5;
        atk=atk+3;
        def=def+2;
    }
    public void showActions(){  //mostra as ações possiveis ao jogador
        System.out.println("Turno Guerreiro");
        System.out.println("1.Ataque basico");
        if(lvl>=5){
            System.out.println("2.Cleave");
        }
        if(lvl>=10){
            System.out.println("3.Spin");
        }
    }
}
