# 🫧 Bubble Sort em Python
# Autor: Débora Martins (@Debora0Martins)
# Descrição: Algoritmo simples de ordenação que compara pares de elementos
# e os troca de lugar caso estejam fora de ordem.

def bubble_sort(lista):
    n = len(lista)
    for i in range(n):
        # Últimos i elementos já estão ordenados
        for j in range(0, n - i - 1):
            if lista[j] > lista[j + 1]:
                # Troca os elementos
                lista[j], lista[j + 1] = lista[j + 1], lista[j]
    return lista


# 🎯 Exemplo de uso
numeros = [64, 34, 25, 12, 22, 11, 90]
print("Lista original:", numeros)
ordenada = bubble_sort(numeros)
print("Lista ordenada:", ordenada)
