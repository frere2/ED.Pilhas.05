package br.edu.fateczl.thiago.pilhas;

public class Pilha {
    No topo;

    public Pilha() {
        topo = null;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public int push(int n) {
        No ntopo = new No();
        ntopo.valor = n;
        ntopo.proximo = topo;
        topo = ntopo;
        return topo.valor;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia!");
        }
        int topv = topo.valor;
        topo = topo.proximo;
        return topv;
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia!");
        }
        return topo.valor;
    }

    public int max() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia!");
        }

        int maxVal = topo.valor;
        No atual = topo;

        while (atual != null) {
            if (atual.valor > maxVal) {
                maxVal = atual.valor;
            }
            atual = atual.proximo;
        }

        return maxVal;
    }
}
