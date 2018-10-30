-- populate the jogador table

INSERT INTO public.jogador(
	id, nome)
	VALUES (1,'Bruno Augusto');

INSERT INTO public.jogador(
	id, nome)
	VALUES (2,'Miguel Araujo');
	
INSERT INTO public.jogador(
	id, nome)
	VALUES (3,'Davi Bras');
	
INSERT INTO public.jogador(
	id, nome)
	VALUES (4,'Arthur Barroso');
	
INSERT INTO public.jogador(
	id, nome)
	VALUES (5,'Pedro Simiao');
	
INSERT INTO public.jogador(
	id, nome)
	VALUES (6,'Gabriel Oliveira');
	
INSERT INTO public.jogador(
	id, nome)
	VALUES (7,'Sophia Marques');
	
INSERT INTO public.jogador(
	id, nome)
	VALUES (8,'Alice Pontes');
	
INSERT INTO public.jogador(
	id, nome)
	VALUES (9,'Julia Vieira');
	
INSERT INTO public.jogador(
	id, nome)
	VALUES (10,'Isabella Rabelo');

	
--populate the mestre table	

INSERT INTO public.mestre(
	id, nome)
	VALUES (1, 'Dimitri Gadelha');

INSERT INTO public.mestre(
	id, nome)
	VALUES (2, 'Bruno Melgaco');

INSERT INTO public.mestre(
	id, nome)
	VALUES (3, 'Lius Palacio');
	
INSERT INTO public.mestre(
	id, nome)
	VALUES (4, 'Lyana Stark');
	
INSERT INTO public.mestre(
	id, nome)
	VALUES (5, 'Dino Thomas');

INSERT INTO public.mestre(
	id, nome)
	VALUES (6, 'Alex Hunter');
	
INSERT INTO public.mestre(
	id, nome)
	VALUES (7, 'Saphira Dragon');
	
INSERT INTO public.mestre(
	id, nome)
	VALUES (8, 'Luna Lovegood');

-- populate the classe table	
	
INSERT INTO public.classe(
	id, nome, dado_de_vida)
	VALUES (1, 'clerigo', 'd8');
	
INSERT INTO public.classe(
	id, nome, dado_de_vida)
	VALUES (2, 'homem de armas', 'd10');
	
INSERT INTO public.classe(
	id, nome, dado_de_vida)
	VALUES (3, 'ladrao', 'd6');
	
INSERT INTO public.classe(
	id, nome, dado_de_vida)
	VALUES (4, 'mago', 'd4');
	
-- populate the idioma table	
	
INSERT INTO public.idioma(
	id, nome)
	VALUES (1, 'Comum');

INSERT INTO public.idioma(
	id, nome)
	VALUES (2,'Anao');
	
INSERT INTO public.idioma(
	id, nome)
	VALUES (3, 'Elfico');
	
INSERT INTO public.idioma(
	id, nome)
	VALUES (4,'Silvestre');
	
INSERT INTO public.idioma(
	id, nome)
	VALUES (5, 'Goblinoide');
	
INSERT INTO public.idioma(
	id, nome)
	VALUES (6, 'Orc');
	
INSERT INTO public.idioma(
	id, nome)
	VALUES (7, 'Gigante');
	
INSERT INTO public.idioma(
	id, nome)
	VALUES (8, 'Draconico');
	
INSERT INTO public.idioma(
	id, nome)
	VALUES (9, 'Antigo');
	
-- populate the raca table	

INSERT INTO public.raca(
	id, nome, tamanho_usual, idade_maturidade, expectativa_de_vida, movimentacao_base, id_idioma)
	VALUES (1, 'Humano', 175, 15, 70, 9, 1);
	
INSERT INTO public.raca(
	id, nome, tamanho_usual, idade_maturidade, expectativa_de_vida, movimentacao_base, id_idioma)
	VALUES (2, 'Anao', 140, 70, 350, 6, 2);
	
INSERT INTO public.raca(
	id, nome, tamanho_usual, idade_maturidade, expectativa_de_vida, movimentacao_base, id_idioma)
	VALUES (3, 'Elfo', 160, 150, 700, 9, 3);
	
INSERT INTO public.raca(
	id, nome, tamanho_usual, idade_maturidade, expectativa_de_vida, movimentacao_base, id_idioma)
	VALUES (4, 'Halfling', 80, 30, 70, 6, 1);
	
	
