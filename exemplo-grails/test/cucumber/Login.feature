# language: pt

Funcionalidade: Login do sistema
    Como um inquilino
    Eu quero entrar no sistema de pagamento de aluguel
    para poder verificar o meu status atual

Cenario: Login de usuário existente
    Dado que eu abra o sistema na página de login
    Quando eu efetuo o login com o usuário "seu-madruga" e senha "don-ramon"
    Entao eu vejo "Aluguel Atrasado" na página
