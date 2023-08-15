# ALGORITMO 3

```http
Function BuscaBinaria(x){
    esq = 1 
    dir = n
        enquanto esq <= dir faca{
            meio = ((esq + dir) /2) 
            se A[meio] == x entao 
                devolve meio 
            senao se x > A[meio] entao 
                    esq = meio + 1 
                senao 
                    dir = meio - 1 
            }
            14 devolve -1
        }
```

### Linha 2:
```http
esq = 1
```
Instrução: Inserção de valor

**1 Instrução!**

### Linha 3:
```http
dir = n
```
Instrução: Inserção de valor

**1 Instrução!**

### Linha 4:
```http
enquanto esq <= dir faca{
```
Instrução: Comparação de Valores

**1 Instruçôes!**

### Linha 5:
```http
meio = ((esq + dir) /2)
```
Instrução: Inserção de Valores e Operação Aritmética Simples (Soma)

**2 Instruções!**

### Linha 6:
```http
se A[meio] == x entao
```
Instrução: Acesso da Valor de um Array e Comparação de Valores

**2 Instruções!**

### Linha 7:
```http
devolve meio
```
Instrução: Retorno de valor

**1 Instrução!**

### Linha 8:
```http
senao se x > A[meio] entao
```
Instrução: Acesso da Valor de um Array e Comparação de Valores

**2 Instruções!**

### Linha 9:
```http
esq = meio + 1
```
Instrução: Inserção de Valores e Operação Aritmética Simples (Soma)

**2 Instruções!**

### Linha 11:
```http
dir = meio - 1
```
Instrução: inserção de Valores e Operação Aritmética Simples (Subtração)

**2 Instruções!**

### Total de Instruções:

**Contém 13 instruções no total, mas, no pior caso (dir sendo maior que esq), será o produto de instruções dentro do loop com as de fora do loop, as 14 e o número de interações.**

