#language: pt
#enconding: UTF-8

@acessoECompra
Funcionalidade: Acessa ao Sistema e realizar Compra

Cenario: Acessar Site e Fazer Compra de um produto
Dado que eu estou acessando o sistema
E aciono o botao entrar
E informo meu email "emailthebest07@dominio.com"
E informo minha senha "gj123456"
E aciono botao entrar
E aciono o botao home
Quando mover o mouse para produto blouse
E acionar o botao adicionar produto ao carrinho de compras
E acionar botao fazer checkout
E acionar botao fazer chekout no submenu summary
E acionar botao fazer checkout no submenu address
E aciono a caixa de confirmacao de termos de servico
E acionar botao fazer checkout no submenu shipping
E acionar a opcao pay bay bank wire
E acionar botao confirmar pedido 
Entao sistema apresenta tela de confirmacao de pedido