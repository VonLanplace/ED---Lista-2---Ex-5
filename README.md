<p align="center">
  <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="Java Icon" height="40" width="40">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/vim/vim-original.svg" alt="Vim Icon" height="40" width="40">
</p>

# Estrutura de Dados - Lista 2

## 🗓️ Lista 2

Recursividade

## 💻 Exercício 5

O máximo divisor comum (MDC ou M.D.C) corresponde ao produto dos divisores comuns entre dois ou mais números inteiros. Para calcular o máximo divisor comum (MDC) entre números, devemos realizar a fatoração por meio da decomposição em fatores primos dos números indicados.

Para exempliﬁcar, vamos calcular através da fatoração o MDC do 20 e 24:

Para saber o MDC dos números, devemos olhar à direita da fatoração e ver quais números dividiram, simultaneamente, nas duas colunas e multiplicá-los.
Assim, pela fatoração podemos concluir que o 4 (2 x 2) é o maior número que divide ambos e, portanto, é o máximo divisor comum de 20 e 24.

| | | |
|-|-|-|
|20 |24| 2|
|10 |12| 2|
|5 | 6| 2|
 |5 | 3| 3|
 |5 | 1| 5|
 |1 | 1|MDC(20,24)=2*2=4|


O máximo divisor comum (MDC) de dois números inteiros x e y pode ser calculado usando-se uma deﬁnição recursiva:
- MDC(x, y) = MDC(x − y, y), se x > y
- MDC(x,y) = MDC(y,x)
- MDC(x,x) = x

Fazer uma função recursiva que receba 2 números inteiros posi�vos e apresente o MDC desses números.

## Como Executar

1. Compile o arquivo `.java` usando o terminal.
2. Execute a classe view.Main.

---
