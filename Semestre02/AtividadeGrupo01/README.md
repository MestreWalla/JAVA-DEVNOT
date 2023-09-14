USO DE DIFERENTES TIPOS DE LAYOUTS COM A 
BIBLIOTECA ‘LayoutManager’
Otávio da Rocha
Maycon Vitor Correa 
Gabriel Dias Rocha
Programação Orientada a Objetos em Java
SENAI “Luiz Varga”
Limeira – São Paulo
2023
INTRODUÇÃO
O presente relatório tem como objetivo apresentar e discutir as três 
calculadoras desenvolvidas utilizando diferentes tipos de layouts em Java, 
destacando a importância da escolha do layout adequado na criação de 
interfaces gráficas. As calculadoras em questão são: Calculadora de Custo de 
Viagem, Calculadora de Índice de Massa Corporal (IMC) e Calculadora de 
Regra de Três. 
DESENVOLVIMENTO
Conceitos de Layouts
Layouts referem-se à forma como os componentes (como botões, 
campos de texto e rótulos) são organizados e posicionados em uma tela. Os 
layouts desempenham um papel fundamental na criação de uma experiência 
de usuário eficaz, já que afetam a organização, o alinhamento e a distribuição 
dos elementos na interface.
Existem diversos layouts disponíveis em Java, cada um com suas 
características e usos específicos:
1. BorderLayout: Divide a tela em cinco áreas principais: norte, sul, 
leste, oeste e centro. É útil quando se deseja posicionar elementos 
em regiões específicas da tela.
2. BoxLayout: Organiza os elementos em uma única coluna ou linha, 
tornando-o adequado para layouts simples e lineares.
3. GridLayout: Divide a tela em uma grade de células, onde cada 
célula pode conter um componente. É ideal para criar interfaces 
organizadas em linhas e colunas uniformes.
4. FlowLayout: Os componentes são dispostos em uma única linha, e, 
quando não há mais espaço, são automaticamente movidos para a 
próxima linha. É adequado para criar layouts flexíveis.
5. GridBagLayout: Oferece um alto nível de controle sobre a posição e 
o tamanho dos componentes, permitindo layouts complexos e 
personalizados.
Escolha do Layout Adequado
A escolha do layout adequado é essencial para criar interfaces gráficas 
que sejam eficazes e intuitivas para os usuários. A seleção do layout errado 
pode resultar em interfaces confusas, desorganizadas e difíceis de usar, 
prejudicando a experiência do usuário. Por outro lado, a escolha adequada do 
layout pode proporcionar uma organização lógica dos elementos, facilitar a 
compreensão e melhorar a usabilidade da aplicação.
É importante considerar os seguintes fatores ao escolher um layout:
• Necessidades do Aplicativo: O tipo de aplicativo e suas funcionalidades 
determinarão o layout mais apropriado. Por exemplo, um aplicativo com 
muitos campos de entrada pode se beneficiar de um GridLayout, 
enquanto um aplicativo com um painel de navegação pode usar um 
BorderLayout.
• Usabilidade: O layout deve ser projetado de forma a tornar a interação 
com o aplicativo intuitiva e eficiente.
• Estética: O layout também desempenha um papel na aparência visual 
do aplicativo. A escolha de um layout atraente contribui para uma 
experiência de usuário mais agradável.
• Responsividade: É importante considerar como o layout se adapta a 
diferentes tamanhos de tela e dispositivos, como computadores, tablets 
e smartphones.
Calculadoras Desenvolvidas 
Nesta atividade foram desenvolvidas três calculadoras com diferentes 
layouts em Java:
CALCULADORA DE CUSTO DE VIAGEM
A primeira calculadora desenvolvida permite calcular o custo de uma 
viagem com base no valor do combustível, consumo do veículo e distância do 
trajeto. Para a criação da interface gráfica, foi utilizado o layout BorderLayout, 
que divide a tela em cinco áreas: norte, sul, leste, oeste e centro. A escolha do 
BorderLayout se mostrou adequada para esta calculadora, pois permitiu uma 
disposição clara dos elementos e uma organização intuitiva para o usuário.
CALCULADORA DE ÍNDICE DE MASSA CORPORAL (IMC)
A segunda calculadora permite o cálculo de Índice de Massa Corporal 
(IMC) com base no peso e altura fornecidos pelo usuário. Esta calculadora 
utiliza um GridLayout para organizar os elementos da interface de forma 
organizada em linhas e colunas uniformes. O GridLayout se mostrou 
apropriado, pois atende à necessidade de organizar os campos de entrada de 
peso e altura de forma clara e eficaz
CALCULADORA DE REGRA DE TRÊS
A terceira calculadora é utilizada para resolver problemas de regra de 
três simples. Nesta calculadora, o layout escolhido foi o BoxLayout, que 
organiza os elementos em uma única coluna ou linha. O uso do BoxLayout 
neste caso foi adequado, pois os elementos precisam estar dispostos em uma 
única coluna, tornando a interface limpa e fácil de usar.
Comparação dos Layouts
Essa análise comparativa destaca as semelhanças e diferenças entre os 
layouts usados.
ORGANIZAÇÃO DOS COMPONENTES: Ambos os layouts, 
BorderLayout na Calculadora de Custo de Viagem e BoxLayout na Calculadora 
de Regra de Três, se destacaram em organizar os elementos de forma eficiente. 
O BorderLayout permitiu o alinhamento claro de rótulos e campos de texto em 
diferentes regiões, enquanto o BoxLayout manteve uma organização linear, 
alinhando elementos em uma única coluna o que atende a característica de uma 
calculadora de regra de três simples.
RESPONSIVIDADE: Ambos os layouts utilizados nas calculadoras 
demonstraram uma capacidade adequada de adaptação a diferentes tamanhos 
de janela. O BorderLayout na Calculadora de Custo de Viagem se ajustou bem, 
mantendo a estrutura organizada em várias resoluções de tela. Além disso, na 
Calculadora de Regra de Três, foi utilizado o BoxLayout, que proporcionou uma 
organização linear dos elementos. Na Calculadora de IMC foi utilizado o 
GridLayout, o que oferece uma abordagem versátil, permitindo uma experiência 
de usuário consistente em diversos dispositivos.
USABILIDADE: Tanto o BorderLayout quanto o BoxLayout 
proporcionaram uma experiência de usuário intuitiva. O BorderLayout ofereceu 
uma disposição clara e acessível dos elementos, enquanto o BoxLayout 
simplificou a interação com sua organização linear.
ESTÉTICA: Ambos os layouts mantiveram uma aparência intuitiva e limpa
garantindo que a interface fosse prática e visualmente agradável.
Experiência de Aprendizado
Durante a criação das calculadoras, adquirimos uma compreensão da 
importância da escolha do layout correto para cada tipo de aplicação. Além 
disso, entendemos a importância de comentar o código, pois permite que 
qualquer pessoa possa facilmente entender e modificar o código – inclusive o 
desenvolvedor - garantindo sua acessibilidade e manutenção no futuro. 
Enfrentamos desafios ao longo do processo, e essas dificuldades nos 
proporcionaram uma valiosa experiência que certamente facilitará em certa 
medida o desenvolvimento de projetos futuros. 
Além desses aspectos, também exploramos como trabalhar em 
camadas na organização dos layouts, o que nos proporcionou uma 
compreensão mais profunda sobre como criar a estrutura que nossa aplicação 
demanda. Essa experiência nos deu um conhecimento valioso que poderemos 
aplicar em projetos futuros, tornando-os mais intuitivos, eficazes e de fácil
manutenção.
CONCLUSÃO
A escolha do layout adequado em desenvolvimento de interfaces 
gráficas é um aspecto crítico para garantir que o aplicativo seja funcional, 
eficiente e agradável visualmente. A compreensão dos conceitos de layouts e 
sua aplicação prática são essenciais para criar interfaces que atendam às 
necessidades dos usuários e proporcionem uma experiência de usuário 
positiva. Nos exemplos das calculadoras apresentadas neste relatório, 
pudemos observar como a escolha do layout apropriado desempenhou um 
papel fundamental na organização e usabilidade das interfaces. Essa 
experiência nos preparou para futuros projetos, nos quais a seleção de layouts 
continuará sendo uma consideração crucial.