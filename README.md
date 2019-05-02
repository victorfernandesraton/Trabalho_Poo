# Trabalho__Poo  

Atividade avaliativa da disciplina Programação Orientada a Objetos  

## Aluno: Victor Fernandes Baião Raton  
## Nº: 029182012  

## Repositório:  
O aplicativo compatível com eclipse projeect encontra-se na diretório rentCar  
As classes estão em: src/com/app/  

## Questão:  

Uma locadora de automóveis precisa de um sistema para automatizar suas atividades. A locadora trabalha da seguinte maneira. Todo cliente é cadastrado pelo CPF, nome, telefone e email. Todo automóvel é cadastrado com placa, modelo, cor, ano, categoria (básico, luxo, superluxo). Clientes podem locar diversos automóveis. Em cada locação é informado o período (data de início e data de término), o automóvel locado e calculado o valor da locação. Este cálculo depende da categoria do automóvel, pois para automóveis básicos (categoria mais simples) cobra-se R$ 120,00 a diária, para automóveis de luxo (categoria intermediária) R$ 160,00 e para automóveis com categoria superluxo (melhor categoria) R$ 210,00.  


## Para o cenário acima, pede-se  
### Fazer o desenho em UML das classes identificadas para resolver o problema  

__R:__ Econtra-se na pasta diagram  

### Definir em Java a estrutura das classes (atributos e construtor com todos os atributos)  

__R:__ Programa na pasta RentCar (padrão eclipse)  

### Criar um método que permita criar um automóvel sem informar a categoria. Neste caso o automóvel deve ser cadastrado com sendo um automóvel básico.  

__R:__ Na classe Car, há a sobrecarga de construtores  

### Construir os métodos gets e sets para todos os atributos de todas as classes  

__R__ Favor verificar o diagrama  

### Suponha que ao chegar à locadora para retirar o automóvel, não havia disponível nenhum automóvel da categoria locada pelo cliente. Neste caso, o sistema deve verificar se o automóvel locado pode ser substituído por outro automóvel. Isso será possível se o outro automóvel for do mesmo ano ou mais novo e se for da mesma categoria.  

__R:__ Na classe Store, método pickCar

### Construir métodos necessários para calcular o valor total de uma locação qualquer  

__R:__ Na classe Rent, método RentCoast  
__OBS:__ Finaliza o aluguel tanbêm  

### Construir métodos para calcular quanto um cliente já gastou em locações até hoje.  

__R:__ Na classe User, método getDebit  

### Construir métodos necessários para saber, dada uma categoria, quantos automóveis desta categoria um cliente já locou até hoje.  

__R:__ Na classe Store, método totalSameCategory  

### Construir os métodos necessários para imprimir os dados de um cliente. Neste caso deve ser impresso todos os dados do cliente (cpf, nome, telefone e email) e todos os dados das locações realizadas pelo cliente (data de inicio, data de término, modelo do automóvel locado, placa do automóvel locado e valor total da locação).  

__R:__ Na classe Store, método userDataPrint 

__Obs. Se for necessário construir métodos para adicionar / remover elementos de um vetor.__
