--V2: Migration para adicionar a coluna de "phone" na tabela de people

ALTER TABLE tb_people
ADD COLUMN phone VARCHAR(255);