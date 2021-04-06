import java.util.Scanner;
public class combateSlime extends combate{
    protected slime i1;  //esse seria um dos encontros possiveis
    protected slime i2;

    public combateSlime(fighter p1){  //o criador recebe os objetos dos jogares e cria os inimigos ja padronizados
        this.pc1=p1;
        this.i1 = new slime("1");
        this.i2 = new slime("2");

        System.out.println("Slime 1 15/15\nSlime 2 15/15");  //mostrando os inimigos encontrados
    }

    public void criaCombate(){  //gera o combate, com o seu while(true)
        Scanner teclado = new Scanner(System.in);
        int escolha; //variaveis a serem usadas
        int dano;
        int tgt;  //tgt=target do inimigo
        while(true){ //while true pra loopar
            System.out.println("Turno 1:\nDudu Mario");  //primeiro o turno dos pcs, mas pode ter uma maneira de intercalar futuramente
            fighter.showA();  //mostra as ações possiveis pro jogador
            escolha=teclado.nextInt();
            if(escolha==1){  //como por enquanto so tem uma ação, so teria um mas esses blocos de codigo c repetiriam para cada tipo de atk,
                System.out.println("Targets");  // ou poderia apenas mudar no dano
                if(i1.status==true){  //checa se o inimigo esta vivo, para poder mostrar ele como alvo
                    System.out.println("Slime 1:"+i1.hpA+"/"+i1.hp);
                }
                if(i2.status==true){
                    System.out.println("Slime 2:"+i2.hpA+"/"+i2.hp);
                }
                escolha=teclado.nextInt();  //escolhe qual dos inimigos
                if(escolha==1 && i1.status==true){ //se o 1 for escolhido, e ele estiver vivo
                    dano=pc1.dmg(); //atk
                    i1.hpA=i1.hpA-dano;  //causa o dano
                    if(i1.hpA>0){
                        System.out.println("Slime 1:"+i1.hpA+"/"+i1.hp);  //mostra o dano causado
                    }
                    if(i1.hpA<=0){  //c o hp for a 0, o status vira false, e mostra q o inimigo foi derrotado
                        i1.status=false;
                        System.out.println("Inimigo derrotado");
                    }
                }
                if(escolha==2 && i2.status==true){
                    dano=pc1.dmg();
                    i2.hpA=i2.hpA-dano;
                    if(i2.hpA>0){
                        System.out.println("Slime 2:"+i2.hpA+"/"+i2.hp);
                    }
                    if(i2.hpA<=0){
                        i2.status=false;
                        System.out.println("Inimigo derrotado");
                    }
                }
            }
            if(i1.status==false && i2.status==false){  //caso os 2 inimigos sejam derrotados, combate acaba;
                System.out.println("\nCombate finalizado\n");
                return;
            }
            if(escolha==10){  //"alavanca" de controle para testes
                return;
            }
            System.out.println("Turno dos inimigos");  
            if(i1.status==true){  //teriam um if (i2.status==true) abaixo desse, mas preguiça de implementar
                tgt=i1.alvo();  //sorteia o alvo
                if(tgt==1){
                    dano=i1.dano();  //haveria um sorteio de qual atk usar, mas esse inimigo so tem um
                    dano=dano-pc1.def;  //causa o dano, reduzido pela defesa do personagem (obs. eu considerei esse inimigo com 0 de def
                    if(dano<=0){                                                    //mas o dano ali em cima deveria ser implementado assim)
                        dano=0;  //c o dano ficar menor que 0, para nao curar o alvo, vira 0
                    }
                    pc1.hpA=pc1.hpA-dano;  //efetivamente causa o dano no alvo escolhido
                    System.out.println("\n"+pc1.nome+":"+pc1.hpA+"/"+pc1.hp+"\n");  //print o hp do personagem q tomou o dano
                }

            } //no final o loop de while true retorna, e volta ao turno do jogador
        }
    }
}
