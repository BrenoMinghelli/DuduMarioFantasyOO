package game;

public class CombateFDLS extends Combate{
	public CombateFDLS() {
		FaDoLeandroSertanejo fa1 = new FaDoLeandroSertanejo("Fã Numero #1");
		FaDoLeandroSertanejo fa2 = new FaDoLeandroSertanejo("Fã mais velha");
		FaDoLeandroSertanejo fa3 = new FaDoLeandroSertanejo("Fã mais animada");
		FaDoLeandroSertanejo fa4 = new FaDoLeandroSertanejo("Fã mais agressiva");
		this.inimigos.add(fa1);this.inimigos.add(fa2);this.inimigos.add(fa3);this.inimigos.add(fa4);
		this.xp=300;
		this.nomeI="as fãs do Leandro Sertanejo";
	}
}
