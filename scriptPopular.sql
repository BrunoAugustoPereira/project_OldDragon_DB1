-- populate the jogador table

INSERT INTO public.jogador(nome)
	VALUES ('Bruno Augusto');

INSERT INTO public.jogador(nome)
	VALUES ('Miguel Araujo');
	
INSERT INTO public.jogador(nome)
	VALUES ('Davi Bras');
	
INSERT INTO public.jogador(nome)
	VALUES ('Arthur Barroso');
	
INSERT INTO public.jogador(nome)
	VALUES ('Pedro Simiao');
	
INSERT INTO public.jogador(nome)
	VALUES ('Gabriel Oliveira');
	
INSERT INTO public.jogador(nome)
	VALUES ('Sophia Marques');
	
INSERT INTO public.jogador(nome)
	VALUES ('Alice Pontes');
	
INSERT INTO public.jogador(nome)
	VALUES ('Julia Vieira');
	
INSERT INTO public.jogador(nome)
	VALUES ('Isabella Rabelo');

	
--populate the mestre table	

INSERT INTO public.mestre(nome)
	VALUES ('Dimitri Gadelha');

INSERT INTO public.mestre(nome)
	VALUES ('Bruno Melgaco');

INSERT INTO public.mestre(nome)
	VALUES ('Lius Palacio');
	
INSERT INTO public.mestre(nome)
	VALUES ('Lyana Stark');
	
INSERT INTO public.mestre(nome)
	VALUES ('Dino Thomas');

INSERT INTO public.mestre(nome)
	VALUES ('Alex Hunter');
	
INSERT INTO public.mestre(nome)
	VALUES ('Saphira Dragon');
	
INSERT INTO public.mestre(nome)
	VALUES ('Luna Lovegood');

-- populate the classe table	
	
INSERT INTO public.classe(nome, dado_de_vida)
	VALUES ('clerigo', 'd8');
	
INSERT INTO public.classe(nome, dado_de_vida)
	VALUES ('homem de armas', 'd10');
	
INSERT INTO public.classe(nome, dado_de_vida)
	VALUES ('ladrao', 'd6');
	
INSERT INTO public.classe(nome, dado_de_vida)
	VALUES ('mago', 'd4');
	
-- populate the idioma table	
	
INSERT INTO public.idioma(nome)
	VALUES ('Comum');

INSERT INTO public.idioma(nome)
	VALUES ('Anao');
	
INSERT INTO public.idioma(nome)
	VALUES ('Elfico');
	
INSERT INTO public.idioma(nome)
	VALUES ('Silvestre');
	
INSERT INTO public.idioma(nome)
	VALUES ('Goblinoide');
	
INSERT INTO public.idioma(nome)
	VALUES ('Orc');
	
INSERT INTO public.idioma(nome)
	VALUES ('Gigante');
	
INSERT INTO public.idioma(nome)
	VALUES ('Draconico');
	
INSERT INTO public.idioma(nome)
	VALUES ('Antigo');
	
-- populate the raca table	

INSERT INTO public.raca(nome, tamanho_usual, idade_maturidade, expectativa_de_vida, movimentacao_base, id_idioma)
	VALUES ('Humano', 175, 15, 70, 9, 1);
	
INSERT INTO public.raca(nome, tamanho_usual, idade_maturidade, expectativa_de_vida, movimentacao_base, id_idioma)
	VALUES ('Anao', 140, 70, 350, 6, 2);
	
INSERT INTO public.raca(nome, tamanho_usual, idade_maturidade, expectativa_de_vida, movimentacao_base, id_idioma)
	VALUES ('Elfo', 160, 150, 700, 9, 3);
	
INSERT INTO public.raca(nome, tamanho_usual, idade_maturidade, expectativa_de_vida, movimentacao_base, id_idioma)
	VALUES ('Halfling', 80, 30, 70, 6, 1);

	
-- populate the arma table	
	
INSERT INTO public.arma(nome, tipo_de_dano, tamanho, alcance, preco, dano, peso, chance_de_critico)
	VALUES ('adaga', 'PE', 'P', 'arremesso 3/6', 200, '1d4', 500, 2);
	
INSERT INTO public.arma(nome, tipo_de_dano, tamanho, alcance, preco, dano, peso, chance_de_critico)
	VALUES ('cimitara', 'CO', 'M',null, 1500,'1d6', 1500, 2);

INSERT INTO public.arma(nome, tipo_de_dano, tamanho, alcance, preco, dano, peso, chance_de_critico)
	VALUES ('arco curto',null,'P', '15/30', 2500, null, 500, null);
	
INSERT INTO public.arma(nome, tipo_de_dano, tamanho, alcance, preco, dano, peso, chance_de_critico)
	VALUES ('flecha', 'PE','P',null, 700, '1d8', 1500, null);
	
INSERT INTO public.arma(nome, tipo_de_dano, tamanho, alcance, preco, dano, peso, chance_de_critico)
	VALUES ('martelo de batalha', 'IM','G',null,1500, '2d4', 10000, 2);
	
INSERT INTO public.arma(nome, tipo_de_dano, tamanho, alcance, preco, dano, peso, chance_de_critico)
	VALUES ('cajado', 'IM','M', null, 50000, '1d6', 1500, 2);
	
INSERT INTO public.arma(nome, tipo_de_dano, tamanho, alcance, preco, dano, peso, chance_de_critico)
	VALUES ('maca', 'IM','M', null, 600, '1d8', 500, 2);

	
--populate the personagem table

-- Mago halfling 
INSERT INTO public.personagem(nome, nivel, alinhamento, idade, tamanho, forca, destreza, constituicao, sabedoria, carisma, inteligencia, raca, classe, jogador, mestre)
	VALUES ('Altom DownHill', '3', 'Neutro', 35, 75, 9, 12, 13, 10, 11, 14, 4, 4, 1, 1);
	
	--languages spoke by Altom
	INSERT INTO public.idioma_personagem(
		id_personagem, id_idioma)
	VALUES (1, 8);

	INSERT INTO public.idioma_personagem(
		id_personagem, id_idioma)
		VALUES (1, 9);
		
	-- weapons Alton
	
	INSERT INTO public.arsenal_personagem(
	id_personagem, arma)
	VALUES (1, 6);

	INSERT INTO public.arsenal_personagem(
	id_personagem, arma)
	VALUES (1, 1);
	
-- elfo ladrao
INSERT INTO public.personagem(nome, nivel, alinhamento, idade, tamanho, forca, destreza, constituicao, sabedoria, carisma, inteligencia, raca, classe, jogador, mestre)
	VALUES ('Lhoris Greenleaf','2', 'Caotico', 180, 157, 13, 14, 13, 11, 11, 8, 3, 3, 2, 1);
	

	--languages spoke by Lhoris
	INSERT INTO public.idioma_personagem(
		id_personagem, id_idioma)
		VALUES (2, 4);
	
	INSERT INTO public.idioma_personagem(
		id_personagem, id_idioma)
		VALUES (2, 1);
		
		
		
	-- weapons Lhoris	
	INSERT INTO public.arsenal_personagem(
		id_personagem, arma)
		VALUES (2, 1);

	INSERT INTO public.arsenal_personagem(
		id_personagem, arma)
		VALUES (2, 3);
		
	INSERT INTO public.arsenal_personagem(
		id_personagem, arma)
		VALUES (2, 4);
		
	INSERT INTO public.arsenal_personagem(
		id_personagem, arma)
		VALUES (2, 2);
