package Pilha;

public class PilhaEncadeada {
	
	public class No {
		
		private int dado;
		private No prox;
		
		public No() {
			prox = null;
		}

		public int getDado() {
			return dado;
		}

		public void setDado(int dado) {
			this.dado = dado;
		}

		public No getProx() {
			return prox;
		}

		public void setProx(No prox) {
			this.prox = prox;
		}
	}
	
	private No topo;
	private int quantidade;
	
	public PilhaEncadeada() {
		topo = null;
		quantidade = 0;
	}
	
	// Inserir no topo da pilha
	
	public boolean inserirTopo(int valor) {
		
		No novoNo = new No();
		
		novoNo.setDado(valor);
		novoNo.setProx(topo);
		topo = novoNo;
		quantidade++;
		return true;
			
	}	
	
	// Remover do topo da pilha
	
	public boolean removerTopo() {
		
		if(quantidade == 0) {
			System.out.println("A pilha está vazia!");
			return false;
		}
		
		No novoNo = topo;
		int valor = novoNo.getDado();
		topo = novoNo.getProx();
		quantidade--;
		
		novoNo = null;
		return true;
	}
	
	// Ler o topo da pilha
	
	public boolean lerTopo() {
		
		if(quantidade == 0) {
			System.out.println("A pilha está vazia!");
			return false;
		}
		System.out.println("Dado do topo: " + topo.getDado());
		return true;
		
	}
	
	// Indicar se a pilha está vazia
	
	public boolean pilhaVazia() {
		
		if(quantidade == 0) {
			System.out.println("A pilha está vazia!");
			return true;
		}else {
			System.out.println("A pilha não está vazia!");
			return false;
		}
	}
	
	// Retornar o tamanho da pilha
	
	public int tamanhoPilha() {
		
		System.out.println("Tamanho da pilha: " + quantidade);
		return quantidade;
		
	}
	
	public static void main(String[] args) {
		
		PilhaEncadeada pilha = new PilhaEncadeada();
		
		// Testando...
		
		pilha.pilhaVazia();
		pilha.inserirTopo(4);
		pilha.lerTopo();
		pilha.inserirTopo(10);
		pilha.lerTopo();
		pilha.removerTopo();
		pilha.lerTopo();
		pilha.inserirTopo(8);
		pilha.lerTopo();
		pilha.tamanhoPilha();
		
	}
}
