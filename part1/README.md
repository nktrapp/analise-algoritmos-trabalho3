# Lista 06 - Divisao e Conquista (Parte 1)

## Requisitos
- Java 8 ou superior

## Como compilar
```
javac src/Main.java
```

## Como executar
```
java -cp src Main
```

## Entradas
O programa contem exemplos no metodo main para cada questao.

## Testes (JUnit 5)
Baixe o arquivo `junit-platform-console-standalone-1.10.2.jar` e coloque em `lib/`.

### Compilar com testes
```
javac -cp lib/junit-platform-console-standalone-1.10.2.jar src/Main.java test/MainTest.java
```

### Executar testes
```
java -jar lib/junit-platform-console-standalone-1.10.2.jar --class-path src;test --scan-class-path
```
