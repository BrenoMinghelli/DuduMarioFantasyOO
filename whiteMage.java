package Alpha02;

import java.util.ArrayList;

/*
Ideia:
    Na mecanica de Heroism, eu poderia ter implementado uma nova variavel 
AtkAtual para todos os personagens e apenas resetar atkAtual=atk no fim do 
combate. Porem, como eh uma mecanica apenas dessa classe, achei que faria mais 
sentido ser guardada apenas aqui, mesmo que fique um pouco mais complexo.
    Dessa forma, a variavel heroismStacks guarda quantas vezes o whiteMage usou
a magiaHeroism em cada personagem. no fim do combate essa variavel eh resetada
e para cada stack os ataques sao diminuidos para os valores antigos.
*/
public class whiteMage extends personagem{
    
    private int magia=7;
    private int mp=10;
    private int mpA=mp;
    
    ArrayList<Integer> heroismStacks=new ArrayList<Integer>();
    
    public whiteMage(String nome){
        super(nome,1,17,5,5);
        for(int i=0;i<4;i++)this.heroismStacks.add(0);
    }
    
    @Override
    public void levelup(){  //mecanica de lvl up, quando acumular X de xp, implementado dps
        this.setLvl(this.getLvl()+1);
        this.setHp(this.getHp()+4);
        this.setAtk(this.getAtk()+1);
        this.setDef(this.getDef()+2);
        this.setHpA(this.getHpA()+4);
        this.setMagia(this.getMagia() + 3);
        this.setMp(this.getMp() + 5);
        this.setMpA(this.getMpA() + 5);
    }
    
    @Override
    public int habilidades(int qualAtaque, ArrayList alvos, int qualAlvo){
        switch (qualAtaque) {
            case 1 -> {
                return this.ataqueBasico((inimigo)alvos.get(qualAlvo));
            }
            case 2 -> {
                if(this.getLvl()>=2){return this.magiaHeal((personagem)alvos.get(qualAlvo));}
                System.out.print("Nivel muito baixo\n");return 0;
            }
            case 3 -> {
                if(this.getLvl()>=5){return this.magiaHeroism(alvos, qualAlvo);}
                System.out.print("Nivel muito baixo\n");return 0;
            }
            case 4 -> {
                if(this.getLvl()>=10){return this.magiaRevive((personagem)alvos.get(qualAlvo));}
                System.out.print("Nivel muito baixo\n");return 0;
            }
            case 5 -> {
                if(this.getLvl()>=15){return this.magiaHolyLight((personagem)alvos.get(qualAlvo));}
                System.out.print("Nivel muito baixo\n");return 0;
            }
            default -> { System.out.print("Ataque Invalido\n");return 0;
            }
        }
    }
    
    public int magiaHeal(personagem personagem){
        if(personagem.taMorto()){System.out.print(personagem.getNome()+"esta morto\n");return 0;}
        int cura;
        if(this.getMpA()<5){
            System.out.print("Mana insuficiente\n");
            return 0;
        }
        System.out.print("HEAL: ");
        this.setMpA(this.getMpA() - 5);
        cura=randomroll.danoroll(5)+this.getMagia();
        personagem.curar(cura);
        
        return cura;
    }
    
    //reseta no fim de cada combate, nao reseta caso o aliado seja morto e revivido (mas posso implementar)
    public int magiaHeroism(ArrayList<personagem> personagens,int qualAlvo){
        if(personagens.get(qualAlvo).taMorto()){System.out.print(personagens.get(qualAlvo).getNome()+"esta morto\n");return 0;}
        if(this.getMpA()<7){
            System.out.print("Mana insuficiente\n");
            return 0;
        }
        System.out.print("HEROISM: ");
        this.setMpA(this.getMpA() - 7);
        this.heroismStacks.set(qualAlvo, this.heroismStacks.get(qualAlvo)+1); //ToDo achar forma melhor de somar 1 ao valor.
        personagens.get(qualAlvo).setAtk((int)(personagens.get(qualAlvo).getAtk()*1.2));
        System.out.print(personagens.get(qualAlvo).getNome()+" aumentou o ataque para "+personagens.get(qualAlvo).getAtk()+"\n");
        return 1;
    }
    
    public int magiaRevive(personagem personagem){
        if(this.getMpA()<(this.getMp()*0.2)){
            System.out.print("Mana insuficiente\n");
            return 0;
        }
        System.out.print("REVIVE: ");
        this.setMpA(this.getMpA() - (int) (this.getMp() * 0.2));
        if(personagem.taMorto())personagem.curar((int)(personagem.getHp()*0.3));
        return 1;
    }
    
    public int magiaHolyLight(personagem personagem){
        if(personagem.taMorto()){System.out.print(personagem.getNome()+"esta morto\n");return 0;}
        int cura;
        if(this.getMpA()<(this.getMp()*0.2)){
            System.out.print("Mana insuficiente\n");
            return 0;
        }
        System.out.print("HOLY LIGHT: ");
        this.setMpA(this.getMpA() - (int) (this.getMp() * 0.2));
        cura=personagem.getHp();
        personagem.curar(cura);
        
        return cura;
    }
    
    public void fimHeroism(ArrayList<personagem> personagens){//mecanica whiteMage
        for(int i=0;i<4;i++){
            for(int j=0;j<this.heroismStacks.get(i);j++)
                personagens.get(i).setAtk((int)(personagens.get(i).getAtk()*0.833333));
        }this.heroismStacks.replaceAll(e -> 0);//reseta o Array para 0
    }
    
    public void showActions(){  //mostra as ações possiveis ao jogador
        System.out.println("1.Ataque basico");
        if(getLvl()>=2){
            System.out.println("2.Heal");
        }if(getLvl()>=5){
            System.out.println("3.Heroism");
        }if(getLvl()>=10){
            System.out.println("4.Revive");
        }if(getLvl()>=15){
            System.out.println("5.Holy Light");
        }
    }
    
    public int getMagia() {return magia;}
    public void setMagia(int magia) {this.magia = magia;}
    public int getMp() {return mp;}
    public void setMp(int mp) {this.mp = mp;}
    public int getMpA() {return mpA;}
    public void setMpA(int mpA) {this.mpA = mpA;}
}