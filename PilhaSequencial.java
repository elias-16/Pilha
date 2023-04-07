package ED;

public class PilhaSequencial {
	
	private int dados[];
	private int topo;
	private int tamMax;
	
	public PilhaSequencial() {
		tamMax = 20;
		dados = new int[tamMax];
		topo = -1;
		
	}
	
	// Inserir no topo da pilha
	
	public boolean inserirTopo(int valor) {
		
		if(topo == (tamMax -1)) {
			System.out.println("A pilha está cheia!");
			return false;
		}
		topo++;
		dados[topo] = valor;
		return true;
		
	}
	
	// Remover do topo da pilha
	
	public boolean removerTopo() {
		
		if(topo == - 1) {
			System.out.println("A pilha está vazia!");
			return false;
		}
		int valor = dados[topo];
		topo--;
		return true;
		
	}
	
	// Ler o topo da pilha
	
	public boolean lerTopo() {
		
		if(topo == -1) {
			System.out.println("A pilha está vazia!");
			return false;
		}
		System.out.println("Dado do topo: " + dados[topo]);
		return true;
		
	}
	
	// Indicar se a pilha está vazia
	
	public boolean pilhaVazia() {
		
		if(topo == - 1) {
			System.out.println("A pilha está vazia!");
			return true;
		}else {
			System.out.println("A pilha não está vazia!");
			return false;
		}
		
	}
	
	// Retornar o tamanho da pilha
	public int tamanhoPilha() {
		
		System.out.println("Tamanho da pilha: " + (topo+1));
		return topo+1;
		
	}
	
	public static void main (String[] args) {
		
		PilhaSequencial pilha = new PilhaSequencial();
		
		// Testando...
		
		pilha.pilhaVazia();
		pilha.inserirTopo(2);
		pilha.lerTopo();
		pilha.inserirTopo(5);
		pilha.removerTopo();
		pilha.inserirTopo(6);
		pilha.lerTopo();
		pilha.tamanhoPilha();
		
	}
	
}
