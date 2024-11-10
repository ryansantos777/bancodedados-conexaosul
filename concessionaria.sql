-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 10/11/2024 às 04:32
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `concessionaria`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `clientes`
--

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `clientes`
--

INSERT INTO `clientes` (`id`, `nome`, `cpf`, `email`, `telefone`) VALUES
(3, 'Ana Maria da Silva', '123.456.789-00', 'ana.silva@email.com', '(11) 91234-5678'),
(4, 'João Pedro Almeida', '234.567.890-11', 'joao.almeida@email.com', '(21) 92345-6789'),
(5, 'Marcos Aurélio Souza', '345.678.901-22', 'marcos.souza@email.com', '(31) 93456-7890'),
(6, 'Maria Clara Oliveira', '456.789.012-33', 'maria.oliveira@email.com', '(41) 94567-8901'),
(7, 'Fernanda Lima Santos', '567.890.123-44', 'fernanda.santos@email.com', '(51) 95678-9012'),
(8, 'Lucas Gabriel Moreira', '678.901.234-55', 'lucas.moreira@email.com', '(61) 96789-0123'),
(9, 'Júlia Costa Pereira', '789.012.345-66', 'julia.pereira@email.com', '(71) 97890-1234'),
(10, 'Gabriel Henrique Ramos', '890.123.456-77', 'gabriel.ramos@email.com', '(81) 98901-2345'),
(11, 'Rafael Augusto Rocha', '901.234.567-88', 'rafael.rocha@email.com', '(91) 99012-3456'),
(12, 'Mariana Ferreira', '012.345.678-99', 'mariana.ferreira@email.com', '(85) 98123-4567'),
(13, 'Bruno Matheus Almeida', '123.987.654-00', 'bruno.almeida@email.com', '(82) 99234-5678'),
(14, 'Camila Martins Souza', '234.876.543-11', 'camila.souza@email.com', '(83) 99345-6789'),
(15, 'Felipe Moura Torres', '345.765.432-22', 'felipe.torres@email.com', '(84) 99456-7890'),
(16, 'Amanda Rocha Cardoso', '456.654.321-33', 'amanda.cardoso@email.com', '(86) 99567-8901'),
(17, 'Rodrigo Costa Mendes', '567.543.210-44', 'rodrigo.mendes@email.com', '(87) 99678-9012'),
(18, 'Laura Silva Carvalho', '678.432.109-55', 'laura.carvalho@email.com', '(88) 99789-0123'),
(19, 'Thiago Almeida Lopes', '789.321.098-66', 'thiago.lopes@email.com', '(89) 99890-1234'),
(20, 'Patrícia Gomes Soares', '890.210.987-77', 'patricia.soares@email.com', '(92) 98901-2345'),
(21, 'Matheus Santos Pinto', '901.109.876-88', 'matheus.pinto@email.com', '(93) 97901-2345'),
(22, 'Larissa Cardoso Lima', '012.098.765-99', 'larissa.lima@email.com', '(94) 98901-3456'),
(23, 'Pedro Henrique Barbosa', '123.087.654-00', 'pedro.barbosa@email.com', '(95) 99912-3456'),
(24, 'Gabriela Neves Moreira', '234.076.543-11', 'gabriela.moreira@email.com', '(96) 98823-4567'),
(25, 'Vinícius Oliveira Ramos', '345.065.432-22', 'vinicius.ramos@email.com', '(97) 97734-5678'),
(26, 'Beatriz Andrade Costa', '456.054.321-33', 'beatriz.costa@email.com', '(98) 96645-6789'),
(27, 'Ricardo Araújo Freitas', '567.043.210-44', 'ricardo.freitas@email.com', '(99) 95556-7890');

-- --------------------------------------------------------

--
-- Estrutura para tabela `funcionarios`
--

CREATE TABLE `funcionarios` (
  `id` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `funcionarios`
--

INSERT INTO `funcionarios` (`id`, `nome`, `cpf`, `email`, `telefone`) VALUES
(2, 'João Carlos Almeida', '123.456.789-01', 'joao.almeida@empresa.com', '(11) 98765-4321'),
(3, 'Maria Fernanda Souza', '234.567.890-12', 'maria.souza@empresa.com', '(21) 97654-3210'),
(4, 'Pedro Henrique Lima', '345.678.901-23', 'pedro.lima@empresa.com', '(31) 96543-2109'),
(5, 'Camila Oliveira Santos', '456.789.012-34', 'camila.santos@empresa.com', '(41) 95432-1098'),
(6, 'Rodrigo Pereira Costa', '567.890.123-45', 'rodrigo.costa@empresa.com', '(51) 94321-0987'),
(7, 'Fernanda Martins Silva', '678.901.234-56', 'fernanda.silva@empresa.com', '(61) 93210-9876'),
(8, 'Lucas Gabriel Rocha', '789.012.345-67', 'lucas.rocha@empresa.com', '(71) 92109-8765'),
(9, 'Ana Paula Cardoso', '890.123.456-78', 'ana.cardoso@empresa.com', '(81) 91098-7654'),
(10, 'Thiago Souza Rodrigues', '901.234.567-89', 'thiago.rodrigues@empresa.com', '(91) 90987-6543'),
(11, 'Bianca Ferreira Lima', '012.345.678-90', 'bianca.lima@empresa.com', '(85) 89876-5432'),
(12, 'Marcelo Santos Rocha', '123.987.654-01', 'marcelo.rocha@empresa.com', '(82) 88765-4321'),
(13, 'Juliana Costa Martins', '234.876.543-12', 'juliana.martins@empresa.com', '(83) 87654-3210'),
(14, 'Felipe Oliveira Cruz', '345.765.432-23', 'felipe.cruz@empresa.com', '(84) 86543-2109'),
(15, 'Raquel Almeida Freitas', '456.654.321-34', 'raquel.freitas@empresa.com', '(86) 85432-1098'),
(16, 'Gustavo Silva Mendes', '567.543.210-45', 'gustavo.mendes@empresa.com', '(87) 84321-0987');

-- --------------------------------------------------------

--
-- Estrutura para tabela `veiculos`
--

CREATE TABLE `veiculos` (
  `id` int(11) NOT NULL,
  `modelo` varchar(255) DEFAULT NULL,
  `marca` varchar(255) DEFAULT NULL,
  `ano` int(4) DEFAULT NULL,
  `quilometragem` int(6) DEFAULT NULL,
  `preço` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `veiculos`
--

INSERT INTO `veiculos` (`id`, `modelo`, `marca`, `ano`, `quilometragem`, `preço`) VALUES
(1, 'vectra', 'chevrolet', 1995, 100000, '30000'),
(3, 'Corolla', 'Toyota', 2020, 40000, '85,000'),
(4, 'Civic', 'Honda', 2018, 60000, '78,000'),
(5, 'Gol', 'Volkswagen', 2015, 90000, '40,000'),
(6, 'Onix', 'Chevrolet', 2021, 30000, '65000'),
(7, 'HB20', 'Hyundai', 2019, 50000, '62,000'),
(8, 'Prisma', 'Chevrolet', 2017, 70000, '48,000'),
(9, 'Sandero', 'Renault', 2018, 80000, '45,000'),
(10, 'Ka', 'Ford', 2020, 25000, '52,000'),
(11, 'Uno', 'Fiat', 2016, 100000, '30,000'),
(12, 'Compass', 'Jeep', 2021, 35000, '130,000'),
(13, 'HR-V', 'Honda', 2020, 45000, '105,000'),
(14, 'EcoSport', 'Ford', 2019, 55000, '70,000'),
(15, 'Tracker', 'Chevrolet', 2020, 38000, '95,000'),
(16, 'Renegade', 'Jeep', 2019, 60000, '90,000'),
(17, 'Tucson', 'Hyundai', 2018, 75000, '78,000'),
(18, 'Duster', 'Renault', 2021, 28000, '85,000'),
(19, 'Strada', 'Fiat', 2017, 90000, '48,000'),
(20, 'S10', 'Chevrolet', 2019, 65000, '115,000'),
(21, 'Hilux', 'Toyota', 2020, 50000, '180,000'),
(22, 'Amarok', 'Volkswagen', 2018, 70000, '155,000'),
(23, 'Etios', 'Toyota', 2017, 80000, '42,000'),
(24, 'Fit', 'Honda', 2016, 85000, '55,000'),
(25, 'Cruze', 'Chevrolet', 2020, 30000, '105,000'),
(26, 'Jetta', 'Volkswagen', 2019, 50000, '110,000'),
(27, 'Kicks', 'Nissan', 2018, 70000, '87,000'),
(28, 'Versa', 'Nissan', 2019, 60000, '65,000'),
(29, 'Cobalt', 'Chevrolet', 2017, 75000, '58,000'),
(30, 'Palio', 'Fiat', 2015, 95000, '35,000'),
(31, 'Argo', 'Fiat', 2021, 20000, '72,000'),
(32, 'SW4', 'Toyota', 2020, 45000, '220,000'),
(33, 'Tiguan', 'Volkswagen', 2019, 48000, '135,000'),
(34, 'Pajero', 'Mitsubishi', 2017, 90000, '130,000'),
(35, 'Outlander', 'Mitsubishi', 2018, 65000, '125,000'),
(36, 'ASX', 'Mitsubishi', 2021, 30000, '140,000'),
(37, 'T-Cross', 'Volkswagen', 2020, 35000, '120,000'),
(38, 'Spin', 'Chevrolet', 2018, 75000, '63,000'),
(39, 'Toro', 'Fiat', 2021, 25000, '125,000'),
(40, 'Golf', 'Volkswagen', 2019, 55000, '98,000'),
(41, 'Nivus', 'Volkswagen', 2021, 20000, '110,000');

-- --------------------------------------------------------

--
-- Estrutura para tabela `vendas`
--

CREATE TABLE `vendas` (
  `id` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `id_funcionario` int(11) NOT NULL,
  `id_veiculo` int(11) NOT NULL,
  `data_venda` varchar(255) DEFAULT NULL,
  `valor_venda` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `vendas`
--

INSERT INTO `vendas` (`id`, `id_cliente`, `id_funcionario`, `id_veiculo`, `data_venda`, `valor_venda`) VALUES
(4, 6, 2, 8, '05/08/2024', 48000.00),
(5, 14, 7, 15, '27/10/2024', 95000.00),
(6, 22, 10, 29, '28/03/2024', 58000.00),
(7, 26, 16, 1, '22/07/2024', 30000.00),
(8, 10, 4, 7, '28/02/2024', 62000.00),
(9, 8, 6, 36, '11/09/2024', 140000.00),
(10, 17, 12, 40, '23/05/2024', 98000.00),
(11, 20, 15, 9, '02/09/2024', 45000.00),
(12, 5, 13, 22, '14/12/2023', 155000.00),
(13, 3, 5, 41, '16/04/2024', 110000.00),
(14, 27, 13, 39, '07/08/2024', 125000.00),
(15, 9, 3, 26, '30/01/2024', 110000.00);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Índices de tabela `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Índices de tabela `veiculos`
--
ALTER TABLE `veiculos`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_funcionario` (`id_funcionario`),
  ADD KEY `id_veiculo` (`id_veiculo`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de tabela `funcionarios`
--
ALTER TABLE `funcionarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de tabela `veiculos`
--
ALTER TABLE `veiculos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT de tabela `vendas`
--
ALTER TABLE `vendas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `vendas`
--
ALTER TABLE `vendas`
  ADD CONSTRAINT `vendas_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id`),
  ADD CONSTRAINT `vendas_ibfk_2` FOREIGN KEY (`id_funcionario`) REFERENCES `funcionarios` (`id`),
  ADD CONSTRAINT `vendas_ibfk_3` FOREIGN KEY (`id_veiculo`) REFERENCES `veiculos` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
